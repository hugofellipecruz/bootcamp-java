package exercicios.dakar;

public class Veiculo implements Comparable<Veiculo>{
    private int velocidade;
    private int aceleração;
    private int angulo;
    private String placa;
    private int peso;
    private int rodas;

    public Veiculo(int velocidade, int aceleração, int angulo, String placa, int peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleração = aceleração;
        this.angulo = angulo;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public Veiculo(){

    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleração=" + aceleração +
                ", angulo=" + angulo +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
    public double getResultado(){
        return velocidade *(0.5)* aceleração / (angulo) * (peso - rodas * 100);
    }

    @Override
    public int compareTo(Veiculo compareVeiculo) {
        //Double resultado = velocidade *(0.5)* aceleração / (angulo) * (peso - rodas * 100);
        double compareResultado = ((Veiculo) compareVeiculo).getResultado();

        return (int) (compareResultado - this.getResultado());
    }
}
