package exercicios.heranca.exercicio2;

import java.util.Random;

public class Distribuidora {
    public static void main(String[] args) {
        Random generator = new Random();
        Produto [] itens = {
            new Pereciveis("produto1",
                    generator.nextDouble()+generator.nextInt(10),
                    generator.nextInt(10)),
            new Pereciveis("produto2",
                    generator.nextDouble()+generator.nextInt(10),
                    generator.nextInt(10)),
            new Pereciveis("produto3",
                    generator.nextDouble()+generator.nextInt(10),
                    generator.nextInt(10)),
            new Pereciveis("produto4",
                    generator.nextDouble()+generator.nextInt(10),
                    generator.nextInt(10)),
            new Pereciveis("produto1",
                    generator.nextDouble()+generator.nextInt(10),
                    generator.nextInt(10)),
            new NaoPereciveis("produto6",
                    generator.nextDouble()+generator.nextInt(10),
                    "fruta"),
            new NaoPereciveis("produto6",
                    generator.nextDouble()+generator.nextInt(10),
                    "fruta"),
            new NaoPereciveis("produto7",
                    generator.nextDouble()+generator.nextInt(10),
                    "fruta"),
            new NaoPereciveis("produto8",
                    generator.nextDouble()+generator.nextInt(10),
                    "fruta"),
            new NaoPereciveis("produto9",
                    generator.nextDouble()+generator.nextInt(10),
                    "fruta"),
            new NaoPereciveis("produto10",
                    generator.nextDouble()+generator.nextInt(10),
                    "fruta"),
        };

        double accum = 0;
        for(int i=0;i<itens.length;i++){
            double venda = itens[i].calcular(generator.nextInt(10));
            System.out.println(venda);
            accum += venda;
        }
        System.out.println("valor de venda: "+accum);
    }
}
