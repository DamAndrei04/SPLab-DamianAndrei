package com.example.splabdamianandrei.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Table extends AbstractElement{
    private String title;

    public void print(){}
}
