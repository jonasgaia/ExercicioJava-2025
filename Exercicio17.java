//17 - Desenvolva um jogo onde o computador sorteie um número entre 1 e
//100, e o usuário tente adivinhá-lo. O programa deve dar dicas ("maior" ou
//"menor") até o acerto.

import java.util.Scanner;
import java.util.Random;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAlvo = random.nextInt(100) + 1;
        int numeroAdvinhado;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar!");

        do {
            System.out.print("Digite seu palpite: ");
            numeroAdvinhado = scanner.nextInt();
            tentativas++;

            if (numeroAdvinhado < numeroAlvo) {
                System.out.println("Maior! Tente um número mais alto.");
            } else if (numeroAdvinhado > numeroAlvo) {
                System.out.println("Menor! Tente um número mais baixo.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (numeroAdvinhado != numeroAlvo);

        scanner.close();
    }
}