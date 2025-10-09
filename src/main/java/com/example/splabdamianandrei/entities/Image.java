package com.example.splabdamianandrei.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Image extends AbstractElement{
    private String url;

    @Override
    public void print(){
        System.out.println("Image with name: " + this.url);
    }
}
