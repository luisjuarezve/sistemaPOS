/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.superventas.pos.persistence;

import com.superventas.pos.model.Detalle_nota_entrega;
import com.superventas.pos.model.Notas_de_entrega;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Notas_de_entregaDAO {
    public void insertarNotasDeEntrega(Notas_de_entrega notaDeEntrega) {
    String sql = "INSERT INTO NOTAS_DE_ENTREGA (CLIENTE_ID, CAJERO_ID, ESTADO_PAGO, FECHA, SUBTOTAL, IMPUESTO, TOTAL) VALUES (?, ?, ?, ?, ?, ?, ?)";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, notaDeEntrega.getCliente_id());
        pstmt.setInt(2, notaDeEntrega.getCajero_id());
        pstmt.setString(3, notaDeEntrega.getEstado_pago());
        pstmt.setString(4, notaDeEntrega.getFecha().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        pstmt.setDouble(5, notaDeEntrega.getSubtotal());
        pstmt.setDouble(6, notaDeEntrega.getImpuesto());
        pstmt.setDouble(7, notaDeEntrega.getTotal());

        int filasInsertadas = pstmt.executeUpdate();
        if (filasInsertadas > 0) {
            System.out.println("Nota de entrega insertada correctamente.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al insertar la nota de entrega");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
     public Notas_de_entrega leerNotas_de_entrega(String nota_id) {
    Notas_de_entrega notas_de_entrega = null;
    String sql = "SELECT * FROM NOTAS_DE_ENTREGA WHERE NOTA_ID = ?";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, nota_id);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            // Assuming the table DETALLE_NOTA_ENTREGA has the columns NOTA_ID, PRODUCTO_ID, CANTIDAD, PRECIO_UNITARIO, IMPUESTO
            int nota_Id = rs.getInt("NOTA_ID");
            int cliente_id = rs.getInt("CLIENTE_ID");
            int cajero_id = rs.getInt("CAJERO_ID");
            String estado_pago = rs.getString("ESTADO_PAGO");
            LocalDate fecha = rs.getObject("FECHA",LocalDate.class);
            double subtotal = rs.getDouble("SUBTOTAL");
            double impuesto = rs.getDouble("IMPUESTO");
            double total = rs.getDouble("TOTAL");
          
            notas_de_entrega= new Notas_de_entrega(nota_Id, cliente_id, cajero_id, estado_pago, fecha, subtotal, impuesto, total);
        } else {
            System.out.println(" Nota de entrega no encontrado.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al leer la nota de entrega");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return notas_de_entrega;
}
 public List<Notas_de_entrega> leerTodosNotas_de_entrega() {
    List<Notas_de_entrega> notas_de_entregas = new ArrayList<>();
    String sql = "SELECT * FROM NOTAS_DE_ENTREGA";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
           
           int nota_Id = rs.getInt("NOTA_ID");
            int cliente_id = rs.getInt("CLIENTE_ID");
            int cajero_id = rs.getInt("CAJERO_ID");
            String estado_pago = rs.getString("ESTADO_PAGO");
            LocalDate fecha = rs.getObject("FECHA",LocalDate.class);
            double subtotal = rs.getDouble("SUBTOTAL");
            double impuesto = rs.getDouble("IMPUESTO");
            double total = rs.getDouble("TOTAL");
           Notas_de_entrega NotaDeEntrega= new Notas_de_entrega(nota_Id, cliente_id, cajero_id, estado_pago, fecha, subtotal, impuesto, total);
            notas_de_entregas.add(NotaDeEntrega);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al obtener el Nota de entrega");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return notas_de_entregas;
}
 public void modificarNotas_de_entrega(String nota_id, Notas_de_entrega notaDeEntrega) {
    String sql = "UPDATE NOTAS_DE_ENTREGA SET  CLIENTE_ID = ?, CAJERO_ID = ?, ESTADO_PAGO  =?, FECHA =?, SUBTOTAL =?, IMPUESTO =?, TOTAL=? WHERE NOTA_ID = ?";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, notaDeEntrega.getCliente_id());
        pstmt.setInt(2, notaDeEntrega.getCajero_id());
        pstmt.setString(3, notaDeEntrega.getEstado_pago());
        pstmt.setString(4, notaDeEntrega.getFecha().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        pstmt.setDouble(5, notaDeEntrega.getSubtotal());
        pstmt.setDouble(6, notaDeEntrega.getImpuesto());
        pstmt.setDouble(7, notaDeEntrega.getTotal());
        pstmt.setString(8, nota_id);
        int filasActualizadas = pstmt.executeUpdate();
        if (filasActualizadas > 0) {
            System.out.println("Nota de entrega modificado exitosamente.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al modificar el Nota de entrega");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
     public void eliminarNotas_de_entrega(String nota_id){
        String sql = "DELETE FROM NOTAS_DE_ENTREGA WHERE NOTA_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, nota_id);
            int filasEliminadas = pstmt.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Nota de entrega eliminado correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar el Nota de entrega");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                cn.closeConnection(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
 
 
}
