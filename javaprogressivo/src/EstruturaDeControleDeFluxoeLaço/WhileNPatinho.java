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
public class WhileNPatinho {
    
    public static void main(String[] args) {
        
        int n;
        int q=0;
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o n° de patinho a passear");
        n=ent.nextInt();
        
       
            
        System.out.println( 
                
n+" patinhos foram passear\n" +
"Além das montanhas\n" +
"Para brincar\n" +
"A mamãe gritou: Quá, quá, quá, quá Mas só "+1+" patinhos voltaram de lá.\n" +
"\n" +
"\n" +
"Que se repete até nenhum patinho voltar de lá.\n" +
"Ao final, todos os patinhos voltam:\n" +
"\n" );
             while(n!=0){
            
            n--;
        System.out.println(
"\"A mamãe patinha foi procurar\n" +
"\"Além das montanhas\n" +
"\"Na beira do mar\n" +
"\"A mamãe gritou: Quá, quá, quá, quá\n" +
"\"E os "+ n +" patinhos voltaram de lá.\"); \n" +
"");
        
   

        
        }
        
        
    }
         
}
