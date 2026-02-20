package co.edu.uptc.model;

public class Nodo {

    public Producto producto;
    public Nodo sig;

    public Nodo(Producto producto) {
        this.producto = producto;
        this.sig = null;
    }
}