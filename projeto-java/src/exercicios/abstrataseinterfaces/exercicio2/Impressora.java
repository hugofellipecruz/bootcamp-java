package exercicios.abstrataseinterfaces.exercicio2;

public class Impressora implements Imprimivel {


    @Override
    public void imprimir(Object o) {
        System.out.println(o.toString());
    }

    public static void main(String[] args) {
        Curriculos curriculo = new Curriculos();
        Livros livro = new Livros();
        Relatorio relatorio = new Relatorio();

        Impressora impressora = new Impressora();

        impressora.imprimir(curriculo);
        impressora.imprimir(livro);
        impressora.imprimir(relatorio);
    }
}
