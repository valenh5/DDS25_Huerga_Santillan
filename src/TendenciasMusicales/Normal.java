package TendenciasMusicales;

public class Normal implements MetodosPopularidad{
    private static Icono icono = Icono.MUSICAL_NOTE;

    public Icono getIcono() {
        return icono;
    }

    @Override
    public String obtenerLeyenda(Cancion cancion) {
        return cancion.getArtista() + " - " + cancion.getAlbum().getTitulo() + " - " + cancion.getTitulo();
    }

    @Override
    public void cambiarEstado(Cancion cancion) {
        if(cancion.getReproducciones() > 1000) {
            System.out.println("Pasara a ser auge");
            cancion.setPopularidad(new Auge());
        } else {
            System.err.println("La cancion no posee mas de 1000 reproducciones.");
        }
    }
}
