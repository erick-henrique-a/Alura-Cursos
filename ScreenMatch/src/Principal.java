//import br.com.alura.screenmatch.modelos.Episodios;
//import br.com.alura.screenmatch.modelos.Filme;
//import br.com.alura.screenmatch.modelos.Serie;
//import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
//import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
//
//import java.util.ArrayList;
//
//public class Principal {
//    public static void main(String[] args) {
//        //Criação do objeto filme
//        Filme lorax = new Filme("Lorax", 2013);
//        lorax.setDuracaoEmMinutos(140);
//        lorax.setIncluidoNoPlano(true);
//        lorax.avalia(8);
//        lorax.avalia(5);
//        lorax.avalia(10);
//
//        //Criação do objeto série
//        Serie seinfield = new Serie("Seinfield", 1984);
//
//        seinfield.setEpisodiosPorTemp(12);
//        seinfield.setTemporadas(14);
//        seinfield.setMinutosPorEp(20);
//
//        //
//        System.out.println("Tempo para maratonar "+ seinfield.getNome() + " em minutos: " + seinfield.getDuracaoEmMinutos());
//        System.out.println("Duração do filme " +lorax.getNome() + " em minutos: " + lorax.getDuracaoEmMinutos());
//       // lorax.exibeFichaTecnica();
//
//        //System.out.println("Média das avaliações é: " + (int)(lorax.pegaMedia()));
//
//        Filme lorax2 = new Filme("Lorax 2: O Retorno do Umavezildo", 2023);
//        lorax2.setAnoDeLancamento(2023);
//        lorax2.setDuracaoEmMinutos(200);
//        lorax2.setIncluidoNoPlano(true);
//        CalculadoraDeTempo calc = new CalculadoraDeTempo();
//        calc.inclui(lorax);
//        calc.inclui(lorax2);
//        calc.inclui(seinfield);
//        System.out.println(calc.getTempoTotal());
//
//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(lorax);
//
//        Episodios episodio = new Episodios();
//        episodio.setNumero(1);
//        episodio.setSerie(seinfield);
//        episodio.setNome(seinfield.getNome());
//        episodio.setTotalVisualizacoes(300);
//        filtro.filtra(episodio);
//
//        var lorax3 = new Filme("Lorax 3: A volta dos que não foram", 2025);
//        lorax3.setDuracaoEmMinutos(200);
//        lorax3.setAnoDeLancamento(2003);
//        lorax3.avalia(10);
//
//        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
//        listaDeFilmes.add(lorax3);
//        listaDeFilmes.add(lorax);
//        listaDeFilmes.add(lorax2);
//
//        System.out.println("Tamanho do catálogo: " + listaDeFilmes.size() + " Filmes");
//        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
//        System.out.println(listaDeFilmes);
//
//    }
//}