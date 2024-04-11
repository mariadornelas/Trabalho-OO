package com.mycompany.aula4;

import java.util.*;

/**
 *
 * @author ACER
 */
public class DCC025 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] x = new double[2];
        double[] y = new double[2];

        // Lendo as coordenadas dos três pontos
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite a coordenada x do ponto " + (i+1) + ": ");
            x[i] = input.nextDouble();
            System.out.print("Digite a coordenada y do ponto " + (i+1) + ": ");
            y[i] = input.nextDouble();
        }

        // Calculando as distâncias entre os pontos
        double distancias;
        distancias = Math.sqrt(Math.pow(x[1] - x[0], 2) + Math.pow(y[1] - y[0], 2));
        
        System.out.print("A distância entre os pontos e: " + distancias);
    }
}
