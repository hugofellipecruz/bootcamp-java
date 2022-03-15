package exercicios.abstrataseinterfaces.exercicio1;

public class Transferencia implements Transacao{
    @Override
    public void transacaoOk() {
        System.out.println("Transferencia ok");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("transferencia nao esta ok");
    }

    public void fazTransacao(boolean test){
        if(test == true){
            this.transacaoOk();
        }else{
            this.transacaoNaoOk();
        }
    }
}
