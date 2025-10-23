package com.example.splabdamianandrei.model.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Book{
    private String title;
    private List<Author> authors;
    private List<Element> elements;

    public Book(String title, List<Author> authors, List<Element>elements){
        this.title = title;
        this.authors = authors;
        this.elements = new ArrayList<>(elements);
    }
    public Book(String title){
        this.title = title;
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public void addContent(Element element){
        if(elements == null){
            elements = new ArrayList<>();
        }
        elements.add(element);
    }

    public void print(){
        System.out.println("Book: " + this.title + '\n');
        for(Author a : authors){
            a.print();
        }
        for(Element e : elements){
            e.print();
        }
    }
}
