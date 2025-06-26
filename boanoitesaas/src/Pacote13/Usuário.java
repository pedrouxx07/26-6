package Pacote13;

import java.util.Scanner;

import Pacote7.Main;

/**
 *
 * @author Aluno
 */
public class Usuário {
    public static void servico13(Scanner teclado) {

        System.out.println("Olá, Bem-vindo");
        System.out.println("Se cadastre no nosso sistema de assinatura!");

        System.out.println("Digite o seu nome:");
        String nome = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Digite o seu email:");
        String email = teclado.nextLine();

        System.out.println("Digite a sua senha (apenas números):");
        int senha = teclado.nextInt();
        teclado.nextLine(); 

        System.out.println("Digite o tipo de usuário, se é comum ou ADM:");
        String tipo = teclado.nextLine();

        System.out.println("Digite a sua data de inscrição (ex: 25/06/2025):");
        String data = teclado.nextLine();

        System.out.println("Dados cadastrados:");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Tipo: " + tipo);
        System.out.println("Data: " + data);
        
        System.out.println("Digite 0 para voltar ao menu:");
        int voltar = teclado.nextInt();
        if (voltar == 0) {
           
            Main.voltaraoMenu();
        } else {
            System.out.println("Encerrando o programa.");
        }
    }
}