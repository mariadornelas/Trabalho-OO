/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dcc025;

import java.util.*;
import javax.swing.*;
/**
 *
 * @author ACER
 */
public class DCC025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double memoria = 0;
        double v1 = 0;
        double v2 = 0;
        
        System.out.println("Calculadora:");
        
        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Finalizar programa");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            
            System.out.println("-----------------------------");
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro valor a ser somado: ");
                    v1 = scanner.nextDouble();
                    
                    System.out.print("Digite o segundo valor a ser somado: ");
                    v2 = scanner.nextDouble();
                    
                    memoria = v1 + v2;
                    
                    System.out.println("----------RESULTADO-----------");
                    
                    System.out.print("O resultado é: " + memoria);
                    
                    memoria = 0;
                    break;
                case 2:
                    System.out.print("Digite o primeiro valor a ser subtraido: ");
                    v1 = scanner.nextDouble();
                    
                    System.out.print("Digite o segundo valor a ser subtraido: ");
                    v2 = scanner.nextDouble();
                    
                    memoria = v1 - v2;
                    
                    System.out.println("----------RESULTADO-----------");
                    
                    System.out.print("O resultado é: " + memoria);
                    
                    memoria = 0;
                    break;
                case 3:
                    System.out.print("Digite o primeiro valor a ser multiplicado: ");
                    v1 = scanner.nextDouble();
                    
                    System.out.print("Digite o segundo valor a ser multiplicado: ");
                    v2 = scanner.nextDouble();
                    
                    memoria = v1 * v2;
                    
                    System.out.println("----------RESULTADO-----------");
                    
                    System.out.print("O resultado é: " + memoria);
                    
                    memoria = 0;
                    break;
                case 4:
                    System.out.print("Digite o dividendo: ");
                    double dividendo = scanner.nextDouble();

                    System.out.print("Digite o divisor: ");
                    double divisor = scanner.nextDouble();

                    if (divisor != 0) {
                        memoria = dividendo / divisor;
                        
                        System.out.println("----------RESULTADO-----------");
                        
                        System.out.print("O resultado é: " + memoria);
                    } else {
                        System.out.println("ERRO: Não pode ser feita divisão por 0!");
                    }
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
