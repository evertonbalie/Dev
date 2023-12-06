/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConceitosBasicos;

import java.util.Scanner;

public class Equacao2Grau {
    
    public static void main(String[] args) {
        
        float a,b,c,delta,sqrtdelta,raiz1,raiz2;
        
        //passo 1 - Recebendo os coeficientes
        Scanner ent = new Scanner(System.in);     
        System.out.println("Equacao do 2° grau: ax²+bx+cx=0");
         System.out.println("Entre com o valor de a:");
        a=ent.nextFloat();
       System.out.println("Entre com o valor de b:");
        b=ent.nextFloat();
        System.out.println("Entre com o valor de c:");
        c=ent.nextFloat();
        
        
        //passo 2 - Checando se a aquação é válida
        if(a!=0){
        
            //passo 3 - recebendo o valor de delta e calculando a raiz
            delta=(b*b)-(4*a*c);
            sqrtdelta=(float)Math.sqrt(delta);           
            //passo 4 - se a rais de delta for maio que 0, as raizes são reais
            if(delta>0){
            raiz1=((-1)*b+sqrtdelta)/(2*a);
            raiz2=((-1)*b-sqrtdelta)/(2*a);
            System.out.printf("Raizes:%.2f e %.2f",raiz1,raiz2);                  
            
              //Passo 5: se delta for menor que 0, as raízes serão complexas
            }else{
            
            delta=-delta;
             delta = -delta;
                sqrtdelta = (float)Math.sqrt(delta);
                System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
            
            }
        }else
                    
        System.out.println("Coeficiente 'a' invalido. Não é uma equação do 2° grau");
                    
                    
                    
        }
        
        
        }
       
    

