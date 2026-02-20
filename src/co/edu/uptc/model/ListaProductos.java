package co.edu.uptc.model;

import co.edu.uptc.interfaces.ModelInterface;

public class ListaProductos implements ModelInterface {

    private Nodo header;

    public ListaProductos() {
        header = null;
    }

    private Nodo createNode(Producto producto) {
        return new Nodo(producto);
    }

    private Nodo getLastNode() {
        Nodo last = header;
        while (last.sig != null) {
            last = last.sig;
        }
        return last;
    }

    @Override
    public void addProducto(Producto producto) {

    }

    @Override
    public String[] getProductos() {

        return result;
    }

    @Override
    public int deleteProducto(String nombre) {

        return ;
    }
}