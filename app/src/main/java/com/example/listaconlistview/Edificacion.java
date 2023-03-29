package com.example.listaconlistview;

public class Edificacion {
    private int imagen;
    private String domicilio;
    private Double precio;

    public Edificacion(int imagen, String domicilio, Double precio) {
        this.imagen = imagen;
        this.domicilio = domicilio;
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
