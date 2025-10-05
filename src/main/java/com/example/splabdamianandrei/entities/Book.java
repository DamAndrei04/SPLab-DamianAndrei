package com.example.splabdamianandrei.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Book {
    private String title;
    private TableOfContents tableOfContents;
    private List<Author> authorsList;
    private List<Chapter> chaptersList;

    public Book(String title, TableOfContents tableOfContents){
        this.title = title;
        this.tableOfContents = tableOfContents;
        this.authorsList = new ArrayList<>();
        this.chaptersList = new ArrayList<>();
    }

    public void addChapter(Chapter chapter){
        chaptersList.add(chapter);
    }

    public void addAuthor(Author author){
        authorsList.add(author);
    }
}
