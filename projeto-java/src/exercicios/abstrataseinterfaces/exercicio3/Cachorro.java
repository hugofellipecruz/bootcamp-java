package exercicios.abstrataseinterfaces.exercicio3;

public class Cachorro extends Animal{
    @Override
    public void emitirSons() {
        System.out.println("au au");
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
