package contador;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o parâmetro 01: ");
        int parametro01 = scanner.nextInt();
        System.out.println("Digite o parâmetro 02: ");
        int parametro02 = scanner.nextInt(); 

        try {
            contar(parametro01, parametro02);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    static void contar(int parametro01, int parametro02) throws Exception {
        if (parametro01 <= parametro02) {
            throw new Exception("O parâmetro 01 precisa ser maior que o parâmetro 02.");
        }

        int contagem = parametro01 - parametro02;

        for (int p = 0; p < contagem; p++) {
            System.out.println("Imprimindo o número " + p);
        }
    }
}
