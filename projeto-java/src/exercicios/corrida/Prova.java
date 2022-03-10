package exercicios.corrida;

import java.util.HashMap;
import java.util.Map;

public class Prova{
    HashMap<String,Circuito> circuitos;

    public Prova(){
        this.circuitos = new HashMap<>();
        this.circuitos.put("pequeno", new Circuito(1300,1500));
        this.circuitos.put("medio",new Circuito(2000,2300));
        this.circuitos.put("grande",new Circuito(2800));
    }

    public float inscreverParticipante(String tamanhoCircuito){
        Pessoa novoParticipante = new Pessoa();
        Circuito circuitoAInserir = this.circuitos.get(tamanhoCircuito);

        int idade = novoParticipante.getIdade();
        if(idade < 18 && tamanhoCircuito == "grande"){
            System.out.println("proibida inscricao - categoria maior nao permite participantes menores de 18 anos");
            return 0;
        }else{
            novoParticipante.setCorridaInscrito(tamanhoCircuito);
            circuitoAInserir.addParticipante(novoParticipante);
            int idadeParticipante = novoParticipante.getIdade();
            if(idade<18){
                return circuitoAInserir.getPrecoMenor18();
            }else{
                return circuitoAInserir.getPrecoAcima18();
            }
        }
    }
    public void showCadastrados(String tamanhoCircuito){
        Circuito circuito = this.circuitos.get(tamanhoCircuito);
        System.out.println("Circuito "+tamanhoCircuito);
        for(Pessoa participante: circuito.getCircuito()){
            System.out.println("Participante " + participante.getNome());
            System.out.println("ID " + participante.getNumCorrida());
        }
    }
    public void deleteCometidor(String tamanhoCircuito,int IDCompetidor)
    {
        Circuito circuito = this.circuitos.get(tamanhoCircuito);
        circuito.cancelParticipante(IDCompetidor);
    }
    public void deleteCometidor(int IDCompetidor)
    {
        for(Map.Entry<String,Circuito> entrada: circuitos.entrySet()) {
            String tamanho = entrada.getKey();
            Circuito circuito = entrada.getValue();
            circuito.cancelParticipante(IDCompetidor);
        }
    }

    public static void main(String args[]){
        Prova bravusRace = new Prova();
        System.out.println("Vai pagar" +bravusRace.inscreverParticipante("pequeno"));
        System.out.println("Vai pagar" +bravusRace.inscreverParticipante("pequeno"));
        System.out.println("Vai pagar" +bravusRace.inscreverParticipante("pequeno"));
        System.out.println("Vai pagar" +bravusRace.inscreverParticipante("pequeno"));
        System.out.println("Vai pagar" +bravusRace.inscreverParticipante("pequeno"));
        System.out.println("Vai pagar" +bravusRace.inscreverParticipante("pequeno"));
        System.out.println("Vai pagar" +bravusRace.inscreverParticipante("pequeno"));
        System.out.println("Vai pagar" +bravusRace.inscreverParticipante("pequeno"));

        bravusRace.inscreverParticipante("medio");
        bravusRace.inscreverParticipante("medio");
        bravusRace.inscreverParticipante("medio");

        bravusRace.showCadastrados("pequeno");
        bravusRace.deleteCometidor(1);
        bravusRace.deleteCometidor(1);
        bravusRace.deleteCometidor(5);
        System.out.println("--------------------------------------------------------------");
        bravusRace.showCadastrados("pequeno");




    }
}
