package com.example.kafka.model.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "polixis_table")
@Getter
@Setter
@NoArgsConstructor
public class Polixis {

    public Polixis(String message) {
        this.message = message;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String message;


}
