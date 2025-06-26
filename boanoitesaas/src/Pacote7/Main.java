package Pacote7;
import java.util.Scanner;

import Pacote.Assinatura;
import Pacote1.CategoriaProduto;
import Pacote10.Produtos;
import Pacote11.Recebimentos;
import Pacote12.RelatórioGerado;
import Pacote13.Usuário;
import Pacote14.Vendas;
import Pacote2.Clientes;
import Pacote3.Despesas;
import Pacote4.EstoqueMovimentação;
import Pacote5.ItensVenda;
import Pacote6.LogsAcesso;
import Pacote8.Notificações;
import Pacote9.Planos;

public class Main {
    
    public static void voltaraoMenu() {
        String[] args = null;
        main(args);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--Bem vindo a nossa empresa-- ");
        System.out.println("Você quer acessar qual dos nossos menus?");
        System.out.println("1 - Assinatura");
        System.out.println("2 - Categoria Produto");
        System.out.println("3 - Clientes");
        System.out.println("4 - Despesa");
        System.out.println("5 - Estoque Movimentacao");
        System.out.println("6 - Itens Venda");
        System.out.println("7 - Logs de Acesso");
        System.out.println("8 - Notificacoes");
        System.out.println("9 - Planos");
        System.out.println("10 - Produtos");
        System.out.println("11 - Recebimentos");
        System.out.println("12 - Relatorio Gerado");
        System.out.println("13 - Usuario");
        System.out.println("14 - Vendas");
        System.out.println("\n-----------------------------");

        int menu = teclado.nextInt();

       

if (menu == 1) {
    Assinatura assinatura = new Assinatura();
    assinatura.servico1(teclado);

} else if (menu == 2) {
    CategoriaProduto categoriaProduto = new CategoriaProduto();
    categoriaProduto.servico2(teclado);

} else if (menu == 3) {
    Clientes cliente = new Clientes();
    cliente.servico3(teclado);

} else if (menu == 4) {
    Despesas despesas = new Despesas();
    despesas.servico4(teclado);

} else if (menu == 5) {
    EstoqueMovimentação movimentacao = new EstoqueMovimentação();
    movimentacao.servico5(teclado);

} else if (menu == 6) {
    ItensVenda itens = new ItensVenda();
    itens.servico6(teclado);

} else if (menu == 7) {
    LogsAcesso logs = new LogsAcesso();
    logs.servico7(teclado);

} else if (menu == 8) {
    Notificações notificacoes = new Notificações();
    notificacoes.servico8(teclado);

} else if (menu == 9) {
    Planos planos = new Planos();
    planos.servico9(teclado);

} else if (menu == 10) {
    Produtos produtos = new Produtos();
    produtos.servico10(teclado);

} else if (menu == 11) {
    Recebimentos recebimentos = new Recebimentos();
    recebimentos.servico11(teclado);

} else if (menu == 12) {
    RelatórioGerado relatorio = new RelatórioGerado();
    relatorio.servico12(teclado);

} else if (menu == 13) {
    Usuário usuario = new Usuário();
    usuario.servico13(teclado);

} else if (menu == 14) {
    Vendas vendas = new Vendas();
    vendas.servico14(teclado);

} else {
    System.out.println("Opção inválida.");
}
}
    }