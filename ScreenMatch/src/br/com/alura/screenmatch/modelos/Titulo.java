package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Titulo implements Classificavel, Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacao() {
        return somaDasAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    @Override
    public int getClassificao() {
        return (int) pegaMedia() / 2;

    }
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo o){
        return this.getNome().compareTo(o.getNome());
        }
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme" + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }
    public void avalia(double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacao/totalDeAvaliacoes;
    }
}
