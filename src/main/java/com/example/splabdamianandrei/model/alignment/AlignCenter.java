package com.example.splabdamianandrei.model.alignment;

import com.example.splabdamianandrei.model.entities.Paragraph;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AlignCenter implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph){
        System.out.printf("%50s%n", paragraph.getText());
    }


}
