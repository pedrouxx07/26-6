package Pacote9;

import java.util.Scanner;
import Pacote.Assinatura;

public class Planos {
    public static void servico9(Scanner teclado) {
        System.out.println("Olá, Bem-vindo!");
        System.out.println("Cadastre-se no nosso sistema de assinatura!");
        
        System.out.println("Diga seu nome:");
        String nome = teclado.nextLine();

        System.out.println("Plano Free:");
        System.out.println("- Cadastro de até 5 produtos");
        System.out.println("- Acesso limitado ao suporte técnico");
        System.out.println("- Visualização de relatórios simples");
        System.out.println("- Atualizações básicas do sistema");

        System.out.println("---------------------------------------------------");

        System.out.println("Plano Premium:");
        System.out.println("- Cadastro ilimitado de produtos");
        System.out.println("- Suporte técnico prioritário por e-mail");
        System.out.println("- Relatórios completos e exportáveis");
        System.out.println("- Acesso a integrações com outros sistemas");
        System.out.println("- Atualizações automáticas e preferenciais");

        System.out.println("---------------------------------------------------");

        System.out.println("Plano Avançado:");
        System.out.println("- Todas as vantagens do plano Premium");
        System.out.println("- Acesso multiusuário com permissões personalizadas");
        System.out.println("- Painel de controle avançado");
        System.out.println("- Suporte técnico 24/7 por telefone e e-mail");
        System.out.println("- Treinamento e consultoria personalizada");

        System.out.println("---------------------------------------------------");
        
        System.out.println("Diga o plano que você deseja:");
        String plano = teclado.nextLine();

        System.out.println("Digite 1 para assinar o plano:");
        int ir = teclado.nextInt();
        teclado.nextLine(); 

        if (ir == 1) {
            Assinatura.servico1(teclado);
        } else {
            System.out.println("Encerrando o programa.");
        }
    }
}