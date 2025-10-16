package com.example.splabdamianandrei.entities;

import com.example.splabdamianandrei.alignment.AlignStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Paragraph extends AbstractElement {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text){
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy, Paragraph paragraph){
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void print(){
        if(alignStrategy != null){
            alignStrategy.render(this);
        } else {
            System.out.println(text);
        }
    }

}
