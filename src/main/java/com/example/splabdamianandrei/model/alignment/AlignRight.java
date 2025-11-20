package com.example.splabdamianandrei.model.alignment;

import com.example.splabdamianandrei.model.entities.elements.Paragraph;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AlignRight implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph){
        System.out.printf("%100s%n", paragraph.getText());
    }

}
