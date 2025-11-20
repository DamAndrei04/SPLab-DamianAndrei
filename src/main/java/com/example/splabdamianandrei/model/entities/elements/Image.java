package com.example.splabdamianandrei.model.entities.elements;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image extends BaseElement{
    private String url;

    @Override
    public void print(){
        System.out.println("Image with name: " + this.url);
    }
}
