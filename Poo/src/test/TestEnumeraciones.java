
package test;

import enumeraciones.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println(Dias.DOMINGO);
        System.out.println(Dias.LUNES);
        
        System.out.println(Continentes.AMERICA);
        System.out.println(Continentes.AMERICA.getPaises());
        
        Continentes continete = Continentes.EUROPA;
        System.out.println(continete.getPaises());
    }
}
