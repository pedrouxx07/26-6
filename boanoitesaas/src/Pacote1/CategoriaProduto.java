package Pacote1;

import java.util.Scanner;

import Pacote7.Main;

public class CategoriaProduto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        servico2(teclado);
        
    }

    public static void servico2(Scanner teclado) {
        System.out.println("Olá, Bem-vindo");
        System.out.println("Se cadastre no nosso sistema de assinatura!");

        System.out.println("Diga nome do produto:");
        String nome = teclado.nextLine();

        System.out.println("Diga o id do produto:");
        int idProduto = teclado.nextInt();
        teclado.nextLine(); 

        System.out.println("Diga se ele é inflamável:");
        String info2 = teclado.nextLine();

        System.out.println("Diga se ele é quebrável:");
        String info5 = teclado.nextLine();

        System.out.println("Diga se ele é eletrônico:");
        String info10 = teclado.nextLine();

        System.out.println("Produto cadastrado:");
        System.out.println("Nome do Produto: " + nome);
        System.out.println("ID do Produto: " + idProduto);
        System.out.println("Inflamável: " + info2);
        System.out.println("Quebrável: " + info5);
        System.out.println("Eletrônico: " + info10);

        System.out.println("Digite 0 para voltar ao menu:");
        int voltar = teclado.nextInt();
        if (voltar == 0) {
            Main.voltaraoMenu(); 
        } else {
            System.out.println("Encerrando o programa.");
        }
    }

}