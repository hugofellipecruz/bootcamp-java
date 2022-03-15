package exercicios.abstrataseinterfaces.exercicio1;

import exercicios.abstrataseinterfaces.exercicio1.Deposito;

public class Executivos {
    private Deposito dep;
    private Transferencia transf;

    public Executivos() {
        this.dep = new Deposito();
        this.transf = new Transferencia();
    }

    public void fazDeposito(boolean test){
        dep.efetuaDeposito(true);
    }
    public void fazTransacao(boolean test)
    {
        transf.fazTransacao(false);
    }
}
