package com.example.splabdamianandrei.model.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Section extends AbstractElement{
    private String title;
    private List<Element> elements;

    public Section(String title, List<Element>elements){
        this.title = title;
        this.elements = new ArrayList<>(elements);
    }
    public Section(String title){
        this.title = title;
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(Element element){
        this.elements.add(element);
    }

    @Override
    public void remove(Element element){
        this.elements.remove(element);
    }

    @Override
    public Element get(int index){
        return this.elements.get(index);
    }

    @Override
    public void print(){
        System.out.println(this.title);
        for(Element e : elements){
            e.print();
        }
    }
}
