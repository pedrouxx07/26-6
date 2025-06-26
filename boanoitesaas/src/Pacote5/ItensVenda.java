package Pacote5;

import java.util.Scanner;

import Pacote7.Main;


public class ItensVenda {
    public static void servico6(Scanner teclado) {
         
         System.out.println("Olá, Bem-vindo");
         System.out.println("Se cadastre no nosso sistema de assinatura!");
         
        System.out.println("Digite o ID da venda:");
        int idVenda = teclado.nextInt();

        System.out.println("Digite o ID do produto:");
        int idProduto = teclado.nextInt();

        System.out.println("Digite a quantidade:");
        int quantidade = teclado.nextInt();

        System.out.println("Digite o preço unitário:");
        double precoUnitario = teclado.nextDouble();

        System.out.println("Digite o subtotal:");
        double subtotal = teclado.nextDouble();

        System.out.println("Dados do item da venda:");
        System.out.println("ID da venda: " + idVenda);
        System.out.println("ID do produto: " + idProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Subtotal: R$ " + subtotal);
        
        System.out.println("Digite 0 para voltar ao menu:");
        int voltar = teclado.nextInt();
        if (voltar == 0) {
           
            Main.voltaraoMenu();
        } else {
            System.out.println("Encerrando o programa.");
        }
    }
}