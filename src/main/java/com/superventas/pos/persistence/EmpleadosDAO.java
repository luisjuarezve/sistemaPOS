package com.superventas.pos.persistence;

import com.superventas.pos.model.Empleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmpleadosDAO {
    public void insertarEmpleados(Empleados empleado) {
        String sql = "INSERT INTO EMPLEADOS (ROL_ID, NOMBRE, APELLIDO, CORREO_ELECTRONICO,USUARIO, CONTRASENA) VALUES (?, ?, ?, ?, ?, ?)";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, empleado.getRol_id());
            pstmt.setString(2, empleado.getNombre());
            pstmt.setString(3, empleado.getApellido());
            pstmt.setString(4, empleado.getCorreo_electronico());
            pstmt.setString(5, empleado.getUsuario());
            pstmt.setString(6, empleado.getContrasena());

            int filasInsertadas = pstmt.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Empleado insertado correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar el Empleado");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                cn.closeConnection(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   public Empleados leerEmpleados(String empleado_id) {
    Empleados empleado = null;
    String sql = "SELECT * FROM EMPLEADOS WHERE EMPLEADO_ID= ?";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, empleado_id);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            // Assuming that the table EMPLEADOS has the columns EMPLEADO_ID, ROL_ID, NOMBRE, APELLIDO, CORREO_ELECTRONICO, USUARIO, CONTRASENA
            int id = rs.getInt("EMPLEADO_ID");
            int rol_id = rs.getInt("ROL_ID");
            String nombre = rs.getString("NOMBRE");
            String apellido = rs.getString("APELLIDO");
            String correoElectronico = rs.getString("CORREO_ELECTRONICO");
            String usuario = rs.getString("USUARIO");
            String contrasena = rs.getString("CONTRASENA");
            empleado = new Empleados(id, rol_id, nombre, apellido, correoElectronico, usuario, contrasena);
        } else {
            System.out.println("Empleado no encontrado.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al leer el Empleado");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return empleado;
}
    
    public List<Empleados> LeerTodosEmpleados() {
    List<Empleados> empleados = new ArrayList<>();
    String sql = "SELECT * FROM EMPLEADOS";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("EMPLEADO_ID");
            int rolId = rs.getInt("ROL_ID");
            String nombre = rs.getString("NOMBRE");
            String apellido = rs.getString("APELLIDO");
            String correoElectronico = rs.getString("CORREO_ELECTRONICO");
            String usuario = rs.getString("USUARIO");
            String contrasena = rs.getString("CONTRASENA");
            Empleados empleado = new Empleados(id, rolId, nombre, apellido, correoElectronico, usuario, contrasena);
            empleados.add(empleado);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al obtener los Empleados");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return empleados;
}
public void modificarEmpleados(String empleadoId, Empleados empleado) {
    String sql = "UPDATE EMPLEADOS SET ROL_ID=?, NOMBRE=?, APELLIDO=?, CORREO_ELECTRONICO=?, USUARIO=?, CONTRASENA=? WHERE EMPLEADO_ID=?";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, empleado.getRol_id()); // Corrected method call
        pstmt.setString(2, empleado.getNombre());
        pstmt.setString(3, empleado.getApellido());
        pstmt.setString(4, empleado.getCorreo_electronico());
        pstmt.setString(5, empleado.getUsuario());
        pstmt.setString(6, empleado.getContrasena()); // Fixed field name
        pstmt.setString(7, empleadoId);
        int filasActualizadas = pstmt.executeUpdate();
        if (filasActualizadas > 0) {
            System.out.println("Empleado modificado exitosamente.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al modificar el Empleado");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

 public void eliminarEmpleados(String empleado_id){
        String sql = "DELETE FROM EMPLEADOS WHERE EMPLEADO_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, empleado_id);
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
