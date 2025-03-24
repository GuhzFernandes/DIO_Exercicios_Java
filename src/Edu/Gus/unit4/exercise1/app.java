package Edu.gus.unit4.exercise1;

import Edu.gus.unit4.exercise1.model.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicação!");

        // Testando Gerente
        System.out.println("\n=== TESTE GERENTE ===");
        Gerente gerente = new Gerente("Ana", "ana@empresa.com", "senha123");
        System.out.println("Administrador (deve ser true): " + gerente.getAdministrador());
        gerente.login("senha123");
        gerente.gerarRelatorioFinanceiro();

        // Criando vendedor para teste de consulta
        Vendedor vendedorTeste = new Vendedor("Carlos", "carlos@empresa.com", "abc123", 10);
        int vendas = gerente.consultarVendas(vendedorTeste);
        System.out.println("Vendas do vendedor Carlos: " + vendas);

        gerente.alterarDados("Ana Paula", "anapaula@empresa.com", "senha123");
        gerente.alterarSenha("senha123", "novaSenha");
        gerente.login("novaSenha");
        gerente.logoff();

        // Testando Vendedor
        System.out.println("\n=== TESTE VENDEDOR ===");
        Vendedor vendedor = new Vendedor("Bruno", "bruno@empresa.com", "brsenha");
        System.out.println("Administrador (deve ser false): " + vendedor.getAdministrador());

        vendedor.login("brsenha");
        System.out.println("Vendas iniciais: " + vendedor.consultarVendas());

        vendedor.realizarVenda();
        vendedor.realizarVenda();
        System.out.println("Vendas após duas vendas: " + vendedor.consultarVendas());

        vendedor.alterarDados("Bruno Silva", "bsilva@empresa.com", "brsenha");
        vendedor.alterarSenha("brsenha", "novasenha123");
        vendedor.login("novasenha123");
        vendedor.logoff();

        // Testando Atendente
        System.out.println("\n=== TESTE ATENDENTE ===");
        Atendente atendente = new Atendente("Clara", "clara@empresa.com", "cls123");
        System.out.println("Administrador (deve ser false): " + atendente.getAdministrador());

        atendente.login("cls123");
        atendente.receberPagamento(150.50);
        atendente.receberPagamento(249.90);
        atendente.fecharCaixa();

        atendente.alterarDados("Clara Lima", "climalima@empresa.com", "cls123");
        atendente.alterarSenha("cls123", "clarinha123");
        atendente.login("clarinha123");
        atendente.logoff();

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}
