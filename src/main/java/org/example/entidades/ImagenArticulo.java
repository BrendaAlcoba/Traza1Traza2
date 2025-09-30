package org.example.entidades;


import lombok.*;
import lombok.experimental.SuperBuilder;




@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder //como no tengo herencia le puedo sacar el super
public class ImagenArticulo {
    private Long id;
    private String name;
    private String url;

}
