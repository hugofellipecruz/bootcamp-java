package exercicios.corrida;


import java.util.Random;

public class Pessoa{
    int RG;
    String nome;
    String sobrenome;
    int idade;
    String numeroDeCelular;
    String numeroDeEmergencia;
    String grupoSanguineo;
    int numCorrida;

    public Pessoa(int RG,
                  String nome,
                  String sobrenome,
                  int idade,
                  String numeroDeCelular,
                  String numeroDeEmergencia,
                  String grupoSanguineo) {
        this.RG = RG;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numeroDeCelular = numeroDeCelular;
        this.numeroDeEmergencia = numeroDeEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }
    public Pessoa(){
        Random generator = new Random();
        this.RG = generator.nextInt(100000000);
        this.nome = "Nome Teste " + String.valueOf(generator.nextInt(1000));
        this.sobrenome = "da Silva " + String.valueOf(generator.nextInt(1000));
        this.idade = generator.nextInt(100);
        this.numeroDeCelular = "1234556678";
        this.numeroDeEmergencia = "123234535";
        this.grupoSanguineo = "O+";

    }

    //------------ GETTERS -----------------------
    public int getRG() {
        return RG;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNumeroDeCelular() {
        return numeroDeCelular;
    }

    public String getNumeroDeEmergencia() {
        return numeroDeEmergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public int getNumCorrida() {
        return numCorrida;
    }

    //------------ SETTERS -----------------------
    public void setNumCorrida(int numCorrida) {
        this.numCorrida = numCorrida;
    }
}
