package org.example;

public class Cancion extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;

    public Cancion(String titulo, String autor, int duracionSeg) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
    }

    @Override
    public int getDuracionSeg() {
        return duracionSeg;
    }

    @Override
    public String tipo() {
        return "Canción";
    }

    @Override
    public double calcularTamanoMB() {
        return (duracionSeg / 60.0) * 1.5;
    }

    @Override
    public void reproducir() {
        System.out.printf("Reproduciendo canción: %s (%d:%02d)%n",
                getTitulo(), duracionSeg / 60, duracionSeg % 60);
    }
}
