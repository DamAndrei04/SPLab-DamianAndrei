package com.example.splabdamianandrei.entities;

public interface Element {
    void add(Element element);
    void remove(Element element);
    Element get(int index);
}
