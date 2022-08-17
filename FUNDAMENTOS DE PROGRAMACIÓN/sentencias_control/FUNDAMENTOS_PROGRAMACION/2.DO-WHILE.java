/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edades_de_la_persona;

import java.util.Scanner;

/**
 *
 * @author cheli
 */
public class Edades_de_la_persona {//clase principal del programa 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//metodo principal del programa 
        // TODO code application logic here
        Scanner teclea = new Scanner (System.in);//objeto de leer introducir datos
        int edad,res;//declaración de variable tipo entero
        do{
            System.out.println("introduce la edad de una persona ");//mostrando en la pantalla la edad de persona introducida por teclado
            edad=teclea.nextInt();//lee la edad 
            res=99;//resultado =99
      }
        while(edad>99);//entrada de while (edad>99)
        System.out.println("el resultado es:" +res);}//mostrando el resultado en la pantalla
    }
  

    
