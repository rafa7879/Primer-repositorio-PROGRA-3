package co.edu.uptc.model;

public class Producto {

    private String descripcion;
    private double precio;
    private String unidadMedida;

    public Producto(String descripcion, double precio, String unidadMedida) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return descripcion + " - $" + precio + " - " + unidadMedida;
    }
}