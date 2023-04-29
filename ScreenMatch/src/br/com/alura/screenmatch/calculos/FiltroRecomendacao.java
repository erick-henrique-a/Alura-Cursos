package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificao() >= 4){
            System.out.println(classificavel.getNome() + " Está entre os preferidos do momento");
        } else if(classificavel.getClassificao() >= 2){
            System.out.println(classificavel.getNome() + " Está Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque" +classificavel.getNome() + " na sua lista para assistir depois");
        }
    }
}
