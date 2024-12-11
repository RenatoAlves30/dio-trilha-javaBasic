package desafioJavaControleDeFluxo;

import java.util.Scanner;

public class Contador {
public static void main(String[] args) throws ParametrosInvalidosException{

		Scanner terminal = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();

		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}

        terminal.close();
		
	}
	
    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String msg) {
            super(msg);
        }

    }
    
    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = parametroDois - parametroUm;

            for (int i = 0; i <= contagem; i++) {
                System.out.println("Imprimindo número: " + (i + 1));
            }
            //realizar o for para imprimir os números com base na variável contagem
        }

		
	}
}
