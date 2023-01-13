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
public class Cliente extends Personas{
    private Integer telefono;

    public Cliente() {
    }

    public Cliente(Integer telefono) {
        this.telefono = telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Telefono del cliente: "+getTelefono();
    }
    
    
}
