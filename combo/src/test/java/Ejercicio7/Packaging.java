package Ejercicio7;

public class Packaging extends Aplicable {

    private double precio;

    public Packaging(String descripcion, Producto producto, double precio) {
        super(descripcion, producto);
        this.precio=precio;
    }

    @Override
    public int stock() {
        return super.getProducto().stock();
    }

    @Override
    public double precio() {
        return super.getProducto().precio() + precio;
    }


}
