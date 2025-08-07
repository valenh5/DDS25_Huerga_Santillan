package Ejercicio7;

import java.util.Arrays;
import java.util.HashSet;

public class Combo extends Producto {

    private HashSet<Producto> ListadoProductos;

    public Combo(String descripcion) {
        super(descripcion);
        ListadoProductos=new HashSet<>();
    }
    public void agregarProducto(Producto... productos) {
        this.ListadoProductos.addAll(Arrays.asList(productos));
    }


    @Override
    public double precio() {
        return ListadoProductos.stream().mapToDouble(Producto::precio).sum();
    }


    @Override
    public int stock() {
        return ListadoProductos.isEmpty() ? -1 : ListadoProductos.stream().map(Producto::stock).distinct().count() == 1 ? ListadoProductos.iterator().next().stock() : ListadoProductos.stream().mapToInt(Producto::stock).min().orElse(-1);
    }

}
