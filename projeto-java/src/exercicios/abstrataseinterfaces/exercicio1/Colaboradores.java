package exercicios.abstrataseinterfaces.exercicio1;

public class Colaboradores {
    private Saque saq;
    private Consulta cons;

    public Colaboradores() {
        this.saq = new Saque();
        this.cons = new Consulta();
    }

    public void fazSaque(boolean test){
        saq.efetuaSaque(test);
    }
    public void fazConsulta(boolean test){
        cons.efetuaConsulta(test);
    }
}
