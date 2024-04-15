/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula4;

import java.util.*;

/**
 *
 * @author ACER
 */
public class DCC025 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número para ser calculado a série de Fibonacci: ");
        int n = input.nextInt();
        
        System.out.println("A sérrie de Fibonacci do numero " + n + " é:");
        for (int i = 1; i <= n; i++) {
            System.out.print(calculoDeFibonacci(i) + " ");
        }
    }
    
    public static int calculoDeFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculoDeFibonacci(n - 1) + calculoDeFibonacci(n - 2);
        }
    }
}
