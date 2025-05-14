package TendenciasMusicales;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.util.HashSet;

public class CancionesTest {
    HashSet<Cancion> canciones;
    Album album;
    Cancion cancion;

    @BeforeEach
    public void setUp() {
        canciones = new HashSet<>();
        album  = new Album("A rush of Blood to the head", 2022, canciones);
        cancion = new Cancion("The Scientist", "Coldplay", 100, 10, 1000, LocalDate.now(), new Normal(), album);
    }

    @Test
    public void testLanzamiento() {
        assertEquals(new Normal(), cancion.getPopularidad());
    }

    @Test
    public void testAuge() {
        cancion.setReproducciones(2001);
        cancion.getPopularidad().cambiarEstado(cancion);
        assertEquals(new Auge(), cancion.getPopularidad());
    }

    @Test
    public void testDowngradeAuge() {
        cancion.setDislikes(7000);
        cancion.getPopularidad().cambiarEstado(cancion);
        assertEquals(new Normal(), cancion.getPopularidad());
    }

    @Test
    public void testTendencia() {
        cancion.setReproducciones(55000);
        cancion.setLikes(25000);
        cancion.getPopularidad().cambiarEstado(cancion);
        assertEquals(new Tendencia(), cancion.getPopularidad());
    }

    @Test
    public void testDowngradeTendencia() {
        cancion.setUltimaReproduccion(LocalDate.of(1990, 3, 20));
        cancion.getPopularidad().cambiarEstado(cancion);
        assertEquals(new Normal(), cancion.getPopularidad());
    }
}