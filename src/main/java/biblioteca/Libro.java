package biblioteca;


/**
 * Clase que representa un libro. Consta de constructor con atributos,
 * getters & setters y atributos propios.
 * @author Laura Vinseiro
 * @version 5.3.2025
 *
 */

public class Libro {

    /**
     * Atributos de instancia de la clase Libro.
     * titulo: atributo de sipo String que nos da el título del libro.
     * autor: atributo de tipo String que nos da el nombre del autor.
     * anioPublicacion: atributo de tipo int que nos da el año de publicación.
     * */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    /**
     * Constructor con parámetros. Necesita de tres parámetros que se corresponden con todos
     * los atributos de instancia de la clase.
     * @param titulo String con el título del libro.
     * @param autor String con el nombre del autor.
     * @param anioPublicacion int con el año de publicación.
     */

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metoodo get clásico que nos permite acceder al contenido del atributo autor.
     * @return
     */
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Métoodo get clásico que nos permite acceder al contenido del atributo anioPublicacion.
     * @return
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

}


