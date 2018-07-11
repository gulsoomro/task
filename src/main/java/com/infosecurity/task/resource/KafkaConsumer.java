package com.infosecurity.task.resource;

import com.infosecurity.task.model.Log;
import com.infosecurity.task.model.TorIpsEntity;
import com.infosecurity.task.model.TorModel;
import com.infosecurity.task.repository.TorIpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaConsumer {

    @Autowired
    private KafkaTemplate<String, Log> kafkaTemplate;
    @Autowired
    TorIpRepository torIpRepository;

    public boolean tor = true;
    Log logModel;

    TorModel tM = new TorModel();

    @KafkaListener(topics = "Kafka_Example", groupId = "group_id",
            containerFactory = "userKafkaListenerFactory")
//    @SendToUser("/user/topic")
    public void consumeJson(Log log) throws Exception {
        System.out.println("consumer");
        Thread.sleep(1000);
        TorIpsEntity torIpsEntity = new TorIpsEntity();
        String ip = null;
        logModel = log;
        ip = log.getSource().getOrigin().getIp();
        torIpsEntity = torIpRepository.findAllByIp(ip);
        System.out.println(torIpsEntity);

        if (torIpsEntity == null) {
            tM.setTor(false);
            logModel.getSource().getOrigin().setTor(tM);
            System.out.println("hello entering 1");
        } else {
            System.out.println("hello entering 2");
            tM.setTor(true);
            logModel.getSource().getOrigin().setTor(tM);
        }
        kafkaTemplate.send("EnrichedTopic", logModel);
        System.out.println("Consumed JSON Message LogModel: " + logModel.getSource().getOrigin().getIp());
        System.out.println("Consumed JSON Message: " + log.getSource().getOrigin().getIp());

    }

    @KafkaListener(topics = "EnrichedTopic", groupId = "group_id",
            containerFactory = "userKafkaListenerFactory")
//    @SendToUser("/user/topic")
    public void consumeJsonEnriched(Log log) throws Exception {
        System.out.println("consumer");
        Thread.sleep(1000);

        System.out.println(log.getSource().getOrigin().getTor().isTor());
        System.out.println("Consumed JSON Enriched Message: " + log.getSource().getOrigin().getIp());
    }


}
