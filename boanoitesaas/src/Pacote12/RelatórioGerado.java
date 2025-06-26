package Pacote12;

import java.util.Scanner;

import Pacote7.Main;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class RelatórioGerado {
    public static void servico12(Scanner teclado) {
        System.out.println("Olá, Bem-vindo");
        System.out.println("Se cadastre no nosso sistema de assinatura!");

        try {
            System.out.println("----Relatórios-----");
            ArrayList<String> relatorios = new ArrayList<>();

            System.out.println("Quantos relatórios você quer fazer?");
            int quantidade = teclado.nextInt();
            teclado.nextLine(); 

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Relatório " + (i + 1));

                System.out.print("Data que foi enviado o produto: ");
                String data = teclado.nextLine();

                System.out.print("Valor de produtos recebidos: ");
                int valor = teclado.nextInt();
                teclado.nextLine(); 

                String relatorio = "Data de envio do produto: " + data +
                        " | Valor de produtos recebidos: " + valor;

                relatorios.add(relatorio);
            }

            System.out.println("Relatórios confirmados:");
            for (String r : relatorios) {
                System.out.println(r);
            }

            System.out.println("Digite 0 para voltar ao menu:");
            int voltar = teclado.nextInt();

            if (voltar == 0) {
                
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