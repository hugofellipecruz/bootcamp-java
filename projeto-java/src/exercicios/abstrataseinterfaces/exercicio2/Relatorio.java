package exercicios.abstrataseinterfaces.exercicio2;

public class Relatorio {
    String texto;
    int numeroDePaginas;
    String Autor;
    String Revisor;

    public Relatorio() {
        this.texto = "akjshdakjsbkdjhfks";
        this.numeroDePaginas = 12;
        Autor = "hugo";
        Revisor = "eu mesmo";
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "texto='" + texto + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", Autor='" + Autor + '\'' +
                ", Revisor='" + Revisor + '\'' +
                '}';
    }
}
