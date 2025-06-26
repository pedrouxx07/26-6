package Pacote4;

import java.util.Scanner;

import Pacote7.Main;

/**
 *
 * @author Aluno
 */
public class EstoqueMovimentação {  
    public static void servico5(Scanner teclado) {
         
        System.out.println("Olá, Bem-vindo");
        System.out.println("Se cadastre no nosso sistema de Estoque!");
         
        System.out.println("Digite a descrição do produto:");
        String descricao = teclado.nextLine();

        System.out.println("Digite o preço de venda:");
        double precoVenda = teclado.nextDouble();

        System.out.println("Digite o preço de custo:");
        double precoCusto = teclado.nextDouble();

        System.out.println("Digite o ID da categoria:");
        int idCategoria = teclado.nextInt();

        System.out.println("Digite a quantidade em estoque:");
        int quantidadeEstoque = teclado.nextInt();

       
        System.out.println("Produto cadastrado:");
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço de venda: R$ " + precoVenda);
        System.out.println("Preço de custo: R$ " + precoCusto);
        System.out.println("ID da categoria: " + idCategoria);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        
        System.out.println("Digite 0 para voltar ao menu:");
        int voltar = teclado.nextInt();
        if (voltar == 0) {
           
            Main.voltaraoMenu();
        } else {
            System.out.println("Encerrando o programa.");
        }

    }
}