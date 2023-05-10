package br.com.alura.principal;

import br.com.alura.modelos.Cartao;
import br.com.alura.modelos.Compra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        ArrayList<Compra> compras = new ArrayList<>();

        System.out.println("Digite o limite do cartão:");
        Compra.novaCompra(le.nextDouble(), compras);


    }
}