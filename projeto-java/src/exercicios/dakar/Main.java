package exercicios.dakar;

public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        Carro carro4 = new Carro(10,10,10,"asdf");

        Moto moto1 = new Moto();

        corrida.getListaVeiculos().add(carro1);
        corrida.getListaVeiculos().add(carro2);
        corrida.getListaVeiculos().add(carro3);
        corrida.getListaVeiculos().add(carro4);
        corrida.getListaVeiculos().add(moto1);

        corrida.printaCorrida();
        corrida.deleteVeiculoComPlaca("asdf");
        System.out.println("--------------------------");
        corrida.printaCorrida();
        System.out.println("----------------------------------");
        System.out.println(corrida.getVencedor());
    }
}
