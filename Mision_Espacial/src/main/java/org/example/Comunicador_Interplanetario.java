package org.example;

import java.util.Scanner;
public class Comunicador_Interplanetario{
    public String analizarYTraducirMensaje(String mensaje) {
        // Analizar y traducir el mensaje
        return mensaje;
    }

    public int contarVocales(String mensaje) {
        int count = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < mensaje.length(); i++) {
            if (vocales.indexOf(mensaje.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public String invertirMensaje(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }

    public boolean verificarIntegridad(String mensaje) {
        String reversed = invertirMensaje(mensaje);
        return mensaje.equalsIgnoreCase(reversed);
    }
}