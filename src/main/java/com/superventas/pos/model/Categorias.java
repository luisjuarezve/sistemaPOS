package com.superventas.pos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorias {
    private int categoria_id;
    private String nombre;
    private String descripcion;
}
