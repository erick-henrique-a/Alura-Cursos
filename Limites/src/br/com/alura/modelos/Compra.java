package br.com.alura.modelos;

public class Compra extends Cartao{
    private double valor;
    private String nome;

    public Compra(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString(){
        return this.nome + " - " + this.valor + "\n";
    }


}
