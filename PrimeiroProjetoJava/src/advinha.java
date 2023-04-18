import java.util.Random;
import java.util.Scanner;

public class advinha {
    public static void main(String[] args){
        int r = new Random().nextInt(100);
        Scanner palpite = new Scanner(System.in);
        int chute = 0;
        String titulo = """
                Advinhe o número!
                Você tem 5 tentativas para advinhar o número aleatório
                """;
        System.out.println(titulo);
        for (int i = 5; i > 0; i--){
            System.out.println("Você ainda tem " + i + " tentativas");
            System.out.println("Insira seu palpite:");
            chute = palpite.nextInt();
            if (chute == r)
            {
                System.out.println("Você ganhou!");
                break;
            }
            if(chute < r)
            {
                System.out.println("O número aleatório é maior");
            } else
                System.out.println("O número aleatório é menor");
        }
        if (chute != r){
            System.out.println("Você perdeu, o número correto era " + r);
        }
    }
}
