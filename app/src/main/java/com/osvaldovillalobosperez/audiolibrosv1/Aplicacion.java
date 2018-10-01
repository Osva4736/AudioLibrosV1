package com.osvaldovillalobosperez.audiolibrosv1;

import android.app.Application;

import java.util.Vector;

public class Aplicacion extends Application {
    private Vector<Libro> vectorLibros;
    private AdaptadorLibros adaptador;

    public void OnCreate() {
        vectorLibros = Libro.ejemploLibros();
        adaptador = new AdaptadorLibros(this, vectorLibros);
    }

    public AdaptadorLibros getAdaptador() {
        return adaptador;
    }

    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }
}
