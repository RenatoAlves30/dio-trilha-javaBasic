package desafioJavaBasico;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ContaTerminal novaConta = new ContaTerminal();

        System.out.println("Olá! Seja bem vindo ao nosso banco digital.");
        System.out.print("Por favor, digite o seu nome: ");
        novaConta.setNomeCliente(scanner.nextLine());

        System.out.print("Digite o número da sua agência: ");
        novaConta.setAgencia(scanner.nextLine());

        System.out.print("Digite o número da sua conta: ");
        novaConta.setNumeroDaConta(scanner.nextInt());

        novaConta.imprimir();
        scanner.close();
    }
}
