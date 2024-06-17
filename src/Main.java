import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continuarCompra;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Seja bem-vindo! Informe seu nome: ");
        String nome = scanner.nextLine();

        // Dados do usuário
        System.out.printf("Digite o limite do cartão, %s: ", nome);
        double limite = scanner.nextDouble();

        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        do {
            System.out.printf("Insira o nome do produto, %s: ", nome);
            String nomeProduto = scanner.next();

            System.out.printf("Digite o valor da compra, %s: ", nome);
            double valor = scanner.nextDouble();
            scanner.nextLine();

            var compra = new Compra(nome ,nomeProduto, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if(compraRealizada) {
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
                continuarCompra = "n";
            }

            System.out.println("Digite qualquer caractere para continuar ou 'n' (não desejo continuar):");
            continuarCompra = scanner.nextLine();

        } while (!continuarCompra.equalsIgnoreCase("n"));

        System.out.println("******************************");
        System.out.println("COMPRAS REALIZADAS: \n");
        // produtos do usuário ordenados
        Collections.sort(cartao.getCompras());

        // produtos do usuário
        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getNomeProduto()+ " - " +c.getValor());
        }
        System.out.println("\n******************************");

        //Lista de usuários e suas compras
    }
}