
package com.superventas.pos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detalle_nota_entrega {
    private int detalle_id;
    private int nota_id;
    private int producto_id;
    private double cantidad;
    private double precio_unitario;
    private double impuesto;
}
