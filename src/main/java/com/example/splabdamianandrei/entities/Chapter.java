package com.example.splabdamianandrei.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class Chapter {
    private String name;
    private List<SubChapter> subChapterList;

    public Chapter(String name){
        this.name = name;
        this.subChapterList = new ArrayList<>();
    }

    public void addSubChapter(SubChapter subchapter){
        subChapterList.add(subchapter);
    }
}
