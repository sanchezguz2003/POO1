/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_1;

import java.util.Scanner;

/**
 *
 * @author cheli
 */
public class Arreglo_1 {//clase principal del programa 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//metodo proncipal del programa 
        Scanner leer = new Scanner(System.in);//objeto de leer para introducir datos
        int tamaño;//declaración de variable tipo entero
        int arreglo[];
        
        System.out.println("¿Cuántos elementos tendrá el arreglo?");//mostrando en la pantalla cuantos elementos tendrá el arreglo 
        tamaño = leer.nextInt();//lee el mensaje 
        arreglo=new int[tamaño];
        
         int i=0;
        while(i<=arreglo.length-1){//entrada de while (i<=arreglo.lenght-1)
            System.out.println("introduce un valor para la posición ["+i+"]:");//mostrando el valor de la posición en la pantalla
            arreglo [i]=leer.nextInt();//lee el mensaje 
            i++;//incrementa 
        }
        i=0;//i es igual cero
        while(i<=arreglo.length-1){//entrada de while 
        System.out.println("posición ["+i+"]:"+arreglo [i]);//mostrando la posición en la pantalla 
        i++;//incrementa 
        }
    }
    
}
