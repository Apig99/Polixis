package com.example.kafka.model;


import com.example.kafka.model.data.Polixis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolixisRepository extends JpaRepository<Polixis, Integer> {

}
