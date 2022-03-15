package exercicios.abstrataseinterfaces.exercicio1;

public class Saque implements Transacao{
    @Override
    public void transacaoOk() {
        System.out.println("saque efetuado com sucesso");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("saque invalido");
    }
    public void efetuaSaque(boolean test){
        if(test == true){
            this.transacaoOk();
        }else{
            this.transacaoNaoOk();
        }
    }
}
