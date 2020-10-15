
package test;

import herencia.*;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {     
        
        Empleado empleado = new Empleado(3000, "Roel");
        imprimer(empleado);
        
        var fecha = new Date();
        Clientes cliente = new Clientes(fecha, true, "Juan", 'M', 25, "Santo Tomas");
        imprimer(cliente);
        
        String nombre = "Alex Roel";  
        determinarTipo(nombre);
        
        //Conversion de Objetos 
        //Downcasting 
        Persona persona1 = new Empleado(3000, "Alex Roel");
        Empleado empleado1 = (Empleado) persona1;
        System.out.println(empleado1.obtenerDetalle());
        
        //Upcasting 
        Persona persona2 = empleado1;
        System.out.println(persona2.obtenerDetalle());
        
        Persona p1 = new Persona("Alex", 'M', 25, "Cusco");
        Persona p2 = new Persona("Alex", 'F', 25, "Cusco");
        
        System.out.println(p1.equals(p2));
        
        if (p1.hashCode() == p2.hashCode()){
            System.out.println("Que los objetos son iguales");
        }else{
            System.out.println("Los Objetos no son iguales");
        }
          
    }
    
    public static void imprimer(Persona persona){
        System.out.println(persona.obtenerDetalle());
    }
    
    public static void determinarTipo(Object objeto){
        if (objeto instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }else if(objeto instanceof Clientes){
            System.out.println("Es de tipo Cliente");
        }else if(objeto instanceof Persona){
            System.out.println("Es de tipo Persona");
        }else if(objeto instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
