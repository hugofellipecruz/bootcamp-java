package exercicios.dakar;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.Collectors;

public class Corrida {
    private int distancia;
    private BigDecimal premioUSD;
    private String nome;
    private int numMaxVeiculos;
    private LinkedList<Veiculo> listaVeiculos;

    public Corrida() {
        Random generator = new Random();
        this.distancia = generator.nextInt(100000);
        this.premioUSD = BigDecimal.valueOf(generator.nextInt(100000));
        this.nome = "Corrida " + Integer.toString(new Random().nextInt(100));
        this.numMaxVeiculos = generator.nextInt(1000);
        this.listaVeiculos = new LinkedList<>();
    }

    public void addCarro(int velocidade, int aceleração, int angulo, String placa){
        Carro carro = new Carro(velocidade,aceleração,angulo,"1728368172381");
        listaVeiculos.add(carro);
    }
    public void addMoto(int velocidade, int aceleração, int angulo, String placa){
        Moto moto = new Moto(velocidade,aceleração,angulo,"1728368172381");
        listaVeiculos.add(moto);
    }
    public void deleteVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }

    public LinkedList<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void printaCorrida(){
        this.listaVeiculos.forEach(System.out::println);
    }

    public void deleteVeiculoComPlaca(String placa){
        this.listaVeiculos.removeIf(veiculo->veiculo.getPlaca()==placa);
    }

    public Veiculo getVencedor(){
        Collections.sort(listaVeiculos, Comparator.comparing(Veiculo::getResultado));
        return listaVeiculos.get(0);

    }
}
