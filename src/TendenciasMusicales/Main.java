package TendenciasMusicales;

import java.time.LocalDate;
import java.util.HashSet;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        HashSet<Cancion> canciones = new HashSet<>();
        Album listaCancion = new Album("A rush of Blood to the head", 2022, canciones);
        Cancion cancion1 = new Cancion("The Scientist", "Coldplay", 2000, 10, 10000, LocalDate.now(), new Normal(), listaCancion);
        canciones.add(cancion1);
        cancion1.getPopularidad().cambiarEstado(cancion1);
        System.out.println(cancion1.getPopularidad());
        cancion1.getPopularidad().cambiarEstado(cancion1);
        System.out.println(cancion1.getPopularidad());
        cancion1.setLikes(200000);
        cancion1.setReproducciones(500000);
        cancion1.getPopularidad().cambiarEstado(cancion1);
        System.out.println(cancion1.getPopularidad());
        cancion1.getPopularidad().cambiarEstado(cancion1);
        System.out.println(cancion1.getPopularidad());
        cancion1.setUltimaReproduccion(LocalDate.of(1990, 3, 20));
        cancion1.getPopularidad().cambiarEstado(cancion1);
        System.out.println(cancion1.getPopularidad());
    }
}