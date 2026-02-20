package co.edu.uptc.interfaces;

import co.edu.uptc.model.Producto;

public interface ModelInterface {

    void addProducto(Producto producto);
    String[] getProductos();
    int deleteProducto(String nombre);
}