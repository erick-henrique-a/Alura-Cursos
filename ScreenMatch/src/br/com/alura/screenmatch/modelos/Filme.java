package br.com.alura.screenmatch.modelos;

import br.com.alura.screennmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

}
