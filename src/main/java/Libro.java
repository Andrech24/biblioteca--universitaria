public class Libro {
    private final String titulo;
    private final String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        if (!disponible) {
            throw new IllegalStateException("El libro ya está prestado.");
        }
        disponible = false;
    }

    public void devolver() {
        if (disponible) {
            throw new IllegalStateException("El libro ya está disponible.");
        }
        disponible = true;
    }

    public boolean esMismoTitulo(String otroTitulo) {
        return titulo.equals(otroTitulo);
    }
}