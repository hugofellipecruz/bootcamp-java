package exercicios.abstrataseinterfaces.exercicio1;

public class Executavel {
    public static void main(String[] args) {
        Executivos executivo =  new Executivos();
        Basico basic = new Basico();
        Colaboradores colaborador = new Colaboradores();

        executivo.fazDeposito(false);
        executivo.fazTransacao(true);

        basic.fazConsulta(false);
        basic.fazPagamento(true);

        colaborador.fazConsulta(false);
        colaborador.fazSaque(true);

    }
}
