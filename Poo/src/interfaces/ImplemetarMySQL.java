
package interfaces;

public class ImplemetarMySQL implements BaseDatos{

    @Override
    public void insertar() {
        System.out.println("Se inserto un dato");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos");
    }

    @Override
    public void actualisar() {
        System.out.println("Actualizando un dato ");
    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino un dato");
    }
    
}
