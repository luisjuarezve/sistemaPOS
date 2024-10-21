
package com.superventas.pos.persistence;

import com.superventas.pos.model.Cliente;
import com.superventas.pos.model.Inventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class InventarioDAO {
    public void insertarInventario(Inventario inventario) {
        String sql = "INSERT INTO INVENTARIO (CANTIDAD, INVENTARIO_MIN, INVENTARIO_MAX, PRODUCTO_ID) VALUES (?, ?, ?, ?)";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, inventario.getCantidad());
            pstmt.setDouble(2, inventario.getInventario_min());
            pstmt.setDouble(3, inventario.getInventario_max());
            pstmt.setInt(4, inventario.getProducto_id());
            

            int filasInsertadas = pstmt.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Inventario insertado correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar el Inventario");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                cn.closeConnection(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   public Inventario leerInventario(int producto_id) {
    Inventario inventario = null;
    String sql = "SELECT * FROM INVENTARIO WHERE PRODUCTO_ID = ?";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, producto_id);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            // Assuming the table INVENTARIO has the columns ID, CANTIDAD, INVENTARIO_MIN, INVENTARIO_MAX, ID_PRODUCTO
            int id= rs.getInt("ID");
            double cantidad = rs.getDouble("CANTIDAD");
            double inventarioMin = rs.getDouble("INVENTARIO_MIN");
            double inventarioMax = rs.getDouble("INVENTARIO_MAX");
            inventario = new Inventario(id, cantidad, inventarioMin, inventarioMax, producto_id);
        } else {
            System.out.println("Inventario no encontrado.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al leer el Inventario");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return inventario;
}
public List<Inventario> leerTodosInventario() {
    List<Inventario> inventarios = new ArrayList<>();
    String sql = "SELECT * FROM INVENTARIO";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("ID"); // Assuming your INVENTARIO table has an ID column
            double cantidad = rs.getDouble("CANTIDAD");
            int inventario_min = rs.getInt("INVENTARIO_MIN");
            int inventario_max = rs.getInt("INVENTARIO_MAX");
            int producto_id = rs.getInt("PRODUCTO_ID");
            Inventario inventario = new Inventario(id, cantidad, inventario_min, inventario_max, producto_id);
            inventarios.add(inventario);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al obtener el inventario");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return inventarios;
}
public void modificarInventario(String id, Inventario inventario) {
    String sql = "UPDATE INVENTARIO SET CANTIDAD = ?, INVENTARIO_MIN = ?, INVENTARIO_MAX = ?, PRODUCTO_ID = ? WHERE ID = ?";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setDouble(1, inventario.getCantidad());
        pstmt.setDouble(2, inventario.getInventario_min());
        pstmt.setDouble(3, inventario.getInventario_max());
        pstmt.setInt(4, inventario.getProducto_id());
        pstmt.setString(5, id);  // Corrected index

        int filasActualizadas = pstmt.executeUpdate();
        if (filasActualizadas > 0) {
            System.out.println("Inventario modificado exitosamente.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al modificar el Inventario");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
  public void eliminarInventario(String id){
        String sql = "DELETE FROM INVENTARIO WHERE ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, id);
            int filasEliminadas = pstmt.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Cliente eliminado correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar el Cliente");
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
