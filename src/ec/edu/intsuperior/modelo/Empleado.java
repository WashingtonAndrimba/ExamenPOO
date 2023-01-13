/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Usuario
 */
public class Empleado extends Personas{
    private Integer sueldo;


    
    
   
   public Empleado(){
    }

    public Empleado(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return  
                "Sueldo del empleado: "+getSueldo();
    }
   
}
