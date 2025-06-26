package Pacote8;

import java.util.Scanner;

import Pacote7.Main;

/**
 *
 * @author Aluno
 */
public class Notificações {
       public static void servico8(Scanner teclado) {
         
         System.out.println("Olá, Bem-vindo");
         System.out.println("Se cadastre no nosso sistema de assinatura!");
         
         System.out.println("=== Registro De Notificação ===");
        System.out.print("Ação realizada pelo usuário: ");
        String acao = teclado.nextLine();

        System.out.print("Data e hora da ação: ");
        String dataHora = teclado.nextLine();

        System.out.print("IP de origem: ");
        String ipOrigem = teclado.nextLine();
         
        System.out.println("Informações:");
        System.out.println("Ação: " + acao);
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("IP: " + ipOrigem);
        
        System.out.println("Digite 0 para voltar ao menu:");
        int voltar = teclado.nextInt();
        if (voltar == 0) {
           
            Main.voltaraoMenu();
        } else {
            System.out.println("Encerrando o programa.");
        }
    }
}