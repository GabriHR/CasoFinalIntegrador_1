package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sistema_Alerta_y_Monitoreo {
    private int[] variablesAmbientales;
    public Sistema_Alerta_y_Monitoreo(int[] variablesAmbientales) {
        this.variablesAmbientales = variablesAmbientales;
    }
    public void monitorearVariables() {
        System.out.println("Monitoreando variables ambientales:");
        for (int variable : variablesAmbientales) {
            System.out.println(variable);
        }
    }
    public void identificarEventosRaros() {
        System.out.println("Identificando eventos raros:");
        for (int variable : variablesAmbientales) {
            if (esPrimo(variable)) {
                System.out.println("Evento raro detectado: " + variable + " es un número primo.");
            }
        }
    }
    public void descomponerEnFactoresPrimos() {
        System.out.println("Descomponiendo variables en factores primos:");
        for (int variable : variablesAmbientales) {
            System.out.println(variable + " = " + factoresPrimos(variable));
        }
    }
    private boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    private List<Integer> factoresPrimos(int num) {
        List<Integer> factores = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                factores.add(i);
                num /= i;
            }
        }
        return factores;
    }
}