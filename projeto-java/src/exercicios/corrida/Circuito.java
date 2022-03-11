package exercicios.corrida;

import java.util.LinkedList;

public class Circuito {
    LinkedList<Pessoa> circuito;
    float precoMenor18;
    float precoAcima18;

    public Circuito(LinkedList<Pessoa> circuito, float precoMenor18, float precoAcima18) {
        this.circuito = circuito;
        this.precoMenor18 = precoMenor18;
        this.precoAcima18 = precoAcima18;
    }

    public Circuito(float precoMenor18, float precoAcima18) {
        this.circuito = new LinkedList<Pessoa>();
        this.precoMenor18 = precoMenor18;
        this.precoAcima18 = precoAcima18;
    }

    public Circuito(float precoAcima18) {
        this.circuito = new LinkedList<Pessoa>();
        this.precoAcima18 = precoAcima18;
    }

    //------------ GETTERS -----------------------
    public LinkedList<Pessoa> getCircuito() {
        return circuito;
    }

    public float getPrecoMenor18() {
        return precoMenor18;
    }

    public float getPrecoAcima18() {
        return precoAcima18;
    }

    //------------ SETTERS -----------------------
    public void setCircuito(LinkedList<Pessoa> circuito) {
        this.circuito = circuito;
    }

    public void setPrecoMenor18(float precoMenor18) {
        this.precoMenor18 = precoMenor18;
    }

    public void setPrecoAcima18(float precoAcima18) {
        this.precoAcima18 = precoAcima18;
    }

    //------------Methods------------------
    public void addParticipante(Pessoa participante){

        if(!this.circuito.isEmpty()) {
            int lastIndex = this.circuito.getLast().getNumCorrida();
            participante.setNumCorrida(lastIndex+1);
        }else{
            participante.setNumCorrida(1);
        }

        this.circuito.add(participante);
    }

    public void cancelParticipante(int numParticipante){
        if(!this.circuito.isEmpty()) {
            for(Pessoa participante : this.circuito)
            {
                if(numParticipante == participante.getNumCorrida()){
                    circuito.remove(participante);
                    return;
                }
            }
            System.out.println("participante nao encontrado");

        }else{
            System.out.println("Corrida sem participantes ainda");
        }
        return;
    }
    public void cancelParticipante(Pessoa participanteACancelar){
        if(!this.circuito.isEmpty()) {
            int numCircuito = participanteACancelar.getNumCorrida();
            for(Pessoa participante : this.circuito)
            {
                if(numCircuito == participante.getNumCorrida()){
                    circuito.remove(participante);
                    return;
                }
            }
            System.out.println("participante nao encontrado");

        }else{
            System.out.println("Corrida sem participantes ainda");
        }
        return;
    }

    public static void main (String args[]){
    }
}
