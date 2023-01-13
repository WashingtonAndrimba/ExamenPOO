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
public class Empresa extends Personas{
    
    public String nombree;
    
    public Empresa() {
    }

    public Empresa(String nombree) {
        this.nombree = nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    public String getNombree() {
        return nombree;
    }

    @Override
    public String toString() {
        return "Nombre de la empresa: "+getNombree();
    }
    
    
}
