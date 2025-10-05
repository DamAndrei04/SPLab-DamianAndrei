package com.example.splabdamianandrei.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SubChapter {
    private String name;
    private List<Image> images;
    private List<Paragraph> paragraphs;
    private List<Table> tables;

    public SubChapter(String name){
        this.name = name;
        this.images = new ArrayList<>();
        this.paragraphs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }
    public void addImages(String imageName){
        Image image = new Image(imageName);
        images.add(image);
    }
    public void addParagraphs(String paragraphText){
        Paragraph paragraph = new Paragraph(paragraphText);
        paragraphs.add(paragraph);
    }
    public void addTables(String tableTitle){
        Table table = new Table(tableTitle);
        tables.add(table);
    }
}
