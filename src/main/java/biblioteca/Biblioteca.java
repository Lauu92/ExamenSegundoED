package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca con una colección de libros.
 * Permite agregar, elminar y buscar libros por título y por autor.
 * @author Laura Vinseiro
 * @version 5.3.2025
 * @see Libro
 */

public class Biblioteca {

    /**
     * Lista de libros disponibles en la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor por defecto de la clase Biblioteca.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
        }
    /**
     * Constructor con parámetros.
     * @param libros Lista de libros con la que inicializamos la biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }


    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }


    /**
     * Devuelve la lista de libros de la biblioteca.
     * @return lista de libros de la biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Nos devuelve el libro si coincide el título con algún título dentro de la lista.
     * @param titulo cadena de texto con el título del libro.
     * @return libro objeto de tipo Libro
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }


// No testearlo
// Este metodo está obsoleto. Hay que documentarlo como tal.
// Recuerda: las anotaciones @deprecated y @link a la nueva
// versión mejorada encuentraLibrosPorAutor(...)
// En esta ocasión, NO TESTEAREMOS este metodo

    /**
     *
     * @deprecated  Este métoodo ha quedado obsoleto
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)}
     * @param autor cadena de texto con el nombre del autor.
     * @return devuelve el libro que coincide con el autor pasado por parámetro.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }


// Este metodo sustituye al metodo anterior. Está disponible desde la
// versión 2.0. Hay que documentarlo teniéndolo en cuenta.
// TODO: Testear este metodo.
// Test: Comprobar la lista de libros que devuelve para un autor existentes.
// Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Devuelve todos los libros de un autor determinado.
     * Se recomienda usar en lugar de {@link #encuentaLibroPorAutor(String)}
     * @since V2.0
     * @param autor cadena de texto con el nombre del autor.
     * @return lista con todos los libros del autor pasado como parámetro.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }

    }

