package exercicios.abstrataseinterfaces.exercicio3;

public class Gato extends Animal{
    @Override
    public void emitirSons() {
        System.out.println("miau");
    }

    @Override
    public void comer() {
        comerCarne();
    }
    public void comerCarne()
    {
        System.out.println("Comendo carne");
    }
}
