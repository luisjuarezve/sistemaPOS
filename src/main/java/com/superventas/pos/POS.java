package com.superventas.pos;

import com.superventas.pos.model.Empleados;
import com.superventas.pos.model.Inventario;
import com.superventas.pos.model.Rol;
import com.superventas.pos.persistence.EmpleadosDAO;
import com.superventas.pos.persistence.InventarioDAO;
import com.superventas.pos.view.Login;
import com.superventas.pos.view.SuperPOS;
import com.superventas.pos.view.components.CrearCliente;
import com.superventas.pos.view.menus.PanelProductos;
import java.awt.Dimension;



public class POS {

    public static void main(String[] args) {
        Login lg = new Login();
        lg.setVisible(true);
    }
}
