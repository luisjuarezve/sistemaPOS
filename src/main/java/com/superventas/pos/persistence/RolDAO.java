
package com.superventas.pos.persistence;

import com.superventas.pos.model.Categorias;
import com.superventas.pos.model.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


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
}
