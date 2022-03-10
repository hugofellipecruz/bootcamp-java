package introduction.padrao;
import java.util.Random;


public class Weather {
    public static void main (String args[]){
        String nomeCidades[] = new String[10];

        nomeCidades[0] = "Madrid";
        nomeCidades[1] = "Porto";
        nomeCidades[2] = "Roma";
        nomeCidades[3] = "Berlim";
        nomeCidades[4] = "Tokyo";
        nomeCidades[5] = "Sao paulo";
        nomeCidades[6] = "Bruxelas";
        nomeCidades[7] = "Nova York";
        nomeCidades[8] = "Pirapora de dentro";

        Random generator = new Random();

        int[][] temperatures = new int[nomeCidades.length][2];

        for(int i=0;i<temperatures.length;i++) {
            int minTemperature = generator.nextInt(30) - 20;
            int maxTemperature = minTemperature + generator.nextInt(20);
            temperatures[i][0] = minTemperature;
            temperatures[i][1] = maxTemperature;
        }

        int min = 100;
        int max = -100;
        String cidadeMin = "";
        String cidadeMax = "";
        for(int i=0;i<temperatures.length;i++) {
            int minTemperature = temperatures[i][0];
            int maxTemperature = temperatures[i][1];
            if(minTemperature < min) {
                min = minTemperature;
                cidadeMin = nomeCidades[i];
            }
            if(maxTemperature > max) {
                max = maxTemperature;
                cidadeMax = nomeCidades[i];
            }
        }

        System.out.println("Temperatura máxima: " + max + " em " + cidadeMax);
        System.out.println("Temperatura minima: " + min + " em " + cidadeMin);


    }
}
