
package com.superventas.pos.persistence;

import com.superventas.pos.model.Detalle_nota_entrega;
import com.superventas.pos.model.Inventario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Detalle_nota_entregaDAO {
     public void insertarDetalle_nota_entrega(Detalle_nota_entrega detalle_nota_entrega) {
        String sql = "INSERT INTO DETALLE_NOTA_ENTREGA ( NOTA_ID, PRODUCTO_ID, CANTIDAD, PRECIO_UNITARIO, IMPUESTO) VALUES (?, ?, ?, ?, ?)";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            
            pstmt.setInt(1, detalle_nota_entrega.getNota_id());
            pstmt.setInt(2, detalle_nota_entrega.getProducto_id());
            pstmt.setDouble(3, detalle_nota_entrega.getCantidad());
            pstmt.setDouble(4, detalle_nota_entrega.getPrecio_unitario());
            pstmt.setDouble(5, detalle_nota_entrega.getImpuesto());
            

            int filasInsertadas = pstmt.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Detalle de nota de entrega insertado correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar el Detalle de nota de entrega");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                cn.closeConnection(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
     
   public Detalle_nota_entrega leerDetalleNotaEntrega(String detalle_id) {
    Detalle_nota_entrega detalle_nota_entrega = null;
    String sql = "SELECT * FROM DETALLE_NOTA_ENTREGA WHERE DETALLE_ID = ?";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, detalle_id);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            // Assuming the table DETALLE_NOTA_ENTREGA has the columns NOTA_ID, PRODUCTO_ID, CANTIDAD, PRECIO_UNITARIO, IMPUESTO
            int notaId = rs.getInt("NOTA_ID");
            int productoId = rs.getInt("PRODUCTO_ID");
            double cantidad = rs.getDouble("CANTIDAD");
            double precioUnitario = rs.getDouble("PRECIO_UNITARIO");
            double impuesto = rs.getDouble("IMPUESTO");

            detalle_nota_entrega = new Detalle_nota_entrega(Integer.parseInt(detalle_id), notaId, productoId, cantidad, precioUnitario, impuesto);
        } else {
            System.out.println("Detalle de nota de entrega no encontrado.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al leer el detalle de la nota de entrega");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return detalle_nota_entrega;
}

     public List<Detalle_nota_entrega> leerTodosDetalle_nota_entrega() {
    List<Detalle_nota_entrega> detalle_nota_entrega = new ArrayList<>();
    String sql = "SELECT * FROM DETALLE_NOTA_ENTREGA";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int detalle_id = rs.getInt("DETALLE_ID"); // Assuming your INVENTARIO table has an ID column
            int nota_id = rs.getInt("NOTA_ID");
            int producto_id = rs.getInt("PRODUCTO_ID");
            double cantidad = rs.getDouble("CANTIDAD");
            double precio_unitario = rs.getDouble("PRECIO_UNITARIO");
            double impuesto = rs.getDouble("IMPUESTO");

            Detalle_nota_entrega DetalleNotaEntrega= new Detalle_nota_entrega(detalle_id, nota_id, producto_id, cantidad, precio_unitario, impuesto);
            detalle_nota_entrega.add(DetalleNotaEntrega);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al obtener el Detalle_nota_entrega");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return detalle_nota_entrega;
}
     
     public void modificarDetalle_nota_entrega(String detalle_id, Detalle_nota_entrega detalle_nota_entrega) {
    String sql = "UPDATE DETALLE_NOTA_ENTREGA SET NOTA_ID = ?, PRODUCTO_ID = ?, CANTIDAD = ?, PRECIO_UNITARIO =?, IMPUESTO=? WHERE DETALLE_ID = ?";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, detalle_nota_entrega.getNota_id());
        pstmt.setInt(2, detalle_nota_entrega.getProducto_id());
        pstmt.setDouble(3, detalle_nota_entrega.getCantidad());
        pstmt.setDouble(4, detalle_nota_entrega.getPrecio_unitario());
        pstmt.setDouble(5, detalle_nota_entrega.getImpuesto());
        pstmt.setString(6, detalle_id);
        int filasActualizadas = pstmt.executeUpdate();
        if (filasActualizadas > 0) {
            System.out.println("Detalle_nota_entrega modificado exitosamente.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al modificar el Detalle_nota_entrega");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
     public void eliminarDetalle_nota_entrega(String detalle_id){
        String sql = "DELETE FROM DETALLE_NOTA_ENTREGA WHERE DETALLE_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, detalle_id);
            int filasEliminadas = pstmt.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Detalle_nota_entrega eliminado correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar el Detalle_nota_entrega");
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
