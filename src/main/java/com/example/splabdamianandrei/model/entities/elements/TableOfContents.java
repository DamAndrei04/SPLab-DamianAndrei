package com.example.splabdamianandrei.model.entities.elements;

import jakarta.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class TableOfContents extends BaseElement{
    public void print(){}
}
