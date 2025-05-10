package TendenciasMusicales;

import java.time.LocalDate;

public class Tendencia implements MetodosPopularidad{
    private static Icono icono = Icono.FIRE;

    public Icono getIcono() {
        return icono;
    }

    @Override
    public String obtenerLeyenda(Cancion cancion) {
        return cancion.getTitulo() + " - " + cancion.getArtista() + " (" + cancion.getAlbum().getTitulo() + " " + cancion.getAlbum().getLanzamiento() + ")";
    }

    @Override
    public void cambiarEstado(Cancion cancion) {
        if(cancion.getUltimaReproduccion().isBefore(LocalDate.now())) {
            System.out.println("Baja a normal por la ult reproduccion");
            cancion.setPopularidad(new Normal());
        } else {
            System.err.println("La cancion sigue estando en tendencia.");
        }
    }
}
