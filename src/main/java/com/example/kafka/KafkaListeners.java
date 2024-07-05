package com.example.kafka;


import com.example.kafka.model.PolixisRepository;
import com.example.kafka.model.data.Polixis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @Autowired
    private PolixisRepository repository;

    @KafkaListener(topics = "PolixisTopic", groupId = "groupdId")
    void listener(String data) {
        repository.save(new Polixis(data));
    }
}
