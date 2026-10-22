package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Cielo de Xela",
                "Banda Quetzal", 210);
        Cancion c2 = new Cancion("Marimba al Atardecer",
                "Los Tecomates", 180);
        Podcast p1 = new Podcast("Código y Café",
                "Ana Ruiz", 1800, 12);
        LibroDigital l1 = new LibroDigital(
                "Estructuras de Datos", "Marco Pérez", 320);
        List<Contenido> catalogo = List.of(c1, c2, p1, l1);
        List<Reproducible> paraEscuchar = List.of(c1, c2, p1);
        List<Descargable> paraDescargar = List.of(c1, c2, p1, l1);

        for (Contenido c : catalogo) {
            System.out.println(c);
        }
        System.out.println("--- Reproduciendo ---");
        for (Reproducible r : paraEscuchar) {
            r.reproducir();
        }
        int seg = tiempoTotalSeg(paraEscuchar);
        System.out.println("Tiempo total: " + seg / 60 + " min " + seg % 60 + " s");
        System.out.println("--- Descargas ---");
        double mb = espacioTotalMB(paraDescargar);
        System.out.println("Espacio necesario: " + mb + " MB");
    }

    static int tiempoTotalSeg(List<Reproducible> reproducibles) {
        int total = 0;
        for (Reproducible r : reproducibles) {
            total += r.getDuracionSeg();
        }
        return total;
    }

    static double espacioTotalMB(List<Descargable> descargables) {
        double total = 0;
        for (Descargable d : descargables) {
            total += d.calcularTamanoMB();
        }
        return total;
    }
}
