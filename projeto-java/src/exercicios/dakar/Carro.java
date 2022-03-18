package exercicios.dakar;

import java.util.Random;

public class Carro extends Veiculo{
    public Carro(int velocidade, int aceleração, int angulo, String placa) {
        super(velocidade, aceleração, angulo, placa, 300, 4);
    }
    public Carro(){
        super(
                new Random().nextInt(300),
                new Random().nextInt(100),
                new Random().nextInt(90),
                Integer.toString(new Random().nextInt(100000)),
                1000,
                4);
    }
}
