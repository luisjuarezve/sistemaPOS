
package com.superventas.pos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventario {
     private int id;
     private double cantidad;
     private double inventario_min;
     private double inventario_max;
     private int producto_id;
     
}
