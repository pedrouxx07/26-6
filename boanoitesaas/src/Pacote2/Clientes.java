package Pacote2;

import java.util.Scanner;

import Pacote7.Main;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Clientes {
    public static void servico3(Scanner teclado) {
        try {
            System.out.println("Olá, Bem-vindo");
            System.out.println("Se cadastre no nosso sistema de assinatura!");

            System.out.println("----Clientes----");
            ArrayList<String> clientes1 = new ArrayList<>();
            System.out.print("Quantos clientes você deseja cadastrar?: ");
            int quantidade = teclado.nextInt();
            teclado.nextLine();  

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Cliente " + (i + 1));
                System.out.print("Nome: ");
                String nome = teclado.nextLine();
                System.out.print("Email: ");
                String email = teclado.nextLine();
                System.out.print("Endereço: ");
                String endereco = teclado.nextLine();
                System.out.print("Telefone: ");
                String telefone = teclado.nextLine();
                System.out.print("CPF: ");
                String cpf = teclado.nextLine();

                String dadoCliente = "Nome: " + nome + " | Email: " + email + " | Endereço: " + endereco +
                                     " | Telefone: " + telefone + " | CPF: " + cpf;
                clientes1.add(dadoCliente);
            }

            System.out.println("Clientes cadastrados:");
            for (String c : clientes1) {
                System.out.println(c);
            }

            System.out.print("Veja os outros clientes cadastrados: ");
            System.out.print("------------------------------------------------------------------------------------------------");
            System.out.print("Qual Cliente você quer acessar (1 a " + clientes1.size() + "), digite (11) para ver todos ou (12) para sair: ");
            int escolha = teclado.nextInt();

         
            if (escolha >= 1 && escolha <= clientes1.size()) {
                System.out.println("Cliente selecionado: " + clientes1.get(escolha - 1));
            } else if (escolha == 11) {
                System.out.println("Todos os clientes cadastrados:");
                for (String c : clientes1) {
                    System.out.println(c);
                }
            } else if (escolha == 12) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Número inválido. Digite de 1 a " + clientes1.size() + " ou 11 para ver todos.");
            }

            
            System.out.println("Digite 0 para voltar ao menu:");
            int voltar = teclado.nextInt();
            if (voltar == 0) {
               
                Main.voltaraoMenu();
            } else {
                System.out.println("Encerrando o programa.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro encontrado. Use número inteiro. ");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            
            teclado.close();
        }
    }
}