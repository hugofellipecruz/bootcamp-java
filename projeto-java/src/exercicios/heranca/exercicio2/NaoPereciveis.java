package exercicios.heranca.exercicio2;

public class NaoPereciveis extends Produto{
    private String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static void main(String[] args) {
        NaoPereciveis item = new NaoPereciveis("item",12,"fruta");
        System.out.println(item.calcular(12));
    }
}
