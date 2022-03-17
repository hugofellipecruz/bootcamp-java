package exercicios.lambdastreams;

import java.util.LinkedList;

public class Garagem {
    int ID;
    LinkedList<Veiculo> listaVeiculos;

    public Garagem(int ID, LinkedList<Veiculo> listaVeiculos) {
        this.ID = ID;
        this.listaVeiculos = listaVeiculos;
    }

    public Garagem() {
        this.listaVeiculos = new LinkedList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LinkedList<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(LinkedList<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public void insereCarro(Veiculo carro){
        this.listaVeiculos.add(carro);
    }

}
