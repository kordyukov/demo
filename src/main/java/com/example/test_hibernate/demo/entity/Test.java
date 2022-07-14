package com.example.test_hibernate.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "test")
@Getter
@Setter
@ToString
public class Test implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
        @Column(name = "id")
        private int id;

        @Column(name = "name")
        private String name;

        @Column(name = "fio")
        private String fio;

}
