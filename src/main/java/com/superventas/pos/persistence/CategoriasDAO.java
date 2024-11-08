package com.superventas.pos.persistence;

import com.superventas.pos.model.Categorias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriasDAO {

    public void insertarCategorias(Categorias categoria) {
        String sql = "INSERT INTO CATEGORIAS (NOMBRE, DESCRIPCION) VALUES (?, ?)";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection();
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, categoria.getNombre());
            pstmt.setString(2, categoria.getDescripcion());

            int filasInsertadas = pstmt.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Categoria insertada correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar la Categoria");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                cn.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Categorias leerCategoria(String categoria_id) {
        Categorias categoria = null;
        String sql = "SELECT * FROM CATEGORIAS WHERE CATEGORIA_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = cn.getConnection();
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, categoria_id);
            rs = pstmt.executeQuery();

            if (rs.next()) {

                String nombre = rs.getString("NOMBRE");
                String descripcion = rs.getString("DESCRIPCION");

                categoria = new Categorias(Integer.parseInt(categoria_id), nombre, descripcion);
                return categoria;
            } else {
                System.out.println("Categoria no encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al leer la categoria");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    cn.closeConnection();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return categoria;
    }
    
    public Categorias leerCategoriaNombre(String nombre) {
        Categorias categoria = null;
        String sql = "SELECT * FROM CATEGORIAS WHERE NOMBRE = ?";
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
                int categoria_id = rs.getInt("CATEGORIA_ID");
                String descripcion = rs.getString("DESCRIPCION");

                categoria = new Categorias(categoria_id, nombre, descripcion);
                return categoria;
            } else {
                System.out.println("Categoria no encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al leer la categoria");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    cn.closeConnection();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return categoria;
    }

    public List<Categorias> LeerTodosCategorias() {
        List<Categorias> categorias = new ArrayList<>();
        String sql = "SELECT * FROM CATEGORIAS";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = cn.getConnection();
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("CATEGORIA_ID");
                String nombre = rs.getString("NOMBRE");
                String descripcion = rs.getString("DESCRIPCION");

                Categorias cl = new Categorias(id, nombre, descripcion);
                categorias.add(cl);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener las categorias");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    cn.closeConnection(); // Cierra la conexión correctamente
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return categorias;
    }

    public void modificarCategoria(String categoria_id, Categorias categoria) {
        String sql = "UPDATE CATEGORIAS SET NOMBRE = ?, DESCRIPCION = ?  WHERE CATEGORIA_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection();
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, categoria.getNombre());
            pstmt.setString(2, categoria.getDescripcion());
            pstmt.setString(3, categoria_id);

            int filasActualizadas = pstmt.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Categoria modificada exitosamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al modificar la categoria");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                cn.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void eliminarCategorias(String categoria_id) {
        String sql = "DELETE FROM CATEGORIAS WHERE CATEGORIA_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection();
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, categoria_id);
            int filasEliminadas = pstmt.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Categoria eliminada correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar la categoria");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                cn.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
