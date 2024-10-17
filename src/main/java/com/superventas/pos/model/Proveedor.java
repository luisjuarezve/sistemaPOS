package com.superventas.pos.model;

import java.sql.Date;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {
    private int proveedor_id;
    private char tipo_doc;
    private String nro_doc;
    private String razon_social;
    private String telefono;
    private String direccion;
    private String correo_electronico;
    private LocalDate fecha_registro;
    private String encargado;
    private String telefono_encargado;
    private String comentario;
    private String tipo_pago;
}
