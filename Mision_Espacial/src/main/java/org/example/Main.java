package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

        //Planificador_de_Tareas
        Planificador_de_Tareas planificador = new Planificador_de_Tareas();
        planificador.visualizarTablaTareas(5);
        Map<String, Integer> tareas = new HashMap<>();
        tareas.put("Miembro1", 5);
        tareas.put("Miembro2", 7);
        Map<String, Integer> capacidad = new HashMap<>();
        capacidad.put("Miembro1", 2);
        capacidad.put("Miembro2", 3);
        System.out.println("Carga de trabajo óptima: " + planificador.calcularCargaTrabajo(tareas, capacidad));


        //Navegador_Estelar
        Navegador_Estelar explorador = new Navegador_Estelar(5, 5);
        int[][] construcciones = {
                {0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };
        explorador.planificarConstrucciones(construcciones);
        int[][] rutas = {
                {1, 0, 1, 1, 0},
                {0, 1, 0, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {1, 0, 1, 0, 1}
        };
        int[][] optimizado = explorador.optimizarRutasYRecursos(rutas);
        System.out.println("Terreno optimizado:");
        for (int i = 0; i < optimizado.length; i++) {
            for (int j = 0; j < optimizado[i].length; j++) {
                System.out.print(optimizado[i][j] + " ");
            }
            System.out.println();
        }


        //Comunicador_Interplanetario
        Comunicador_Interplanetario comunicador = new Comunicador_Interplanetario();
        String mensaje = "Hola, este mensaje está siendo enviado desde la Tierra";
        String mensajeTraducido = comunicador.analizarYTraducirMensaje(mensaje);
        int numVocales = comunicador.contarVocales(mensajeTraducido);
        String mensajeInvertido = comunicador.invertirMensaje(mensajeTraducido);
        boolean esIntegro = comunicador.verificarIntegridad(mensajeTraducido);

        System.out.println("Mensaje traducido: " + mensajeTraducido);
        System.out.println("Número de vocales: " + numVocales);
        System.out.println("Mensaje invertido: " + mensajeInvertido);
        System.out.println("Es el mensaje íntegro: " + esIntegro);
    }
}