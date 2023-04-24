package br.com.alura.snotfy.principal;

import br.com.alura.snotfy.modelos.MinhasPreferidas;
import br.com.alura.snotfy.modelos.Musica;
import br.com.alura.snotfy.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica deerDance = new Musica("Deer Dance", "System of a down", "Nu-Metal", 200, 5, "Toxicity");
        Podcast valdir = new Podcast("Valdir", "Amdre Young", 2000, 5, 6);
        valdir.setDescricao("Um podcast com nome, mas sem sobrenome.");
        MinhasPreferidas preferidas = new MinhasPreferidas();

        for (int i = 0; i < 2000; i++) {
            deerDance.reproduzir();
        }
        for (int i = 0; i < 990; i++) {
            deerDance.curtir();
        }

        for (int i = 0; i < 900; i++) {
            valdir.reproduzir();
        }
        for (int i = 0; i < 850; i++) {
            valdir.curtir();
        }
        
        //deerDance.informacoesDaMusica();
        //valdir.informacoesDoPodcast();
        preferidas.inclui(deerDance);
        preferidas.inclui(valdir);
    }
}