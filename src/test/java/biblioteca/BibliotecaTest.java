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

    /*Versión del métoodo encuantraLibrosPorAutor() para autor existente. Hacemos
    * lo siguiente: generamos una nueva biblioteca, agregamos el libro creado anteriormente,
    * comprobamos que la lista no es nula, comprobamos que el tamañó de lista es el esperado,
    * y una vez hecho esto, comprobvamos mediante una condición booleana si la biblioteca que
    * hemos creado contiene el objeto Libro que hemos añadido al principio. Al devolvernos true,
    * el test se pasa con exito. */
    @Test
    void encuentraLibrosPorAutorExistente() {
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(this.libro);
        assertNotNull(biblio.getLibros());
        assertEquals(1, biblio.getLibros().size());
        assertTrue(biblio.getLibros().contains(this.libro));
    }

    /*Versión del métoodo encuantraLibrosPorAutor() para autor NO existente.
    * Hacemos lo siguiente:generamos un nuevo libro, generamos una nueva biblioteca, agregamos el libro
    * creado al principio del testing (libro), no el creado ahora. Comprobamos que la lista no es nula,
    * comprobamos que el tamaño de lista es el esperado,y una vez hecho esto, comprobamos mediante una
    * condición booleana si la biblioteca que hemos creado contiene el objeto libro2 (recordemos que libro2
    * es el objeto de la clase Libro que hemos creado para este test).
    * Al devolvernos False en un assertFalse se pasa el test, ya que es la salida esperada, puesto que libro2
    * no es el libro añadido a la biblioteca, sino libro.*/
    @Test
    void encuentraLibrosPorAutorNoExistente() {
        Libro libro2 = new Libro("Marina", "Zafón", 2000);
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(this.libro);
        assertNotNull(biblio.getLibros());
        assertEquals(1, biblio.getLibros().size());
        assertFalse(biblio.getLibros().contains(libro2));
    }
}