package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {


    Libro libro;
    Biblioteca biblioteca = new Biblioteca();


    @BeforeEach
    void setUp() {
        libro = new Libro("El Quijote", "Cervantes", 1700);
    }

    /*Comprobamos que se ha agregado el libro, ya que es un métoodo booleano
    * y lo comprobamos mediante assertTrue.*/
    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro));
    }

    /*Comprobamos que devuelve true, ya que es un métoodo booleano que devuelve true
    * si se elimiena el libro pasado por parámetro. Antes de ello, añadimos un libro
    * a la lista biblioteca para poder eliminarlo.*/
    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.eliminarLibro(libro));
    }

    /*Versión en la que testeamos el métoodo encuentraLibroPorTitulo() en la que
    * el libro en cuestión es encontrado; por ello, el métoodo devuelve un objeto Libro.
    * Se ha empleado el métoodo assertSame, ya que lo he planteado como una comparación
    * entre objetos, debido a que el métoodo devuelve un objeto.*/
    @Test
    void encuentraLibroPorTituloExistente() {
        biblioteca.agregarLibro(libro);
        assertSame(biblioteca.encuentraLibroPorTitulo("El Quijote"), libro);
    }

    /*Versión en la que testeamos el métoodo encuentraLibroPorTitulo() en la que
     * el libro en cuestión NO es encontrado. Al no ser encontrado, el métoodo devuelve
     * null. Por ello, hemos empleado assertNull, que lo que hace es comprobar que
     * el resultado arrojado por el métoodo es un valor null.*/
    @Test
    void encuentraLibroPorTituloNoExistente() {
        assertNull(biblioteca.encuentraLibroPorTitulo("El Quijote"));

    }

    @Test
    void encuentraLibrosPorAutor() {
    }
}