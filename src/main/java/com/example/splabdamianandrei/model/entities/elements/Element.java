package com.example.splabdamianandrei.model.entities.elements;

public interface Element {
    void add(Element element);
    void remove(Element element);
    Element get(int index);
    void print();
}
