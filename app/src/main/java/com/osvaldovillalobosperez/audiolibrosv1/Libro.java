package com.osvaldovillalobosperez.audiolibrosv1;

import java.util.Vector;

public class Libro {
    public String titulo;
    public String autor;
    public int recursoImagen;
    public String urlAudio;
    public String genero;
    public Boolean novedad;
    public Boolean leido;
    public final static String G_TODOS = "Todos los géneros";
    public final static String G_EPICOS = "Poema épico";
    public final static String G_S_XIX = "Literatura siglo XIX";
    public final static String G_SUSPENSE = "Suspense";
    public final static String[] G_ARRAY = new String[] {G_TODOS, G_EPICOS, G_S_XIX, G_SUSPENSE};

    public Libro(String titulo, String autor, int recursoImagen, String urlAudio, String genero, Boolean novedad, Boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.recursoImagen = recursoImagen;
        this.urlAudio = urlAudio;
        this.genero = genero;
        this.novedad = novedad;
        this.leido = leido;
    }

    public static Vector<Libro> ejemploLibros() {
        final String SERVIDOR = "http://www.dcomg.upv.es/~jtomas/android/audiiolibros/";
        Vector<Libro> libros = new Vector<Libro>();
        libros.add(new Libro("Kappa", "Akutagama", R.drawable.kappa, SERVIDOR+"kappa.mp3", Libro.G_S_XIX, false, false));
        libros.add(new Libro("Avecilla", "Alas Clarín, Leopoldo", R.drawable.avecilla, SERVIDOR+"avecilla.mp3", Libro.G_S_XIX, true, false));
        libros.add(new Libro("Divina Comedia", "Dante", R.drawable.divina_comedia, SERVIDOR+"divina_comedia.mp3", Libro.G_EPICOS, true, false));
        libros.add(new Libro("Viejo Pancho, El", "Alonso y Trelles, José", R.drawable.viejo_pancho, SERVIDOR+"viejo_pancho.mp3", Libro.G_S_XIX, true, true));
        libros.add(new Libro("Canción de Rolando", "Anónimo", R.drawable.cancion_rolando, SERVIDOR+"cancion_rolando.mp3", Libro.G_EPICOS, false, true));
        libros.add(new Libro("Matrimonio de sabuesos", "Agata Christie", R.drawable.matrim_sabuesos, SERVIDOR+"matrim_sabuesos.mp3", Libro.G_SUSPENSE, false, true));
        libros.add(new Libro("La iliada", "Homero", R.drawable.la_iliada, SERVIDOR+"la_iliada.mp3", Libro.G_EPICOS, true, false));
        return libros;
    }
}
