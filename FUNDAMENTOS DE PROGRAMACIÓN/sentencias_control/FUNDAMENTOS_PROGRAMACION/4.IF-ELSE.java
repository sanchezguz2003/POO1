/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paty_lu;

import java.util.Scanner;

/**
 *
 * @author cheli
 */
public class Paty_lu {//

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);//
        int can_clientes,costo_platillo=0;//
        double porc_descuento=0.05;//
        int subtotal=0;//
        float descuento=0;//
        int presupuesto;//
        boolean and;
        System.out.println("introduce la cantidad de clientes");//
        can_clientes=leer.nextInt();
        if(can_clientes>300){
            costo_platillo=75;
        }else{
            if(can_clientes>200){
                costo_platillo=85;
                }else{
                if(can_clientes<=300){
                    costo_platillo=85;
            } else{
                    if(can_clientes<=200){
                        costo_platillo=95;
                     subtotal=costo_platillo*can_clientes;   
                    }else{
                        if(subtotal>10000){
                       descuento=subtotal*descuento;     
                        }else{
                            descuento=0;
                            presupuesto = (int) (subtotal-descuento);
                            System.out.println("el presupuesto es de :"+presupuesto);
                        }
                    }
                    
                    
                    }
                    
                    }
        
        
        
        
    }

    
    }
    }
    

