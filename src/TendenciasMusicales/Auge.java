package TendenciasMusicales;

public class Auge implements MetodosPopularidad{
    private static Icono icono = Icono.ROCKET;

    public Icono getIcono() {
        return icono;
    }

    @Override
    public String obtenerLeyenda(Cancion cancion) {
        return cancion.getArtista() + " - " + cancion.getTitulo() + " (" + cancion.getAlbum().getTitulo() + " - " + cancion.getAlbum().getLanzamiento() + ")";
    }

    @Override
    public void cambiarEstado(Cancion cancion) {
        if(cancion.getReproducciones() > 50000 && cancion.getLikes() > 20000) {
            System.out.println("La cancion sera tendencia");
            cancion.setPopularidad(new Tendencia());
        } else if(cancion.getDislikes() > 5000) {
            System.out.println("Baja de categoria por dislikes");
            cancion.setPopularidad(new Normal());
        } else {
            System.err.println("No hay ningun cambio posible para esta cancion.");
        }
    }
}
