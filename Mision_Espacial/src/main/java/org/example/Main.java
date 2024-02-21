package org.example;

public class Main {
    public static void main(String[] args) {

        //Cronometro_Cosmico
        Cronometro_Cosmico planeta = new Cronometro_Cosmico();

        double tiempoTerrestre = 1.0;
        double tiempoPlaneta = planeta.convertirTiempo(tiempoTerrestre);

        System.out.println("Tiempo en la Tierra: " + planeta.formatearTiempo(tiempoTerrestre));
        System.out.println("Tiempo en el nuevo planeta: " + planeta.formatearTiempo(tiempoPlaneta));

    }
}