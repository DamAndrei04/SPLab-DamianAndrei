package com.example.splabdamianandrei.model.alignment;

import com.example.splabdamianandrei.model.entities.elements.Paragraph;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AlignLeft implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph){
        System.out.println(paragraph.getText());
    }


}
