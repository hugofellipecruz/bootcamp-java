package exercicios.abstrataseinterfaces.exercicio2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Curriculos extends Pessoa{
    ArrayList<String> habilidades;

    public Curriculos() {
        super(1293, "hugo", "sobrenome", 12,
                "129837918231", "182319647823", "O+");
        this.habilidades = new ArrayList<String>();
        this.habilidades.add("correr");
        this.habilidades.add("hearthstone");
    }

    @Override
    public String toString() {
        return "Curriculos{" +
                ", RG=" + RG +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", numeroDeCelular='" + numeroDeCelular + '\'' +
                ", numeroDeEmergencia='" + numeroDeEmergencia + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", numCorrida=" + numCorrida +
                ", corridaInscrito='" + corridaInscrito + '\'' +
                '}';
    }
}
