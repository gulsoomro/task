package com.infosecurity.task.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infosecurity.task.model.Log;

import com.infosecurity.task.model.TorIpsEntity;
import com.infosecurity.task.repository.TorIpRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("file")
public class ReadFileController {

    @Autowired
    TorIpRepository torIpRepository;

   /* @RequestMapping("/readf")
    public Log JsontoJavaObject() throws Exception {
        Log logM = new Log();
        try {
            ObjectMapper mapper = new ObjectMapper();
            logM = mapper.readValue(new File("D:\\jsonfiles\\logs.txt"), Log.class);
            System.out.println(logM);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logM;
    }*/

    @RequestMapping("/getall")
    public List<TorIpsEntity> GetAllFromDB() throws Exception {

        String ip = "181.214.87.4";
        List<TorIpsEntity> list = new ArrayList<>();

        list = torIpRepository.findAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("DB List : " + i + " " + list.get(i).getIp());
        }
        return list;
    }

    @RequestMapping("/getbyip")
    public TorIpsEntity GetByIpFromDB() throws Exception {
        TorIpsEntity torIpsEntity = new TorIpsEntity();
        String ip = "103.234.220.195";
        torIpsEntity = torIpRepository.findAllByIp(ip);
        System.out.println("DB Data extract : " + torIpsEntity);
        return torIpsEntity;
    }
}
