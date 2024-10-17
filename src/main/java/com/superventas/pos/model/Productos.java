package com.superventas.pos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productos {
    private int producto_id;
    private int codigo;
    private String nombre;
    private String descripcion;
    private String foto;
    private String tipo_venta;
    private double precio_compra;
    private double ganancia;
    private double precio_venta;
    private double precio_mayoreo;
    private double impuesto;
    private int proveedor_id;
    private int categoria_id;
    
        
    }