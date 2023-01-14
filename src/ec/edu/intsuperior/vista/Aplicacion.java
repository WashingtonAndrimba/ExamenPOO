/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Personas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        Scanner opcion=new Scanner(System.in);
        System.out.println("Menu de multiple regisgtro");
        System.out.println("1-Empleado");
        System.out.println("2-Cliente");
        System.out.println("3-Directivo");
        System.out.println("4-Empresa");
        System.out.println("5-Salir"+"\n");
        
        System.out.println("Elija una opcion");
        int opc=opcion.nextInt();
        switch (opc){
            case 1: 
                System.out.println("Menu de registro empleados");
                System.out.println("Ingrese La Cedula, Nombre, Edad, Sueldo del empleado"+"\n");
                Personas per=new Personas(leer.nextInt(),leer.next(),leer.nextInt());
                Empleado emp=new Empleado(leer.nextInt());
                System.out.println("\n"+"Ingrese La Cedula, Nombre, Edad, Sueldo del empleado numero dos");
                Personas per2=new Personas(leer.nextInt(),leer.next(),leer.nextInt());
                Empleado emp2=new Empleado(leer.nextInt());
                System.out.println("");
                System.out.println("Empleado 1");
                System.out.println(per.toString());
                System.out.println(emp.toString());
                System.out.println("");
                System.out.println("Empleado 2");
                System.out.println(per2.toString());
                System.out.println(emp2.toString());
            break;
            
            case 2:
                System.out.println("Menu de registro clientes"+"\n");
                System.out.println("Ingrese la cedula, el nombre, edad y numero telefonico");
                Personas pe=new Personas(leer.nextInt(),leer.next(),leer.nextInt());
                Cliente tel=new Cliente(leer.nextInt());
                System.out.println("Ingrese la cedula, el nombre, edad y numero telefonico del segundo cliente");
                Personas pe2=new Personas(leer.nextInt(),leer.next(),leer.nextInt());
                Cliente te2=new Cliente(leer.nextInt());
                System.out.println("Cliente 1");
                System.out.println(pe.toString());
                System.out.println(tel.toString());
                System.out.println("Cliente 2");
                System.out.println(pe2.toString());
                System.out.println(te2.toString());
                break;
            case 3:
                System.out.println("Categorias de empleados");
                System.out.println("Ingrese la categoria del empleado (patron/empleador/trabajador familiar/empleado/asalariado)");
                System.out.println("Categoria 1");
                Directivo cat=new Directivo(leer.next());
                System.out.println("Ingrese el sueldo: ");
                Empleado suu=new Empleado(leer.nextInt());
                System.out.println("Categoria 2");
                Directivo cat2=new Directivo(leer.next());
                System.out.println("Ingrese el sueldo: ");
                Empleado suu2=new Empleado(leer.nextInt());
                System.out.println("Categoria 3");
                Directivo cat3=new Directivo(leer.next());
                System.out.println("Ingrese el sueldo: ");
                Empleado suu3=new Empleado(leer.nextInt());
                
                System.out.println(cat.toString());
                System.out.println(suu.toString());
                System.out.println(cat2.toString());
                System.out.println(suu2.toString());
                System.out.println(cat3.toString());
                System.out.println(suu3.toString());
                break;
            
            case 4:
                System.out.println("Menu de la empresa");
                System.out.println("Nombre de la empresa 1");
                Empresa empr=new Empresa(leer.next());
                System.out.println("Registro de un empleado y 2 de sus clientes");
                System.out.println("Ingrese La cedula, Nombre, Edad del empleado");
                Personas perrr=new Personas(leer.nextInt(), leer.next(), leer.nextInt());
                System.out.println("Ingrese el cliente numero 1 y su numero Telefonico");
                System.out.println("Cedula, Nombre, Edad, Telefono del cliente");
                Personas clii=new Personas (leer.nextInt(), leer.next(), leer.nextInt());
                Cliente clite=new Cliente(leer.nextInt());
                System.out.println("Ingrese el cliente numero 2 y su numero Telefonico");
                System.out.println("Cedula, Nombre, Edad, Telefono del cliente");
                Personas clii1=new Personas (leer.nextInt(), leer.next(), leer.nextInt());
                Cliente clite1=new Cliente(leer.nextInt());
                System.out.println("Nombre de la empresa");
                System.out.println(empr.toString());
                System.out.println("");
                System.out.println("Datos del Empleado");
                System.out.println(perrr.toString());
                System.out.println("");
                System.out.println("Datos del Cliente 1");
                System.out.println(clii.toString());
                System.out.println(clite.toString());
                System.out.println("");
                System.out.println("Datos del cliente 2");
                System.out.println(clii1.toString());
                System.out.println(clite1.toString());
                break;
            case 5:
                System.out.println("Gracias por utilizar este programa");
                break;
                
                
        }
    }
        
}
