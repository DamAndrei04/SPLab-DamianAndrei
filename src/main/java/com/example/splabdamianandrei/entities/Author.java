package com.example.splabdamianandrei.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.SQLOutput;

@Data
@AllArgsConstructor
public class Author {
    private String name;
    private String surname;

    public void print(){
        System.out.println("Authors: \nAuthor: " + this.name + " " + this.surname + '\n');
    }
}
