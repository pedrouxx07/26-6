package Pacote;

import java.util.Scanner;
import Pacote7.Main;

public class Assinatura {
    public static void servico1(Scanner teclado) {
        System.out.println("--- Cadastro de Assinatura ---");

        System.out.println("Diga seu nome:");
        String nome = teclado.nextLine();

        System.out.println("Diga o plano que você deseja:");
        String plano = teclado.nextLine();

        System.out.println("Diga o seu email:");
        String email = teclado.nextLine();

        System.out.println("Diga o seu telefone:");
        String telefone = teclado.nextLine();

        System.out.println("Diga o ID da sua empresa:");
        String id_empresa = teclado.nextLine();

        System.out.println("--- Confirmação de Cadastro ---");
        System.out.println("Nome: " + nome);
        System.out.println("Plano: " + plano);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("ID da Empresa: " + id_empresa);
        System.out.println("--------------------------------");
        System.out.println("Agora diga a opção de pagamento!");
        System.out.println("1 - Débito");
        System.out.println("2 - Crédito");
        System.out.println("3 - PIX");
        System.out.println("---------------------------------");
        System.out.print("Digite o número da opção desejada: ");

        int opcao = teclado.nextInt();

        if (opcao == 1) {
            System.out.println("Pagamento selecionado: Débito.");
            System.out.println("Numero do cartão:");
            int info1 = teclado.nextInt();
            System.out.println("Nome do titular:");
            String info2 = teclado.nextLine();
            teclado.nextLine();
            System.out.println("Data Validade:");
            int info3 = teclado.nextInt();
            System.out.println("CVV:");
            int info4 = teclado.nextInt();
        } else if (opcao == 2) {
            System.out.println("Pagamento selecionado: Crédito.");
            System.out.println("Numero do cartão:");
            int info1 = teclado.nextInt();
            System.out.println("Nome do titular:");
            String info2 = teclado.nextLine();
            System.out.println("Data Validade:");
            int info3 = teclado.nextInt();
            System.out.println("CVV:");
        } else if (opcao == 3) {
            System.out.println("Pagamento selecionado: PIX.");
            System.out.println("O QRcode será exibido na tela.");
            System.out.println("Caso não, pague com a chave CPF.");
            System.out.println("123.456.789-10");
        } else {
            System.out.println("Opção inválida. Por favor, selecione uma forma de pagamento válida.");
        }

        System.out.println("Obrigado por assinar! Enviaremos o comprovante para o seu email. :)");

        System.out.println("Digite 0 para voltar ao menu:");
        int voltar = teclado.nextInt();
        teclado.nextLine(); 

        if (voltar == 0) {
            Main.voltaraoMenu();
        } else {
            System.out.println("Encerrando o programa.");
        }
    }
}