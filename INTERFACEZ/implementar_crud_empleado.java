/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cheli
 */
public class implementar_crud_empleado implements CRUD_Empleado {
   private String id;
   /**
    * metodo para insertar datos empleado
    * @see CRUD_Empleado(Interfaz)
    * @param id
    * @param nombre
    * @return 
    */

    @Override
    public String insertarEmpleado(int id, String nombre) {
        System.out.println("datos guardados"  + "\nCon id:"+id+"\nNombre:"+nombre);
        return null;
    }

    @Override
    public String actualizarEmpleado(String nombre) {
        System.out.println("datos del empleado "+nombre+  "actualizados correctamente");
        return null;
    }

    @Override
    public String borrarEmpleado(int id) {
        System.out.println("datos del empleado con id: "+id+"eliminados");
        return null;
    }

    @Override
    public String consultarEmpleado(int id, String nombre) {
       System.out.println("datos del empleado: "+
                           "\nid empleado: "+id
                            +"\nNombre empleado:"+nombre);
        return null; 
    }
    
    
}
