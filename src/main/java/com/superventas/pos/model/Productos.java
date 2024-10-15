package com.superventas.pos.model;

public class Productos {
    int producto_id;
    int codigo;
    String nombre;
    String descripcion;
    String foto;
    String tipo_venta;
    double precio_compra;
    double ganancia;
    double precio_venta;
    double precio_mayoreo;
    double impuesto;
    Proveedor proveedor_id;
    Categorias categoria_id;
}
