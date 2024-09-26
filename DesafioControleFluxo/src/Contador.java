import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Primeiro try para verificar se o número inserido é um número inteiro
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();
            // Segundo try para verificar a condição do primeiro número ser menor que o segundo número
            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println("O primeiro parâmetro não pode ser maior que o segundo");
            }
        } catch (InputMismatchException e) {
            System.err.println("O campo deve ser um número inteiro");
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
    
        int contagem = parametroDois - parametroUm;
        for (int indice = 1; indice <= contagem; indice++){
            System.out.println("Imprimindo o número " + indice);
        }
    }
}

