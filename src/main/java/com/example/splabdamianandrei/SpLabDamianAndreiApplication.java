package com.example.splabdamianandrei;

import com.example.splabdamianandrei.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;

@SpringBootApplication
public class SpLabDamianAndreiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpLabDamianAndreiApplication.class, args);

        Book noapteBuna = new Book();
        noapteBuna.setTitle("Noapte buna, copii!");
        noapteBuna.setAuthors(new ArrayList<>());
        noapteBuna.getAuthors().add(new Author("Radu Pavel Gheo", ""));
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));
        noapteBuna.print();

    }

}
