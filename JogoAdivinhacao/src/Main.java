import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogo da Adivinhação");
        System.out.println("===================");
        System.out.println("Tente adivinhar o numero aleatório!");
        System.out.println("Você tem 5 tentativas");
        System.out.println();

        int numeroAleatorio = new Random().nextInt(100); // gera um número aleatório
        int numero = 0;

        for (int i = 1; i < 6; i++) { // loop para limitar a 5 tentativas
            System.out.println("Digite o número: ");
            numero = scanner.nextInt(); // lê e armazena na variável o número digitado pelo usuário

            if (numero == numeroAleatorio){ // verifica se o numero é igual
                System.out.println("Parabéns você acertou!");
                System.out.println("Numero de tentativas: " + i);
                break;
            } else if (numero < numeroAleatorio) { // verifica se o número digitado é menor para mostrar a dica
                System.out.println("Tente novamente");
                System.out.println("Dica: O numero é maior\n");
            }else {
                System.out.println("Tente novamente");
                System.out.println("Dica: O numero é menor\n");
            }

        }

        if (numero != numeroAleatorio){ // verifica se o número é diferente para mostrar ao usuário que perdeu o jogo
            System.out.println("Você perdeu!");
            System.out.println("Limite de tentativas atingido");
            System.out.println("O número era: " + numeroAleatorio);
        }

    }
}