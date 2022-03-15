package exercicios.abstrataseinterfaces.exercicio3;

public class Vaca extends Animal{
    @Override
    public void emitirSons() {
        System.out.println("muuuuuu");
    }

    @Override
    public void comer() {
        comerPasto();
    }
    public void comerPasto()
    {
        System.out.println("Comendo Grama");
    }
}
