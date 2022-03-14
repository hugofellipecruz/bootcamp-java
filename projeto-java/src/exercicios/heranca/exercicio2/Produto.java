package exercicios.heranca.exercicio2;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //tostring

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public double calcular(int quantidadeDeProdutos){
        return this.preco*quantidadeDeProdutos;
    }
}
