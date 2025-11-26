package com.example.splabdamianandrei.model.entities.elements;

import com.example.splabdamianandrei.model.alignment.AlignStrategy;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Paragraph extends BaseElement {
    private String text;

    @Transient
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
