package Pacote11;

import java.util.Scanner;

import Pacote7.Main;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Recebimentos {
    public static void servico11(Scanner teclado) {

        System.out.println("Olá, Bem-vindo");
        System.out.println("Se cadastre no nosso sistema de assinatura!");

        try {
            System.out.println("----Recebimentos-----");
            ArrayList<String> produtos1 = new ArrayList<>();

            System.out.println("Quantos recebimentos foram realizados?");
            int quantidade = teclado.nextInt();
            teclado.nextLine(); 

            for (int i = 0; i < quantidade; i++) {
                System.out.println("\nRecebimento " + (i + 1));

                System.out.print("De onde veio o produto?: ");
                String endereco = teclado.nextLine();

                System.out.print("Data que foi enviado o produto: ");
                String data = teclado.nextLine();

                System.out.print("Produto veio danificado? (Sim/Não): ");
                String danificado = teclado.nextLine();

                System.out.print("Quantidade de produtos recebidos: ");
                int quantidadeEnviados = teclado.nextInt();
                teclado.nextLine(); 

                String produtos = "Endereço do encaminhamento: " + endereco +
                        " | Data de envio do produto: " + data +
                        " | Produto veio danificado?: " + danificado +
                        " | Quantidade recebida: " + quantidadeEnviados;

                produtos1.add(produtos);
            }

            System.out.println("Produtos cadastrados:");
            for (String p : produtos1) {
                System.out.println(p);
            }

            System.out.println("Digite 0 para voltar ao menu:");
            int voltar = teclado.nextInt();

            if (voltar == 0) {
                ;
            } else {
                System.out.println("Número inválido.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro encontrado. Use número inteiro.");
            teclado.nextLine(); 
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            
            System.out.println("Digite 0 para voltar ao menu:");
            int voltar = teclado.nextInt();
            if (voltar == 0) {
               
                Main.voltaraoMenu();
            } else {
                System.out.println("Encerrando o programa.");
            }
        }
    }
}