package co.edu.uptc.interfaces;

public interface PresenterInterface {

    void addProducto(String descripcion, double precio, String unidadMedida);
    String[] getProductos();
    int deleteProducto(String nombre);
}