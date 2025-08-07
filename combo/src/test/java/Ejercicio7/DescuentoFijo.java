package Ejercicio7;

public class DescuentoFijo extends Aplicable {

    private double precio;

    public DescuentoFijo(String descripcion, Producto producto, double precio) {
        super(descripcion, producto);
        this.precio=precio;
        precio();
    }

    @Override
    public double precio() {
        return super.getProducto().precio()-precio;
    }

    @Override
    public int stock() {
        return super.getProducto().stock();
    }
}
