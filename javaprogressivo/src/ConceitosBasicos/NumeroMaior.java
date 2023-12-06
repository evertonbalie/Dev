/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConceitosBasicos;

import java.util.Scanner;

/**
 *
 * @author everton.rodrigues
 */
public class NumeroMaior {
    
    public static void main(String[] args) {
        
        int num1,num2,num3,temp1,temp2;
        
        Scanner ent= new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero");
        num1=ent.nextInt();
        System.out.println("Digite o segundo numero");
        num2=ent.nextInt();
        System.out.println("Digite o terceiro numero");
        num3=ent.nextInt();
        
        
        
        if(num1>num2){
        
        temp1=num1;
        
        if(temp1>num3){
            
            System.out.println("numero maior:"+num1);
            
        }
        }else if(num2>num3){
        
        temp2=num2;
        
        if(temp2>num3){
            
            System.out.println("numero maior:"+num2);
            
        }
  
        }else 
            
            System.out.println("numero maior:"+num3);
            
        }
    }
