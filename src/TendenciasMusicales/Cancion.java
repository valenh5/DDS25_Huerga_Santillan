package TendenciasMusicales;

import javax.swing.plaf.metal.MetalToolBarUI;
import java.time.LocalDate;

public class Cancion {
    private String titulo, artista;
    private int reproducciones, likes, dislikes;
    private LocalDate ultimaReproduccion;
    private MetodosPopularidad popularidad;
    private Album album;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public LocalDate getUltimaReproduccion() {
        return ultimaReproduccion;
    }

    public void setUltimaReproduccion(LocalDate ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }

    public MetodosPopularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(MetodosPopularidad popularidad) {
        this.popularidad = popularidad;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Cancion(String titulo, String artista, int reproducciones, int likes, int dislikes, LocalDate ultimaReproduccion, MetodosPopularidad popularidad, Album album) {
        this.titulo = titulo;
        this.artista = artista;
        this.reproducciones = reproducciones;
        this.likes = likes;
        this.dislikes = dislikes;
        this.ultimaReproduccion = ultimaReproduccion;
        this.popularidad = popularidad;
        this.album = album;
    }
}
