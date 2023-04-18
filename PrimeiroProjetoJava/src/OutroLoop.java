import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int count = 0;
        String continua = "sim";
        while(continua.equalsIgnoreCase("sim")) {
            System.out.println("Diga sua avaliação: ");
            nota = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Deseja acrescentar mais notas?");
            continua = scanner.nextLine();
            media += nota;
            count += 1;
        }
        System.out.println("Media das notas: " + media/count);
    }
}

