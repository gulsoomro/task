package com.infosecurity.task.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infosecurity.task.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    // private KafkaTemplate<String,String> KTemplate;
    //private KafkaTemplate<String, User> kafkaTemplate;
    private KafkaTemplate<String, Log> kafkaTemplate;

    private static final String TOPIC = "Kafka_Example";


    @GetMapping("/publish")
    public String post() {

        Log logg = new Log();
        try {
            logg = JsonToJavaObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("producer");
        System.out.println("showing " + logg.getSource().getOrigin().getIp());
        kafkaTemplate.send(TOPIC, logg);
        return "Published successfully";
    }

    // return in object form
    public Log JsonToJavaObject() throws Exception {
        Log logM = new Log();
        try {
            ObjectMapper mapper = new ObjectMapper();
            logM = mapper.readValue(new File("D:\\jsonfiles\\logs.txt"), Log.class);
            System.out.println(logM);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logM;
    }

    //return in list format
    public List<Log> JsontoJava() throws Exception {
        List<Log> list = null;
        Log logM = new Log();
        try {
            ObjectMapper mapper = new ObjectMapper();
            list = Arrays.asList(mapper.readValue(new File("D:\\jsonfiles\\logs.txt"), Log.class));
            for (int i = 0; i < list.size(); i++) {
                System.out.println(" " + list.get(i));
            }
            System.out.println("List " + list.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
