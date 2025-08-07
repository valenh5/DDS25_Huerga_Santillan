package Ejercicio7;

public class mainnn {
     public static void main(String[] args) {
         ProductoSimple productoSimple = new ProductoSimple("merengue",4,23);
         ProductoSimple productoSimple2 = new ProductoSimple("lucio", 78,76);
         ProductoSimple productoSimple3 = new ProductoSimple("campera", 9, 12);
         Combo combo= new Combo("Combo pro");
         combo.agregarProducto(productoSimple, productoSimple2, productoSimple3);
         Combo combo2= new Combo("Combo crack");
         combo2.agregarProducto(combo, productoSimple);
         System.out.println(combo2.precio());
         System.out.println(combo2.stock());
    }
}
