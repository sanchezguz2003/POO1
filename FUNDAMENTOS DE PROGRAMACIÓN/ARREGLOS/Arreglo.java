/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import java.util.Scanner;

/**
 *
 * @author cheli
 */
public class arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int[] numeros = new int[5];

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<numeros.length; i++)
        {
            System.out.printf("Introduzca número %d: ", i+1);
            numeros[i] = teclado.nextInt();
        }

        for(i=0; i<numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
    }
}
        
    
    
