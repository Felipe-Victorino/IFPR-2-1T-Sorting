package ex08;

public class Paciente {
    private String nome;
    private int gravidade;
    private int tempo;

    public Paciente(String nome, int gravidade, int tempo) {
        this.nome = nome;
        this.gravidade = gravidade;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public int getGravidade() {
        return gravidade;
    }

    public int getTempo() {
        return tempo;
    }
}