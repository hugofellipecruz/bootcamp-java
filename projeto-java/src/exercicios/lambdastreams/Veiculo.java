package exercicios.lambdastreams;

import java.math.BigDecimal;
import java.util.Random;

public class Veiculo implements Comparable<Veiculo>{
    String modelo;
    String marca;
    int preco;

    public Veiculo(String modelo, String marca, int preço) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preço;
    }

    public Veiculo() {
        Random generator = new Random();
        this.modelo = "Modelo exemplo " + String.valueOf(generator.nextInt(100)) ;
        this.marca = "Marca exemplo " + String.valueOf(generator.nextInt(100)) ;;
        this.preco = generator.nextInt(10000); ;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }

    public int compareTo(Veiculo carro) {
        //para comparar preco
        //int comparePreco = ((Veiculo) carro).getPreco();
        //return this.preco - comparePreco;

        //para comparar marca
        return this.marca.compareTo(carro.getMarca());
    }
}
