package Ejercicio7;

public class Aplicable extends Producto {

    private Producto producto;

    public Aplicable(String descripcion, Producto producto) {
        super(descripcion);
        this.producto = producto;
    }

    @Override
    public double precio() {
        return super.precio();
    }

    @Override
    public int stock() {
        return super.stock();
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
