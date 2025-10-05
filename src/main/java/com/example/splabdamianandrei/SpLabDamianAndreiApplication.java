package com.example.splabdamianandrei;

import com.example.splabdamianandrei.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpLabDamianAndreiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpLabDamianAndreiApplication.class, args);

        Author author1 = new Author("1st Author");
        Author author2 = new Author("2nd Author");

        TableOfContents tableOfContents1 = new TableOfContents();

        Table table1 = new Table("table1");
        Table table2 = new Table("table2");

        SubChapter subChapter1 = new SubChapter("1st SubChapter");
        subChapter1.addImages("1st Image");
        subChapter1.addParagraphs("1st Paragraph");
        subChapter1.addParagraphs("2nd Paragraph");
        subChapter1.addTables("1st Table");

        Chapter chapter1 = new Chapter("1st Chapter");
        chapter1.addSubChapter(subChapter1);

        Book book1 = new Book("1st Book", tableOfContents1);
        book1.addAuthor(author1);
        book1.addAuthor(author2);
        book1.addChapter(chapter1);

        System.out.println(book1);

    }

}
