package com.superventas.pos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private int cliente_id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private String direccion;
    private String comentarios;
    
    public void limpiar(){
        this.cliente_id = 0;
        this.cedula = "";
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.correoElectronico = "";
        this.direccion = "";
        this.comentarios = "";
    }
    
}
