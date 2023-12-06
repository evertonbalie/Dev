/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDeControleDeFluxoeLaço;

/**
 *
 * @author everton.rodrigues
 */
public class WhilePG06 {
    public static void main(String[] args) {        
     
        int inicial=1,
            quociente=2,
            gn=inicial,
            valor_max=32;
        
        System.out.printf("Elementos da PG, de valor inicial %d e razão %d, menores que %d\n", inicial, quociente, valor_max );
        while(gn<=valor_max){
            System.out.println(gn);
            gn *= quociente;
        }
    }
    }

