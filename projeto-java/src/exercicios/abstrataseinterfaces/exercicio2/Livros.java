package exercicios.abstrataseinterfaces.exercicio2;

public class Livros {
    int numeroDePaginas;
    String nomeDoAutor;
    String titulo;
    String genero;

    public Livros() {
        this.numeroDePaginas = 10;
        this.nomeDoAutor = "hugo";
        this.titulo = "design patterns";
        this.genero = "terror";
    }

    @Override
    public String toString() {
        return "Livros{" +
                "numeroDePaginas=" + numeroDePaginas +
                ", nomeDoAutor='" + nomeDoAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
