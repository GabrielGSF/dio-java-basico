import java.util.Scanner;
import java.util.Locale;

public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira nora do aluno: ");
        double nota = scanner.nextDouble();

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
