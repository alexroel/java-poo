
package test;

import encapsulamiento. *;
public class TestPersona {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Alex", 25, false);
        
        String estado =persona1.toString();
        System.out.println(estado);
        
        System.out.println(persona1.getNombre());
        
        persona1.setNombre("Alex Roel");
        persona1.setEdad(26);
        
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        
        System.out.println(persona1);
    }
}
