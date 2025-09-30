package org.example.entidades;


import lombok.*;
import lombok.experimental.SuperBuilder;


import java.util.HashSet;
import java.util.Set;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

@SuperBuilder //Podría haberlo dejado en builder porque no hereda
public class Categoria {
    private Long id;
    private String denominacion;
    private boolean esInsumo;



    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();//acá termina el modelo
//Recursividad

    @Builder.Default
    private Set<Categoria> subCategorias = new HashSet<>();

    private Categoria categoriaPadre;

}
