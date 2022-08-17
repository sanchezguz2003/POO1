/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_gral;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cheli
 */
public class Menu_gral {//clase principal del programa 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//metodo principal del programa 
        // TODO code application logic here
         Scanner leer=new Scanner(System.in);//objeto de leer para introducir datos
        boolean salir = false;
        int opc;//declaración de variable tipo entero

while (!salir){//entrada de while (!salir)
System.out.println("Menú de actividades ");//mostrando menu de actividades en la pantalla
System.out.println("1. Mostrar tabla de multiplicar ");//mostrando la tabla de multiplicar en la pantalla
System.out.println("2. Sumar un rango de números ");//mostrando la suma de rango en la pantalla
System.out.println("3. Comparar tres números ");//mostrando comparaciones de número en la pantalla
System.out.println("4. Incrementar 12% a un número ");//mostrando el incremento de 12% de un número en la pantalla 
System.out.println("5. Sumar 10 números ");//mostrando suma de 10 números en la pantalla
System.out.println("6. Mostrar mes a partir de un número ");//mostrando mes a partir de un número en la pantalla
System.out.println("7. Salir ");//mostrando salir en la pantalla
try {

    System.out.println("Elige una opción: ");//mostrando opciones en la pantalla 
    opc = leer.nextInt();//lee la opción 
    switch (opc) {//la entrada de switch 
        case 1://caso 1
            break;//rompe el ciclo
        case 2://caso 1
            int res;//declaración de variable tipo entero
            do {
                int num, fac = 1;//declaración de variable tipo entero
                System.out.println("Introduzca un numero entero:");//mostrando el número entero en la pantalla 
                num = leer.nextInt();//lee el número 
                for (int i = num; i >= 1; i--) {//entrada de for (int i=num; i>=1; i--)
                    fac = i * fac;
                }
                System.out.println("El factorial es: " + fac);//mostrando el resultado de factorial en la pantalla
                System.out.println("Desea calcular otro factorial1:Si / 2: No");//mostrando el mensaje en la pantalla
                res = leer.nextInt();//lee el resultado 
            } while (res != 2);//entrada de while (resultado !=2)
        case 3://caso 3
            break;//rompe el ciclo
        case 4://caso 4
            do {
                double numx1 = 0, numx2;//double numx1=0, numx2;
                System.out.println("Incrementa el 16%");//mostrando el incremento de 16% en la pantalla
                System.out.println("Introduce un número: ");//mostrando el número introducido por teclado 
                numx2 = numx1 * 1.16;//numx2=numx1*1.16;
                System.out.println("El incremento de " + numx1 + " al 16%es: " + numx2);//mostrando el incremento de numx1 al 16% es: numx2 en la pantalla
                System.out.println("Desea incrementar otro número 1:Si/ 2: No");//mostrando el incremento  de otros números en la pantalla
                res = leer.nextInt();//lee el resultado
            } while (res != 2);//entrada de while (resultado !=2)
            break;//rompe el ciclo 
        case 5://caso 1
            do {
                int numy, sum = 1;//declaración de variable tipo entero 
                System.out.println("Sumar 10 numeros");//mostrando la suma de 10 numeros en la pantalla
                for (int i = 1; i <= 10; i++) {//for (int i=1; i<=10; i++)
                    System.out.println("Introduce el numero" + i);//mostrando en la pantalla el número introducido por teclado 
                }
                numy = leer.nextInt();//lee número
                sum = sum + numy;//suma=suma+número 
                System.out.println("El resultado es: " + (sum - 1));//mostrando en la pantalla el resultado de (suma-1)
                System.out.println("Desea incrementar otro número 1:Si/ 2: No");//
                res = leer.nextInt();//lee el resultado 
            } while (res != 2);//entrada de while (resultado !=2)
            break;//rompe el ciclo
        case 6://caso 6
            break;//rompe el ciclo
        case 7://caso 7
            break;//rompe el ciclo 
        default://("opción no valida") 

            System.out.println("Opción 1 a 7");//mostrando el mensaje la  opción 1 a 7 en la pantalla
    }
}catch(InputMismatchException e){
    System.out.println("debes un número");//mostrando el mensaje si debes un número en la pantalla
    leer.next();//lee 

}
}
System.out.println("Desea realizar otra actividad 1: si, 2: no ");//mostrando el mensaje si desea realizar otra actividad 1: si, 2: no en la pantalla 
}
}
 

    
    

