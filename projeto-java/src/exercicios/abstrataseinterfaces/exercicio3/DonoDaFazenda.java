package exercicios.abstrataseinterfaces.exercicio3;

public class DonoDaFazenda implements Dieta {
    @Override
    public void alimenta(Animal animal) {
        animal.comer();
    }

    public static void main(String[] args) {
        DonoDaFazenda dono = new DonoDaFazenda();
        Cachorro toto = new Cachorro();
        Gato mingau = new Gato();
        Vaca mimosa = new Vaca();

        dono.alimenta(toto);
        dono.alimenta(mingau);
        dono.alimenta(mimosa);
    }
}
