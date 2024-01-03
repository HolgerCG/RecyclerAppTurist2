package com.example.recyclerappturist.model;

public class Lugar {
    private String categoria_id;
    private String categoria;
    private String subcategoria;
    private String subcategoria_id;
    private String nombre_lugar;
    private String imagenes_gif;

    public String getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(String categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getSubcategoria_id() {
        return subcategoria_id;
    }

    public void setSubcategoria_id(String subcategoria_id) {
        this.subcategoria_id = subcategoria_id;
    }

    public String getNombre_lugar() {
        return nombre_lugar;
    }

    public void setNombre_lugar(String nombre_lugar) {
        this.nombre_lugar = nombre_lugar;
    }

    public String getImagenes_gif() {
        return imagenes_gif;
    }

    public void setImagenes_gif(String imagenes_gif) {
        this.imagenes_gif = imagenes_gif;
    }
}
