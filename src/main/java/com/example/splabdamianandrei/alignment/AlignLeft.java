package com.example.splabdamianandrei.alignment;

import com.example.splabdamianandrei.entities.Paragraph;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Context;
import java.sql.SQLOutput;

@Data
@NoArgsConstructor
public class AlignLeft implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph){
        System.out.println(paragraph.getText());
    }


}
