package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    Libro libro;

    /*
    * Se nos pide testear el constructor de la clase Libro. Como JUnit no da opción
    * a testear el constructor por él mismo, lo que hacemos es comprobar que se ha creado
    * el objeto accediendo a sus atributos de instancia mediante los métodos get.
    * Para ello, primero creamos un objeto de la clase Libro; a continuación, testeamos
    * cada get comprobando que el dato que nos arroja es el esperado después de usar
    * el constructor.*/


    @BeforeEach
    void setUp() {
        libro = new Libro("El Quijote", "Cervantes", 1700);
    }

    @Test
    void getTitulo() {
        assertEquals("El Quijote", libro.getTitulo());
    }

    @Test
    void getAutor() {
        assertEquals("Cervantes", libro.getAutor());
    }

    @Test
    void getAnioPublicacion() {
        assertEquals(1700, libro.getAnioPublicacion());
    }



}