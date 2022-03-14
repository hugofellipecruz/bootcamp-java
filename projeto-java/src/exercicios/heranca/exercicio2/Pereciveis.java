package exercicios.heranca.exercicio2;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        switch (quantidadeDeProdutos){
            case 1:
                return quantidadeDeProdutos/4;
            case 2:
                return quantidadeDeProdutos/3;
            case 3:
                return quantidadeDeProdutos/2;
            default:
                return quantidadeDeProdutos;
        }
    }

    public static void main(String[] args) {
        Pereciveis item = new Pereciveis("teste",12, 20);
        System.out.println(item.getNome());
        System.out.println(item.getPreco());
    }
}
