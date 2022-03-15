package exercicios.abstrataseinterfaces.exercicio1;

public class Deposito implements Transacao{
    @Override
    public void transacaoOk() {
        System.out.println("efetuando deposito");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("deposito nao efetuado");
    }

    public void efetuaDeposito(boolean test){
        if(test == true){
            this.transacaoOk();
        }else{
            this.transacaoNaoOk();
        }
    }
}
