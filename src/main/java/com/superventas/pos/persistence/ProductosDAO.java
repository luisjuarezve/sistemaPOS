
package com.superventas.pos.persistence;

import com.superventas.pos.model.Categorias;
import com.superventas.pos.model.Productos;
import com.superventas.pos.persistence.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Helen
 */
public class ProductosDAO {
    
    
    public void insertarProductos(Productos producto) {
    String sql = "INSERT INTO PRODUCTOS ( CODIGO, NOMBRE, DESCRIPCION, FOTO, TIPO_VENTA, PRECIO_COMPRA, GANANCIA, PRECIO_VENTA, PRECIO_MAYOREO, IMPUESTO, PROVEEDOR_ID, CATEGORIA_ID) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, producto.getCodigo());
        pstmt.setString(2, producto.getNombre());
        pstmt.setString(3, producto.getDescripcion());
        pstmt.setString(4, producto.getFoto());
        pstmt.setString(5, producto.getTipo_venta());
        pstmt.setDouble(6, producto.getPrecio_compra());
        pstmt.setDouble(7, producto.getGanancia());
        pstmt.setDouble(8, producto.getPrecio_venta());
        pstmt.setDouble(9, producto.getPrecio_mayoreo());
        pstmt.setDouble(10, producto.getImpuesto());
        pstmt.setInt(11, producto.getProveedor_id());
        pstmt.setInt(12, producto.getCategoria_id());
        int filasInsertadas = pstmt.executeUpdate();
        if (filasInsertadas > 0) {
            System.out.println("Producto insertado correctamente.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al insertar el Producto");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    


public Productos leerProducto(String productoId) {
    Productos producto = null;
    String sql = "SELECT * FROM PRODUCTOS WHERE PRODUCTO_ID = ?";
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, productoId);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            String codigo = rs.getString("CODIGO");
            String nombre = rs.getString("NOMBRE");
            String descripcion = rs.getString("DESCRIPCION");
            String foto = rs.getString("FOTO");
            String tipoVenta = rs.getString("TIPO_VENTA");
            double precioCompra = rs.getDouble("PRECIO_COMPRA");
            double ganancia = rs.getDouble("GANANCIA");
            double precioVenta = rs.getDouble("PRECIO_VENTA");
            double precioMayoreo = rs.getDouble("PRECIO_MAYOREO");
            double impuesto = rs.getDouble("IMPUESTO");
            int proveedorId = rs.getInt("PROVEEDOR_ID");
            int categoriaId = rs.getInt("CATEGORIA_ID");

     producto = new Productos(Integer.parseInt(productoId),Integer.parseInt(codigo), nombre, descripcion, foto, tipoVenta, precioCompra, ganancia, precioVenta, precioMayoreo, impuesto, proveedorId, categoriaId);
        } else {
            System.out.println("Producto no encontrado.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al leer el Producto");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return producto;
}
 
public List<Productos> LeerTodosProductos() {
    List<Productos> productos = new ArrayList<>();
    String sql = "SELECT * FROM PRODUCTOS"; // Correct table name
    ConexionBDD cn = new ConexionBDD();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        connection = cn.getConnection();
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("PRODUCTO_ID");
            String codigo = rs.getString("CODIGO");
            String nombre = rs.getString("NOMBRE");
            String descripcion = rs.getString("DESCRIPCION");
            String foto = rs.getString("FOTO");
            String tipoVenta = rs.getString("TIPO_VENTA");
            double precioCompra = rs.getDouble("PRECIO_COMPRA");
            double ganancia = rs.getDouble("GANANCIA");
            double precioVenta = rs.getDouble("PRECIO_VENTA");
            double precioMayoreo = rs.getDouble("PRECIO_MAYOREO");
            double impuesto = rs.getDouble("IMPUESTO");
            int proveedorId = rs.getInt("PROVEEDOR_ID");
            int categoriaId = rs.getInt("CATEGORIA_ID");

            Productos producto = new Productos(id, Integer.parseInt(codigo), nombre, descripcion, foto, tipoVenta, precioCompra, ganancia, precioVenta, precioMayoreo, impuesto, proveedorId, categoriaId);
            productos.add(producto);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al obtener los productos");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) cn.closeConnection(); // Cierra la conexión correctamente
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return productos;
}

public void modificarProductos(String producto_id, Productos producto){
        String sql = "UPDATE PRODUCTOS SET  NOMBRE=?, DESCRIPCION=?, FOTO=?, TIPO_VENTA=?, PRECIO_COMPRA=?, GANANCIA=?, PRECIO_VENTA=?, PRECIO_MAYOREO=?, IMPUESTO=?, PROVEEDOR_ID=?, CATEGORIA_ID=?  WHERE PRODUCTOS_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            
            
            
            pstmt.setString(1, producto.getNombre());
            pstmt.setString(2, producto.getDescripcion());
            pstmt.setString(3, producto.getFoto());
            pstmt.setString(4, producto.getTipo_venta());
            pstmt.setDouble(5, producto.getPrecio_compra());
            pstmt.setDouble(6, producto.getGanancia());
            pstmt.setDouble(7, producto.getPrecio_venta());
            pstmt.setDouble(8, producto.getPrecio_mayoreo());
            pstmt.setDouble(9, producto.getImpuesto());
            pstmt.setInt(10, producto.getProveedor_id());
            pstmt.setInt(11, producto.getCategoria_id());
            pstmt.setString(12, producto_id);
            int filasActualizadas = pstmt.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Categoria modificada exitosamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al modificar la categoria");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                cn.closeConnection(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

  public void eliminarProductos(String producto_id){
        String sql = "DELETE FROM PRODUCTOS WHERE PRODUCTO_ID = ?";
        ConexionBDD cn = new ConexionBDD();
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = cn.getConnection(); 
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, producto_id);
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


    





















