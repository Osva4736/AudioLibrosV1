package com.osvaldovillalobosperez.audiolibrosv1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Vector;

public class AdaptadorLibros extends RecyclerView.Adapter<AdaptadorLibros.ViewHolder> {
    private LayoutInflater inflador;
    protected Vector<Libro> vectorLibros;
    private Context contexto;

    public AdaptadorLibros(Context contexto, Vector<Libro> vectorLibros) {
        inflador = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.vectorLibros = vectorLibros;
        this.contexto = contexto;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView portada;
        public TextView titulo;
        public ViewHolder(View itemView) {
            super(itemView);
            portada = (ImageView) itemView.findViewById(R.id.portada);
            portada.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            titulo = (TextView) itemView.findViewById(R.id.titulo);
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.elemento_selector, null);
        return new ViewHolder(v);
    }

    public void onBindViewHolder(ViewHolder holder, int posicion) {
        Libro libro = vectorLibros.elementAt(posicion);
        holder.portada.setImageResource(libro.recursoImagen);
        holder.titulo.setText(libro.titulo);
    }

    public int getItemCount() {
        return vectorLibros.size();
    }

    private View.OnClickListener onClickListener;

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.elemento_selector, null);
        v.setOnClickListener(onClickListener);
        return new ViewHolder(v);
    }
}
