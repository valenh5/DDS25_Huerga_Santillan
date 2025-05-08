package TendenciasMusicales;

import java.util.HashSet;

public class Album {
    private String titulo;
    private int lanzamiento;
    private HashSet<Cancion> canciones;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public HashSet<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(HashSet<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public Album(String titulo, int lanzamiento, HashSet<Cancion> canciones) {
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.canciones = canciones;
    }
}
