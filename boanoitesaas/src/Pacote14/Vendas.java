package Pacote14;

import java.util.Scanner;

import Pacote7.Main;

/**
 *
 * @author Aluno
 */
public class Vendas {
       public static void servico14(Scanner teclado) {
         
         System.out.println("Olá, Bem-vindo");
         System.out.println("Se cadastre no nosso sistema de assinatura!");
         
         Scanner tec = new Scanner(System.in);
         System.out.println("Diga seu nome");
         String nome = tec.nextLine();
         System.out.println("Plano Free:");
         System.out.println("Plano Premium:");
         System.out.println("Plano Premium:");
         System.out.println("Diga o plano que voce deseja");
         String plano = tec.nextLine();
         
         System.out.println("Digite 0 para voltar ao menu:");
         int voltar = teclado.nextInt();
         if (voltar == 0) {
            
             Main.voltaraoMenu();
         } else {
             System.out.println("Encerrando o programa.");
         }
}
}