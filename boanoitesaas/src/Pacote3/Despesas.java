package Pacote3;

import java.util.Scanner;
import Pacote7.Main;
import java.util.InputMismatchException;

public class Despesas {
    public static void servico4(Scanner teclado) {
        try {
            System.out.print("Descrição da despesa: ");
            String desc = teclado.nextLine();  
            System.out.print("Valor: R$ ");
            double valor = teclado.nextDouble();  
            teclado.nextLine();  
            System.out.print("Data (YYYY-MM-DD): ");
            String data = teclado.nextLine();  
            System.out.print("Categoria: ");
            String categoria = teclado.nextLine();  

            System.out.printf("Despesa registrada: %s | R$ %.2f | %s | categoria %s%n",
                              desc, valor, data, categoria);
        } catch (InputMismatchException e) {
            System.out.println("❌ Erro: entrada inválida.");
            teclado.nextLine();  

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