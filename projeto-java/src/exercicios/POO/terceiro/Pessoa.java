package exercicios.POO.terceiro;

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
        Pessoa pessoaConstrutorVazio = new Pessoa();
        Pessoa pessoaConstrutorMenosParametros = new Pessoa("Hugo",28,"!@#dsfd121312");
        Pessoa pessoaConstrutorCompleto = new Pessoa("Hugo",28,"!@#dsfd121312", 83F, (float) 1.84);
        //Pessoa pessoaConstrutorIncorreto = new Pessoa("Hugo",28);
        //Incorreto pois o construtor com 2 parametros nao está criado
        System.out.println("Hello World");
    }
}