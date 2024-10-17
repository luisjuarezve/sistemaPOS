package com.superventas.pos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleados {
    private int empleado_id;
    private int rol_id;
    private String nombre;
    private String apellido;
    private String correo_electronico;
    private String usuario;
    private String contrasena;
    
}
