
package com.superventas.pos.persistence;

import com.superventas.pos.model.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RolDAO {
    public Rol leerRol(String rol_id) {
        Rol rol = null;
        String sql = "SELECT * FROM ROL WHERE ROL_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = cn.getConnection();
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, rol_id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                
                // Asumiendo que la tabla CLIENTES tiene las columnas NOMBRE, APELLIDO, etc.
               
                String nombre = rs.getString("NOMBRE");
                String descripcion = rs.getString("DESCRIPCION");
               
                rol= new Rol(Integer.parseInt(rol_id), nombre, descripcion);
                return rol;
            } else {
                System.out.println("Rol no encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al leer el Rol");
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (connection != null) cn.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rol;
    }
    
    public Rol leerRolNombre(String nombre) {
        Rol rol = null;
        String sql = "SELECT * FROM ROL WHERE NOMBRE = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = cn.getConnection();
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, nombre);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                int rol_id = rs.getInt("ROL_ID");
                String descripcion = rs.getString("DESCRIPCION");
                rol= new Rol(rol_id, nombre, descripcion);
                return rol;
            } else {
                System.out.println("Rol no encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al leer el Rol");
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (connection != null) cn.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rol;
    }
    
    public List<Rol> LeerTodosRoles() {
        List<Rol> roles = new ArrayList<>();
        String sql = "SELECT * FROM ROL";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            connection = cn.getConnection();
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ROL_ID");
                String nombre = rs.getString("NOMBRE");
                String apellido = rs.getString("DESCRIPCION");
                Rol rol = new Rol(id, nombre, apellido);
                roles.add(rol);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener los roles");
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (connection != null) cn.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return roles;
    }
}
