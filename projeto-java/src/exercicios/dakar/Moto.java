package exercicios.dakar;

import java.util.Random;

public class Moto extends Veiculo{
    public Moto(int velocidade, int aceleração, int angulo, String placa){
        super(velocidade, aceleração, angulo, placa, 300, 2);
    }
    public Moto(){
        super(
                new Random().nextInt(300),
                new Random().nextInt(100),
                new Random().nextInt(90),
                Integer.toString(new Random().nextInt(100000)),
                300,
                2
        );
    }
}
