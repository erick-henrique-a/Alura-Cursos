package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    int temporadas;
    private boolean ativa;
    private int episodiosPorTemp;
    private int minutosPorEp;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
    public Serie(){}

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemp() {
        return episodiosPorTemp;
    }

    public void setEpisodiosPorTemp(int episodiosPorTemp) {
        this.episodiosPorTemp = episodiosPorTemp;
    }

    public int getMinutosPorEp() {
        return minutosPorEp;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemp * minutosPorEp;
    }

    @Override
    public String toString() {
        return "Série: " + getNome() + " (" + getAnoDeLancamento() + ")";
    }
}
