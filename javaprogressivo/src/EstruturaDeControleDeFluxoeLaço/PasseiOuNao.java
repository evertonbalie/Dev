/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDeControleDeFluxoeLaço;

import java.util.Scanner;



/**
 *
 * @author everton.rodrigues
 */
public class PasseiOuNao {
    
    
    
    
    public static void main(String[] args) {
        
        float nota;
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a sua nota [0.0 - 10.0]:");
        nota= entrada.nextFloat();
        
        if((nota<=10.0) && (nota>=0.0)){
        
        System.out.println("nota válida");
    
    }else{
         System.out.println("nota inválida");
        
        
        }         
    }
       
}
