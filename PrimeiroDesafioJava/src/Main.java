import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = "Jacqueline Oliveira";
        String conta = "Corrente";
        String operacoes = """
                1- Consultar Saldo
                2- Realizar Depósito
                3- Realizar Saque
                4- Sair\n
                Digite a opção desejada: 
                """;
        double saldo = 2500;
        double aux;
        int op = 0;

        System.out.println("**************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta:" + conta);
        System.out.println("Saldo: " + saldo);
        System.out.println("**************************\n");

        while(op != 4){
            System.out.println(operacoes);
            op = ler.nextInt();
            switch (op){
                case 1:
                    System.out.println("Saldo atual: R$" +saldo + "\n");
                    break;
                case 2:
                    System.out.println("Valor a ser depositado: ");
                    aux = ler.nextDouble();
                    saldo += aux;
                    System.out.println("Saldo Atualizado:R$" + saldo +"\n");
                    break;
                case 3:
                    System.out.println("Valor a ser Retirado: ");
                    aux = ler.nextDouble();
                    saldo -= aux;
                    System.out.println("Saldo Atualizado:R$" + saldo +"\n");
                    break;
                case 4:
                    System.out.println("Agradeçemos a preferência, volte sempre!");
                    break;
            }
        }
    }

}