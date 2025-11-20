package com.example.splabdamianandrei.model.entities;

import com.example.splabdamianandrei.model.entities.elements.BaseElement;
import com.example.splabdamianandrei.model.entities.elements.Element;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book{
    @Id
    private Integer id;

    private String title;

    @ManyToMany
    private List<Author> authors;

    @OneToMany(targetEntity = BaseElement.class)
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
