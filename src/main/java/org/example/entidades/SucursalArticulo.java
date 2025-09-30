package org.example.entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
public class SucursalArticulo {
    private Long id;

    private Sucursal sucursal;
    private Articulo articulo;

    private Integer stock;
    private Double precioVenta; // precio en esa sucursal
}
