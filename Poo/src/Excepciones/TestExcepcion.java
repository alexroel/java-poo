package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcepcion {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        boolean continuarEjecucion = true;

        do {
            //Controlar errores 
            try {
                System.out.print("Ingrese N1: ");
                int n1 = leer.nextInt();
                System.out.print("Ingrese N2: ");
                int n2 = leer.nextInt();

                int resustado = dividir(n1, n2);

                System.out.println("Resultado -> " + resustado);
                
                continuarEjecucion = false;

                //Capturar errores y imprimer una Excepción 
            } catch (InputMismatchException e) {
                //Mandar un mensaje sobre el supuesto error 
                System.err.println("Ocurrio un error: Ingrese solo números enteros");
                //e.printStackTrace(System.out);
                leer.nextLine();
            } catch (OperadorExcepcion e) {
                System.err.println("Error: "+ e.getMessage());
            } catch (Exception e) {
                e.printStackTrace(System.out);
            } finally {
                System.out.println("Se reviso la división");
            }
        } while (continuarEjecucion);

    }
    
    static int dividir(int n, int d){
        if (d == 0){
            throw new OperadorExcepcion("División entre cero");
        }
        return n / d;
    }
}
