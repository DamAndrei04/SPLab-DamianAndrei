package com.example.splabdamianandrei.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author {

    @Id
    private Long id;

    private String name;

    private String surname;

    public void print(){
        System.out.println("Authors: \nAuthor: " + this.name + " " + this.surname + '\n');
    }
}
