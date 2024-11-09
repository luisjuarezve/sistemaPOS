package com.superventas.pos.model;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<ItemCarrito> items;

    public Carrito() {
        this.items = new ArrayList<>();
    }

    public void agregarProducto(Productos producto, Inventario inventario) {
        if (inventario.getCantidad() > 0) {
            for (ItemCarrito item : items) {
                if (item.getProducto().getCodigo() == producto.getCodigo()) {
                    item.setCantidad(item.getCantidad() + 1);
                    item.getInventario().setCantidad(item.getInventario().getCantidad() - 1); // Reduce la cantidad en inventario específico
                    return;
                }
            }
            items.add(new ItemCarrito(producto, 1, inventario));
            inventario.setCantidad(inventario.getCantidad() - 1); // Reduce la cantidad en inventario
        }
    }

    public void disminuirProducto(Productos producto) {
        for (ItemCarrito item : items) {
            if (item.getProducto().getCodigo() == producto.getCodigo()) {
                if (item.getCantidad() > 1) {
                    item.setCantidad(item.getCantidad() - 1);
                } else {
                    items.remove(item);
                }
                item.getInventario().setCantidad(item.getInventario().getCantidad() + 1); // Restaurar la cantidad en inventario específico
                return;
            }
        }
    }

    public double calcularBIG() {
        double total = 0.0;
        for (ItemCarrito item : items) {
            if (item.getProducto().getImpuesto() > 0) {
                total += item.getCantidad() * item.getProducto().getPrecio_venta();
            }
        }
        return total;
    }

    public double calcularExcento() {
        double total = 0.0;
        for (ItemCarrito item : items) {
            if (item.getProducto().getImpuesto() == 0) {
                total += item.getCantidad() * item.getProducto().getPrecio_venta();
            }
        }
        return total;
    }

    public double calcularIVA() {
        double total = 0.0;
        for (ItemCarrito item : items) {
            total += item.getCantidad() * item.getProducto().getPrecio_venta() * item.getProducto().getImpuesto();
        }
        return total;
    }

    public ArrayList<ItemCarrito> getItems() {
        return items;
    }
    
    public void limpiarCarrito() { 
        items.clear(); 
    }
}
