package Ejercicio7;

public abstract class Producto {
    private String descripcion;

    public Producto(String descripcion) {
        this.descripcion = descripcion;
    }

    public double precio(){
        return 0;
    }

    public int stock(){
        return 0;
    }
}
