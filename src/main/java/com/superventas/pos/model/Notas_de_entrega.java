
package com.superventas.pos.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notas_de_entrega {
    private int nota_id;
    private int cliente_id;
    private int cajero_id;
    private String estado_pago;
    private LocalDate fecha;
    private double subtotal;
    private double impuesto;
    private double total;
}
