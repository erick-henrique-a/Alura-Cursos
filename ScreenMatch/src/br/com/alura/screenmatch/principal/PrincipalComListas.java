package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args){
        Filme lorax = new Filme("Lorax", 2013);
        lorax.avalia(8);
        Filme lorax2 = new Filme("Lorax 2: O Retorno do Umavezildo", 2023);
        lorax2.avalia(10);
        var lorax3 = new Filme("Lorax 3: A volta dos que não foram", 2025);
        lorax3.avalia(9.5);
        Serie seinfield = new Serie("Seinfield", 1984);

        List<Titulo> listaDeTitulos = new LinkedList<>();
        listaDeTitulos.add(lorax3);
        listaDeTitulos.add(lorax);
        listaDeTitulos.add(lorax2);
        listaDeTitulos.add(seinfield);
        for (Titulo item: listaDeTitulos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme || item instanceof Serie){
                System.out.println("Classificação: " + item.getClassificao());
            }
        }
        Collections.sort(listaDeTitulos);
        System.out.println("Ordenando por nome: ");
        System.out.println(listaDeTitulos);

        listaDeTitulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano ");
        System.out.println(listaDeTitulos);
    }
}
