package com.example.splabdamianandrei.model.entities.elements;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class BaseElement extends AbstractElement{

    @Id
    private Long id;
}
