package br.com.alura.modelos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Cartao {
    private double limite;
    
    public Cartao(){}

    public double getLimite() {
        return limite;
    }

    public static int novaCompra(double limite, ArrayList<Compra> compras){
        String resposta = "Sim";
        Scanner le = new Scanner(System.in);

        while (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")){

            System.out.println("Digite a descrição da compra:");
            Compra compra = new Compra(le.next());

            System.out.println("Digite o valor da compra:");
            compra.setValor(le.nextDouble());

            if(compra.getValor() < limite){
                compras.add(compra);
                limite -= compra.getValor();
                System.out.println("Compra realizada com sucesso!");
            } else{
                System.out.println("Saldo insuficiente");
                Cartao.impressao(compras);
                System.out.println("\nSaldo do cartão: " +compra.getLimite());
                return 0;
            }
            System.out.println("Gostaria de continuar comprando?");
            resposta = le.next();

        }
        Cartao.impressao(compras);
        System.out.println("\nSaldo do cartão: " + limite);
        return 0;
    }
    public static void impressao(ArrayList <Compra> compras){
        compras.sort(Comparator.comparing(Compra:: getValor));
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        for (Compra c : compras) {
            System.out.println(c.getNome() + " - " +c.getValor());
        }
        System.out.println("\n***********************");
    }

}
