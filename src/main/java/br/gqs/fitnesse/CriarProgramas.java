package br.gqs.fitnesse;

public class CriarProgramas {
    private String nome;
    private int canal;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setDiaDaSemana(String diaDaSemana) {
    }

    public void setHoraDoDia(String horaDoDia) {
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    }

    public String id() {
        return String.format("[%s:%d]", nome, canal);
    }
}