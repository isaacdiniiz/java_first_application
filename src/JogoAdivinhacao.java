import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 1;
        int chute;
        boolean acertou = false;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Tente acertar o numero aleatorio entre 0 e 100! Voce possui seis tentativas");
        while (tentativas <= 6) {
            chute = leitura.nextInt();
            if (chute == numeroAleatorio) {
                System.out.println("Voce acertou! O numero aleatorio era " + chute + "!");
                System.out.println("Voce precisou de " + tentativas + " tentativas!");
                acertou = true;
                break;
            } else if (chute < numeroAleatorio) {
                System.out.println("O numero aleatorio é maior!");
            } else {
                System.out.println("O numero aleatorio é menor!");
            }

            tentativas++;
        }

        if (!acertou) {
            System.out.println("As tentativas acabaram! O numero aleatorio era " + numeroAleatorio + "!");
        }
    }
}
