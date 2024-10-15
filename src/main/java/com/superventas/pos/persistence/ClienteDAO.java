package com.superventas.pos.persistence;

import com.superventas.pos.model.Cliente;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    
   public void insertarCliente(Cliente cliente) {
        String sql = "INSERT INTO CLIENTES (CEDULA, NOMBRE, APELLIDO, TELEFONO, CORREO_ELECTRONICO, DIRECCION, COMENTARIOS) VALUES (?, ?, ?, ?, ?, ?, ?)";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cliente.getCedula());
            pstmt.setString(2, cliente.getNombre());
            pstmt.setString(3, cliente.getApellido());
            pstmt.setString(4, cliente.getTelefono());
            pstmt.setString(5, cliente.getCorreoElectronico());
            pstmt.setString(6, cliente.getDireccion());
            pstmt.setString(7, cliente.getComentarios());

            int filasInsertadas = pstmt.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Cliente insertado correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar el Cliente");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                cn.closeConnection(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   
    public Cliente leerCliente(String cedula) {
        Cliente cliente = null;
        String sql = "SELECT * FROM CLIENTES WHERE CEDULA = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = cn.getConnection();
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cedula);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                
                // Asumiendo que la tabla CLIENTES tiene las columnas NOMBRE, APELLIDO, etc.
                int id = rs.getInt("CLIENTE_ID");
                String nombre = rs.getString("NOMBRE");
                String apellido = rs.getString("APELLIDO");
                String telefono = rs.getString("TELEFONO");
                String correoElectronico = rs.getString("CORREO_ELECTRONICO");
                String direccion = rs.getString("DIRECCION");
                String comentarios = rs.getString("COMENTARIOS");
                
                cliente = new Cliente(id, cedula, nombre, apellido, telefono, correoElectronico, direccion, comentarios);
                return cliente;
            } else {
                System.out.println("Cliente no encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al leer el Cliente");
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (connection != null) cn.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return cliente;
    }

   public List<Cliente> LeerTodosClientes(){
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM CLIENTES";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = cn.getConnection();
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("CLIENTE_ID");
                String cedula = rs.getString("CEDULA");
                String nombre = rs.getString("NOMBRE");
                String apellido = rs.getString("APELLIDO");
                String telefono = rs.getString("TELEFONO");
                String correoElectronico = rs.getString("CORREO_ELECTRONICO");
                String direccion = rs.getString("DIRECCION");
                String comentarios = rs.getString("COMENTARIOS");

                Cliente cl = new Cliente(id, cedula, nombre, apellido, telefono, correoElectronico, direccion, comentarios);
                clientes.add(cl);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener los Clientes");
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (connection != null) cn.closeConnection(); // Cierra la conexión correctamente
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return clientes;
    } 
    
   public void modificarCliente(String cedula, Cliente cliente){
        String sql = "UPDATE CLIENTES SET NOMBRE = ?, APELLIDO = ?, TELEFONO = ?, CORREO_ELECTRONICO = ?, DIRECCION = ?, COMENTARIOS = ? WHERE CEDULA = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cliente.getNombre());
            pstmt.setString(2, cliente.getApellido());
            pstmt.setString(3, cliente.getTelefono());
            pstmt.setString(4, cliente.getCorreoElectronico());
            pstmt.setString(5, cliente.getDireccion());
            pstmt.setString(6, cliente.getComentarios());
            pstmt.setString(7, cedula);
            int filasActualizadas = pstmt.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Cliente modificado exitosamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al modificar el Cliente");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                cn.closeConnection(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   
    public void eliminarCliente(String cedula){
        String sql = "DELETE FROM CLIENTES WHERE CEDULA = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cedula);
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
