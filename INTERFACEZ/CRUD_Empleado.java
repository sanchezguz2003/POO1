/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *interfaz metodo empleado
 * @author cheli
 */
public interface CRUD_Empleado {
    /**
     * lista metodos
     * 
     * @param id
     * @param nombre
     * @return 
     */
    public String insertarEmpleado(int id,String nombre);
    
    public String actualizarEmpleado(String nombre);
    
    public String borrarEmpleado(int id);
    
    public String consultarEmpleado(int id,String nombre);
    
}
