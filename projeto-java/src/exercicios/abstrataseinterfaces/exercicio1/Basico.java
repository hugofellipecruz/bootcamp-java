package exercicios.abstrataseinterfaces.exercicio1;

public class Basico {
    private Consulta cons;
    private Pagamento pag;
    private Saque saq;

    public Basico() {
        this.cons = new Consulta();
        this.pag = new Pagamento();
        this.saq = new Saque();
    }

    public void fazConsulta(boolean test){
        cons.efetuaConsulta(test);
    }
    public void fazPagamento(boolean test){
        pag.efetuaPagamento(test);
    }
    public void fazSaque(boolean test){
        saq.efetuaSaque(test);
    }
}
