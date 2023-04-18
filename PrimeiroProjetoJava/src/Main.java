import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Esse é o Screen Match");

        int anoDeLancamento = 2023;
        boolean incluidoNoPlan = false;
        double notaDoFilme = 8.1;

        double media = (notaDoFilme + 6 + 8)/3;

        String sinopse= """ 
        Filme top gun
        muito bom
        Ano de lançamento: """+ anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) media;

    }
}