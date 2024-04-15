/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula3;

import java.util.*;

/**
 *
 * @author ACER
 */
public class DCC025 {
    
    public static void verificarAprovacao(double notaFinal, int numFaltas, int numTarefasRealizadas) {
        int aulasTotal = 60;
        int tarefasTotal = 45;

        double frequencia = ((aulasTotal - numFaltas) / (double)aulasTotal) * 100;
        
        if (notaFinal >= 60 && frequencia >= 75) {
            System.out.println("Aluno aprovado");
        } else if (notaFinal < 60 && frequencia >= 75 && numTarefasRealizadas >= tarefasTotal * 0.75) {
            System.out.println("O aluno tem direito de fazer a prova substitutiva");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double notaFinal = 0;
        int numFaltas = 0; 
        int numTarefasRealizadas = 0;
        
        for(int i=1; i<4; i++){
            System.out.println("Aluno " + i);
            
            System.out.print("Digite a nota final do aluno " + i + " : ");
            notaFinal = input.nextDouble();
            
            System.out.print("Digite o numero de faltas do aluno " + i + " : ");
            numFaltas = input.nextInt();
            
            System.out.print("Digite o numero de tarefas realizadas do aluno " + i + " : ");
            numTarefasRealizadas = input.nextInt();
            
            verificarAprovacao(notaFinal, numFaltas, numTarefasRealizadas);
            
            System.out.println("--------------------------------------");
        }
        
        
        
        
    }
}

