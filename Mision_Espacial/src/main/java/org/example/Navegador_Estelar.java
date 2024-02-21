package org.example;
public class Navegador_Estelar{
    private int[][] terreno;

    public Navegador_Estelar(int filas, int columnas) {
        this.terreno = new int[filas][columnas];
    }

    public void planificarConstrucciones(int[][] construcciones) {
        // Asumiendo que las construcciones es una matriz de la misma dimensión que terreno
        // y que un valor de 1 en construcciones indica una construcción planeada
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno[i].length; j++) {
                terreno[i][j] += construcciones[i][j];
            }
        }
    }

    public int[][] optimizarRutasYRecursos(int[][] rutas) {
        // Asumiendo que rutas es una matriz de la misma dimensión que terreno
        // y que un valor de 1 en rutas indica una ruta planeada
        int[][] optimizado = new int[terreno.length][terreno[0].length];
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno[i].length; j++) {
                optimizado[i][j] = terreno[i][j] * rutas[i][j];
            }
        }
        return optimizado;
    }

    public void visualizarTerreno() {
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno[i].length; j++) {
                System.out.print(terreno[i][j] + " ");
            }
            System.out.println();
        }
    }
}