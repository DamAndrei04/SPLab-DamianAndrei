package com.example.splabdamianandrei;

import com.example.splabdamianandrei.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;

@SpringBootApplication
public class SpLabDamianAndreiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpLabDamianAndreiApplication.class, args);

        Book book1 = new Book();
        book1.setTitle("Book title");
        book1.setAuthors(new ArrayList<>());
        book1.getAuthors().add(new Author("1st Author's Name", "1st Author's Surname"));
        book1.getAuthors().add(new Author("2nd Author's Name", "2nd Author's Surname"));

        Section section1 = new Section("1st Chapter");
        Section section2 = new Section("2nd Chapter");
        Section section3 = new Section("3rd Chapter");

        book1.addData(new Paragraph("1st Paragraph"));
        book1.addData(section1);
        section1.add(new Paragraph("2nd Paragraph"));
        section1.add(section2);
        section1.add(new Image("1st Image"));
        section1.add(new Table("1st Table"));
        section2.add(new Paragraph("3rd Paragraph"));
        section2.add(section3);
        section3.add(new Paragraph("4th Paragraph"));
        section3.add(new Image("2st Image"));

        System.out.println(book1);

    }

}
