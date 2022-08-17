/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * clase principal
 *@version 1.0
 * @author cheli
 * 
 */
public class principal {
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * construyendo los objetos
         * @see interfaz CRUD_Empleado y clase implementar_crud_empleado
         */
      CRUD_Empleado operaciones=new implementar_crud_empleado();
      
      operaciones.insertarEmpleado(1,"Diana");
      
      operaciones.actualizarEmpleado("Diana");
      
      operaciones.borrarEmpleado(1);
      
      operaciones.consultarEmpleado(1, "Diana");
      
        
    }  
}
