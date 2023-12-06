/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprogressivo;

import java.util.Scanner;

/**
 *
 * @author teste
 */
public class If12 {
    
    public static void main (String [] Args){
    
  
   Scanner  ent = new Scanner(System.in);
  System.out.println("Digite sua nota:");
  int nota = ent.nextInt();
  
  
  if(nota==7){
      
  }
  if ( nota>7){
      System.out.println("Passou direto, seja Feliz e Boas Férias");
  }else if(nota>=5 && nota<=7){
      System.out.println("Voçê tem direito de fazer uma prova de recuperação");
  }
  
  else
      System.out.println(" reprovado direto");
 
   
    
    
    
    /*Problema: Crie um programa que recebe uma nota ( pela classe Scanner) e checa se você passou direto, ficou de recuperação ou foi reprovado na matéria, e exiba tal mensagem:
A regra é a seguinte:
Nota 7 ou mais: passou direto
Entre 5 e 7: tem direito de fazer uma prova de recuperação
Abaixo de 5: reprovado diret
    */
    
    }
    
    
}
