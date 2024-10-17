
package com.superventas.pos.persistence;

import com.superventas.pos.model.Productos;
import com.superventas.pos.model.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class ProveedorDAO {
     public void insertarProveedor(Proveedor proveedor) {
    String sql = "INSERT INTO PROVEEDOR (TIPO_DOC,NRO_DOC,RAZON_SOCIAL,TELEFONO,DIRECCION,CORREO_ELECTRONICO,FECHA_REGISTRO,ENCARGADO,TELEFONO_ENCARGADO,COMENTARIO,TIPO_PAGO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, proveedor.getTipo_doc());
        pstmt.setString(2, proveedor.getNro_doc());
        pstmt.setString(3, proveedor.getRazon_social());
        pstmt.setString(4, proveedor.getTelefono());
        pstmt.setString(5, proveedor.getDireccion());
        pstmt.setString(6, proveedor.getCorreo_electronico());
        pstmt.setString(7, proveedor.getFecha_registro().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        pstmt.setString(8, proveedor.getEncargado());
        pstmt.setString(9, proveedor.getTelefono_encargado());
        pstmt.setString(10, proveedor.getComentario());
        pstmt.setString(11, proveedor.getTipo_pago());
      
        int filasInsertadas = pstmt.executeUpdate();
        if (filasInsertadas > 0) {
            System.out.println("proveedor insertado correctamente.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al insertar el proveedor");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
    public Proveedor leerProveedor(String proveedor_id) {
    Proveedor proveedor = null;
    String sql = "SELECT * FROM PROVEEDOR WHERE PROVEEDOR_ID = ?";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, proveedor_id);
        
        // Imprimir la consulta para depuración
        System.out.println("Ejecutando consulta: " + pstmt.toString());
        
        rs = pstmt.executeQuery();
        if (rs.next()) {
            char tipo_doc = rs.getString("TIPO_DOC").charAt(0); // Asegúrate que este nombre es correcto
            String nro_doc = rs.getString("NRO_DOC");
            String razon_social = rs.getString("RAZON_SOCIAL");
            String telefono = rs.getString("TELEFONO");
            String direccion = rs.getString("DIRECCION");
            String correo_electronico = rs.getString("CORREO_ELECTRONICO");
            LocalDate fecha_registro = rs.getObject("FECHA_REGISTRO",LocalDate.class);
            String encargado = rs.getString("ENCARGADO");
            String telefono_encargado = rs.getString("TELEFONO_ENCARGADO");
            String comentario = rs.getString("COMENTARIO");
            String tipo_pago = rs.getString("TIPO_PAGO");

            proveedor = new Proveedor(Integer.parseInt(proveedor_id), tipo_doc, nro_doc, razon_social, telefono, direccion, correo_electronico, fecha_registro, encargado, telefono_encargado, comentario, tipo_pago);
        } else {
            System.out.println("Proveedor no encontrado.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al leer el Proveedor");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return proveedor;
}

     public List<Proveedor> LeerTodosProveedor() {
    List<Proveedor> proveedores = new ArrayList<>();
    String sql = "SELECT * FROM PROVEEDOR"; // Correct table name
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("PROVEEDOR_ID");
            String tipoDoc = rs.getString("TIPO_DOC");
            String nroDoc = rs.getString("NRO_DOC");
            String razonSocial = rs.getString("RAZON_SOCIAL");
            String telefono = rs.getString("TELEFONO");
            String direccion = rs.getString("DIRECCION");
            String correoElectronico = rs.getString("CORREO_ELECTRONICO");
            LocalDate fechaRegistro = rs.getObject("FECHA_REGISTRO", LocalDate.class);
            String encargado = rs.getString("ENCARGADO");
            String telefonoEncargado = rs.getString("TELEFONO_ENCARGADO");
            String comentario = rs.getString("COMENTARIO");
            String tipoPago = rs.getString("TIPO_PAGO");

   Proveedor proveedor = new Proveedor( id,tipoDoc.charAt(0),nroDoc,razonSocial,telefono,direccion,correoElectronico,fechaRegistro,encargado,telefonoEncargado,comentario,tipoPago );
   proveedores.add(proveedor);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al obtener los proveedores");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return proveedores;
}

     public void modificarProveedor(String proveedor_id, Proveedor proveedor){
        String sql = "UPDATE PROVEEDOR SET  TIPO_DOC=?, NRO_DOC=?, RAZON_SOCIAL=?, TELEFONO=?, DIRECCION=?, CORREO_ELECTRONICO=?, FECHA_REGISTRO=?, ENCARGADO=?, TELEFONO_ENCARGADO=?, COMENTARIO=?, TIPO_PAGO=?  WHERE PROVEEDOR_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            
        pstmt.setInt(1, proveedor.getTipo_doc());
        pstmt.setString(2, proveedor.getNro_doc());
        pstmt.setString(3, proveedor.getRazon_social());
        pstmt.setString(4, proveedor.getTelefono());
        pstmt.setString(5, proveedor.getDireccion());
        pstmt.setString(6, proveedor.getCorreo_electronico());
         pstmt.setString(7, proveedor.getFecha_registro().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        pstmt.setString(8, proveedor.getEncargado());
        pstmt.setString(9, proveedor.getTelefono_encargado());
        pstmt.setString(10, proveedor.getComentario());
        pstmt.setString(11, proveedor.getTipo_pago());
        pstmt.setString(12, proveedor_id);   
      
            int filasActualizadas = pstmt.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Proveedor modificado exitosamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al modificar el proveedor");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                cn.closeConnection(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
     public void eliminarProveedor(String proveedor_id){
        String sql = "DELETE FROM PROVEEDOR WHERE PROVEEDOR_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, proveedor_id);
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
