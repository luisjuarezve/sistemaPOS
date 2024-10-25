package com.superventas.pos.model;

public class ItemCarrito {
    private Productos producto;
    private int cantidad;
    private Inventario inventario;

    public ItemCarrito(Productos producto, int cantidad, Inventario inventario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.inventario = inventario;
    }

    public Productos getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Inventario getInventario() {
        return inventario;
    }
}
