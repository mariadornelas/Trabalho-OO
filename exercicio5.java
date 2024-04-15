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
public class Aula4 {

    // Função para validar e-mail
    public static boolean validaEmail(String email) {
        String regexValidaEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern patternValidaEmail = Pattern.compile(regexValidaEmail);
        Matcher matcher = patternValidaEmail.matcher(email);
        return matcher.matches();
    }
    
    // Função para validar telefone
    public static boolean validaTelefone(String telefone) {
        String regexValidaTelefone = "^(\\+\\d{1,3}[- ]?)?\\(?\\d{2,3}\\)?[- ]?\\d{4,5}[- ]?\\d{4}$";
        Pattern patternValidaTelefone = Pattern.compile(regexValidaTelefone);
        Matcher matcher = patternValidaTelefone.matcher(telefone);
        return matcher.matches();
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String email, telefone;
        
        System.out.println("Sistema de Validação:");
        
        while(true){
            System.out.println("\nO que você deseja validar?");
            System.out.println("1 - Email");
            System.out.println("2 - Telefone");
            System.out.println("3 - Finalizar programa");
            System.out.print("Opção: ");
            int opcao = input.nextInt();
            
            System.out.println("-----------------------------");
            
            switch(opcao){
                case 1:
                    System.out.print("Digite o email a ser validado: ");
                    email = input.next();
                    
                    System.out.println("O e-mail é válido? " + validaEmail(email));
                    
                    break;
                case 2:
                    System.out.print("Digite o telefone a ser validado: ");
                    telefone = input.next();
                    
                    System.out.println("O número de telefone é válido? " + validaTelefone(telefone));
                    
                    break;
                case 3:
                    System.out.println("Programa finalizado.");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }    
    }
}
