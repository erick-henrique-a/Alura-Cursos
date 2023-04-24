package br.com.alura.snotfy.modelos;

public class Podcast extends Audio{
    private int numeroDoEpisodio;
    private String descricao;

    public Podcast(String titulo, String autor, int duracao, int classificacao, int numeroDoEpisodio) {
        super(titulo, autor, duracao, classificacao);
        this.numeroDoEpisodio = numeroDoEpisodio;
    }
    public Podcast(){}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroDoEpisodio() {
        return numeroDoEpisodio;
    }

    public void setNumeroDoEpisodio(int numeroDoEpisodio) {
        this.numeroDoEpisodio = numeroDoEpisodio;
    }

    public void informacoesDoPodcast(){
        informacoesDaFaixa();
        System.out.println(numeroDoEpisodio);
        System.out.println(descricao);
    }

    @Override
    public int getClassificacao(){
        if(getCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
