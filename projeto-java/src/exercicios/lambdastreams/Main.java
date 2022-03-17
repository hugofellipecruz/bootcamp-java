package exercicios.lambdastreams;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Garagem garagem = new Garagem();

        Veiculo carro1 = new Veiculo("Ford","Fiesta",2000);
        Veiculo carro2 = new Veiculo("Ford","Focus",1200);
        Veiculo carro3 = new Veiculo("Ford","Explorer",2500);

        Veiculo carro4 = new Veiculo("Fiat","Uno",500);
        Veiculo carro5 = new Veiculo("Fiat","Cronos",1000);
        Veiculo carro6 = new Veiculo("Fiat","Torino",1250);

        Veiculo carro7 = new Veiculo("Chevrolet","Aveo",1250);
        Veiculo carro8 = new Veiculo("Chevrolet","Spin",2500);

        Veiculo carro9 = new Veiculo("Toyota","Corola",1200);
        Veiculo carro10 = new Veiculo("Toyota","Fortuner",3000);

        Veiculo carro11 = new Veiculo("Reunault","Logan",950);

        garagem.insereCarro(carro1);
        garagem.insereCarro(carro2);
        garagem.insereCarro(carro3);
        garagem.insereCarro(carro4);
        garagem.insereCarro(carro5);
        garagem.insereCarro(carro6);
        garagem.insereCarro(carro7);
        garagem.insereCarro(carro8);
        garagem.insereCarro(carro9);
        garagem.insereCarro(carro10);
        garagem.insereCarro(carro11);



        garagem.getListaVeiculos()
                .stream().
                sorted().
                collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("--------------------");
        garagem.getListaVeiculos().stream()
                .filter(carro->carro.getPreco()<1000)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("---------------------");
        garagem.getListaVeiculos().stream()
                .filter(carro->carro.getPreco()>=1000)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("------------------------------");
        int total = garagem.getListaVeiculos().stream()
                .mapToInt(car->car.getPreco())
                .reduce(0,(car1,car)->  (car1 + car));
        System.out.println(total/garagem.getListaVeiculos().size());



    }
}
