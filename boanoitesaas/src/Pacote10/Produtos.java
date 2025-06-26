package Pacote10;

import java.util.Scanner;

import Pacote7.Main;

import java.util.ArrayList; 
import java.util.InputMismatchException;

/**
 *
 * @author Aluno
 */
public class Produtos {
    public static void servico10(Scanner teclado) {
        try {
            System.out.println("Olá, Bem-vindo");
            System.out.println("Se cadastre no nosso sistema de assinatura!");

            ArrayList<String> listaProdutos = new ArrayList<>();

            System.out.println("Quantos produtos você deseja cadastrar?");
            int quantidade = teclado.nextInt();
            teclado.nextLine(); 

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Produto " + (i + 1));

                System.out.print("Nome: ");
                String nome = teclado.nextLine();

                System.out.print("Descrição: ");
                String descricao = teclado.nextLine();

                System.out.print("Preço de venda: ");
                String precoVenda = teclado.nextLine();

                System.out.print("Preço de custo: ");
                String precoCusto = teclado.nextLine();

                System.out.print("Quantidade no estoque: ");
                String quantidadeEstoque = teclado.nextLine();

                String produtoFormatado = "Nome: " + nome +
                        " | Descrição: " + descricao +
                        " | Preço de venda: " + precoVenda +
                        " | Preço de custo: " + precoCusto +
                        " | Quantidade em estoque: " + quantidadeEstoque;

                listaProdutos.add(produtoFormatado);
            }

            System.out.println("Produtos cadastrados:");
            for (String produto : listaProdutos) {
                System.out.println(produto);
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