package org.example;
public class Cronometro_Cosmico {
    static final double DURACION_DIA = 30.0;
    //Convierte el tiempo terrestre a tiempo en el nuevo planeta
    public double convertirTiempo(double tiempoTerrestre) {
        return tiempoTerrestre / DURACION_DIA * 24.0;
    }
    //Formatea el tiempo en segundos, minutos, horas, días y años
    public String formatearTiempo(double tiempo) {
        double segundos = tiempo * 24 * 60 * 60;
        double minutos = tiempo * 24 * 60;
        double horas = tiempo * 24;
        double dias = tiempo;
        double anos = tiempo / 365.25;
        //Devuelve el tiempo formateado
        return String.format("Segundos: %.2f, Minutos: %.2f, Horas: %.2f, Días: %.2f, Años: %.2f",
                segundos, minutos, horas, dias,anos);
    }
}