package br.com.alura.snotfy.modelos;

public class Musica extends Audio{
    private String album;
    private String genero;

    public Musica(String titulo,String autor, String genero, int duracao, int classificacao, String album) {
        super(titulo, autor, duracao, classificacao);
        this.album = album;
        this.genero = genero;
    }
    public Musica(){}


    public void informacoesDaMusica(){
        informacoesDaFaixa();
        System.out.println("Album: " + album);
        System.out.println("Gênero" + genero);
    }

    @Override
    public int getClassificacao(){
        if(getReproducoes() > 2000){
            return 10;
        } else {
            return 7;
        }
    }
}
