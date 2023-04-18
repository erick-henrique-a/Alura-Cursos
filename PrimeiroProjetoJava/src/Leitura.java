import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println(filme);
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);
        System.out.println("nota:");
    }
}
