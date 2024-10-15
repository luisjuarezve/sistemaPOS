package com.superventas.pos;

import com.superventas.pos.model.Cliente;
import com.superventas.pos.persistence.ClienteDAO;
import com.superventas.pos.view.Login;
import com.superventas.pos.view.SuperPOS;

public class POS {

    public static void main(String[] args) {
        SuperPOS sp = new SuperPOS();
        sp.setVisible(true);
    }
}
