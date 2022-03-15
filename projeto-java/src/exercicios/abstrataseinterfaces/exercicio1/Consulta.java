package exercicios.abstrataseinterfaces.exercicio1;

public class Consulta implements Transacao{

    @Override
    public void transacaoOk() {
        System.out.println("seu saldo é 200 merreis");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("nao foi possivel consultar");
    }
    public void efetuaConsulta(boolean test){
        if(test == true){
            this.transacaoOk();
        }else{
            this.transacaoNaoOk();
        }
    }
}
