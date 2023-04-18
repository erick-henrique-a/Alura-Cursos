public class Condicional {
    public static void main(String[] args){
        int anoDeLancamento = 2023;
        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = false;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lannçamento que os clietes estão curtindo");
        } else{
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano == true || tipoPlano.equalsIgnoreCase("plus")){
            System.out.println("ta liberado");
        } else{
            System.out.println("deve pagar a conta");
        }
    }
}
