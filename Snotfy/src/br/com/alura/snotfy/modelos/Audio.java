package br.com.alura.snotfy.modelos;

public class Audio {
    private String titulo;
    private String autor;
    private int curtidas = 0;
    private int duracao;
    private int reproducoes = 0;
    private int classificacao;

    public Audio(String titulo, String autor, int duracao, int classificacao) {
        this.titulo = titulo;
        this.reproducoes = reproducoes;
        this.curtidas = curtidas;
        this.duracao = duracao;
        this.autor = autor;
        this.classificacao = classificacao;
    }

    public Audio(){}
    public String getTitulo() {
        return titulo;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void setReproducoes(int reproducoes) {
        this.reproducoes = reproducoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        curtidas++;
    }
    public void reproduzir(){
        reproducoes++;
    }

    public void informacoesDaFaixa(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println("Duração em minutos: " + duracao);
        System.out.println("Classificação: " + classificacao);
        System.out.println("Quantidade de curtidas: " +curtidas);
        System.out.println("Número de reproduções: " + reproducoes);
    }
}
