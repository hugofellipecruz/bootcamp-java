package exercicios.abstrataseinterfaces.exercicio1;

public class Pagamento implements Transacao{

    public void efetuaPagamento(boolean test){
        if(test == true){
            this.transacaoOk();
        }else{
            this.transacaoNaoOk();
        }
    }

    @Override
    public void transacaoOk() {
        System.out.println("pagamento efetuado");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("pagamento nao efetuado");
    }
}
