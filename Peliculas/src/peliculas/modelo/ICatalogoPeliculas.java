
package peliculas.modelo;

public interface ICatalogoPeliculas {
    void insertarPelicula(Pelicula nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);
}
