package com.superventas.pos.model;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<ItemCarrito> items;
    private Inventario inventario;
    
    public Carrito() {
        this.items = new ArrayList<>();
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void agregarProducto(Productos producto, Inventario inventario) {
        this.inventario = inventario;
        if (inventario.getCantidad()>0) {
            for (ItemCarrito item : items) {
                if (item.getProducto().getCodigo() == producto.getCodigo()) {
                    // Si el producto ya está en el carrito, aumenta la cantidad
                    item.setCantidad(item.getCantidad() + 1);
                    inventario.setCantidad(inventario.getCantidad() - 1); // Reduce la cantidad en inventario
                    System.out.println("Cantidad en inventario de: "+inventario.getCantidad());
                    return;
                }
            }
            items.add(new ItemCarrito(producto, 1));
            inventario.setCantidad(inventario.getCantidad() - 1); // Reduce la cantidad en inventario
        }
    }

    public void disminuirProducto(Productos producto) {
        for (ItemCarrito item : items) {
            if (item.getProducto().getCodigo() == producto.getCodigo()) {
                // Si la cantidad es mayor que 1, disminuye la cantidad
                if (item.getCantidad() > 1) {
                    item.setCantidad(item.getCantidad() - 1);
                } else {
                    // Si la cantidad es 1, elimina el producto del carrito
                    items.remove(item);
                }
                // Restaurar la cantidad en inventario
                inventario.setCantidad(inventario.getCantidad() + 1);
                return;
            }
        }
    }
    
    public ArrayList<ItemCarrito> getItems() {
        return items;
    }
    
}
