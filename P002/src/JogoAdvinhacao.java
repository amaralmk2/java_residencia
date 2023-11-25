import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    private int numeroAleatorio;
    private int tentativas;

    public JogoAdvinhacao() {
        Random random = new Random();
        numeroAleatorio = random.nextInt(100) + 1;
        tentativas = 0;
    }

    public void iniciarJogo(Scanner scanner) {
        int palpite;

        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto. Tente novamente.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }

        } while (palpite != numeroAleatorio);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");

        JogoAdvinhacao jogo = new JogoAdvinhacao();

        jogo.iniciarJogo(scanner);

        scanner.close();
    }
}