/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ACER
 */

public class DCC025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor a ser investido por mês: ");
        double investimentoMensal = scanner.nextDouble();

        System.out.print("Informe a taxa de juros mensal: ");
        double taxaJurosMensal = scanner.nextDouble() / 100;

        double saldo = 0;
        int ano = 1;

        while (true) {
            for (int i = 0; i < 12; i++) {
                saldo += investimentoMensal;
                saldo += saldo * taxaJurosMensal;
            }

            System.out.printf("Saldo após o ano %d: R$%.2f%n", ano, saldo);

            System.out.print("Deseja calcular o próximo ano? (s/n): ");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
            ano++;
        }
    }
}

