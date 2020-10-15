
package interfaces;
//Definición de un interface 
public interface BaseDatos {
    //Los atributos o variables son staticos o final por defecto
    int MAXIMO_DATOS = 10;
    //Los métodos son abstractos por defecto 
    void insertar();
    void listar();
    void actualisar();
    void eliminar();
}
