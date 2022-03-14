package exercicios.POO.segundo;

public class Pessoa {
    String nome;
    int idade;
    String ID;
    float peso;
    float altura;

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public static void main (String args[]){
        System.out.println("Hello World");
    }
}
