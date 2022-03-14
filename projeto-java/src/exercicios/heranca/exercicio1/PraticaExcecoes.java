package exercicios.heranca.exercicio1;

public class PraticaExcecoes {
    private int a;
    private int b;

    public PraticaExcecoes() {
        this.a = 0;
        this.b = 300;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int divide() throws IllegalArgumentException{
        if(this.a == 0){
            throw new IllegalArgumentException();
        }
        return this.b/this.a;
    }

    public static void main(String[] args) {
        PraticaExcecoes excecao = new PraticaExcecoes();
        /*
        Exercicio 1 - A

        try{
            double c = excecao.getB()/ excecao.getA();
        }catch (ArithmeticException exception){
            System.out.println("ocorreu um erro");
            System.out.println(exception);
        }finally {
            System.out.println("programa finalizado");
        }
        */
        try{
            System.out.println(excecao.divide());
        }catch (IllegalArgumentException exception){
            System.out.println("Não pode ser dividid por zero.");
        }finally {
            System.out.println("programa finalizado");
        }

    }
}
