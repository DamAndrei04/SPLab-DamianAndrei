package com.example.splabdamianandrei.alignment;

import com.example.splabdamianandrei.entities.Paragraph;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Context;

@Data
@NoArgsConstructor
public class AlignRight implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph){
        System.out.printf("%100s%n", paragraph.getText());
    }

}
