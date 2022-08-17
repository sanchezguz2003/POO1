/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo3;

import java.util.Scanner;

/**
 *
 * @author cheli
 */
public class Arreglo3 {//clase principal del programa 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//metodo principal del programa 
        Scanner leer = new Scanner(System.in);//objeto de leer para introducir datos
        char caracter[]= new char[10];
        System.out.println("digita los datos en el arreglo");//mostrando los digito de los datos de arreglo en la pantalla
        for(int i=0;i<10;i++){//entrada de for (variable tipo entero i=0;i<10;i++)
            System.out.println("introduce el primer caracter ["+i+"]");//mostrando el primer caracter en la pantalla 
            caracter [i]= leer.next().charAt(0);//lee el mensaje 
        }
         System.out.println("imprimir el arreglo en forma inversa");//mostrando el arreglo en forma inversa en la pantalla 
         int s=9;//variable tipo entro s=9
         while (s>=0){//entrada de while (s>=0)
             System.out.println("valor de ["+s+"]:"+caracter[s]);//mostrando el valor de s mas caracter[s]
             s--;//decrementa 
         }
    }
    
}
