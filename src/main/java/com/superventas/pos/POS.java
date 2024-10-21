package com.superventas.pos;

import com.superventas.pos.model.Inventario;
import com.superventas.pos.persistence.InventarioDAO;
import com.superventas.pos.view.SuperPOS;


public class POS {

    public static void main(String[] args) {
        SuperPOS sp = new SuperPOS();
        sp.setVisible(true);
        
    }
}
