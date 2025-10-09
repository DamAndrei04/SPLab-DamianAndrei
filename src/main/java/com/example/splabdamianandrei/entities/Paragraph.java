package com.example.splabdamianandrei.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Paragraph extends AbstractElement {
    private String text;

    public void print(){
        System.out.println("Paragraph: " + this.text);
    }
}
