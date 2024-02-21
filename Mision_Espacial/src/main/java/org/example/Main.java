package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Cronometro_Cosmico
        Cronometro_Cosmico planeta = new Cronometro_Cosmico();

        double tiempoTerrestre = 1.0;
        double tiempoPlaneta = planeta.convertirTiempo(tiempoTerrestre);

        System.out.println("Tiempo en la Tierra: " + planeta.formatearTiempo(tiempoTerrestre));
        System.out.println("Tiempo en el nuevo planeta: " + planeta.formatearTiempo(tiempoPlaneta));

        //Recursos_y_Suministros
        double[] recursos = {10.0, 20.0, 30.0};
        double umbralSeguro = 15.0;
        Recursos_y_Suministros recursosObj = new Recursos_y_Suministros(recursos, umbralSeguro);
        recursosObj.imprimirValores();
        double[] consumo = recursosObj.calcularConsumo(7);
        System.out.println("Consumo para 7 días: " + Arrays.toString(consumo));
        double[] proyeccion = recursosObj.proyectarConsumoFuturo(30);
        System.out.println("Proyección para 30 días: " + Arrays.toString(proyeccion));
        boolean alerta = recursosObj.alertaUmbralSeguro();
        System.out.println("Alerta de umbral seguro: " + alerta);
        double[] estadisticas = recursosObj.estadisticasUso();
        System.out.println("Estadísticas de uso: Promedio = " + estadisticas[0] + ", Mínimo = " + estadisticas[1] + ", Máximo = " + estadisticas[2]);

        //Sistema_Alerta_y_Monitoreo
        int[] variablesAmbientales = {10, 20, 30, 40, 41};
        Sistema_Alerta_y_Monitoreo monitoreo = new Sistema_Alerta_y_Monitoreo(variablesAmbientales);
        monitoreo.monitorearVariables();
        monitoreo.identificarEventosRaros();
        monitoreo.descomponerEnFactoresPrimos();

    }
}




