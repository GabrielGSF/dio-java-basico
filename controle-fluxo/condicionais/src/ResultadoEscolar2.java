import java.util.Scanner;
import java.util.Locale;

public class ResultadoEscolar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira nota do aluno: ");
        double nota = scanner.nextDouble();

        String resultado =  nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
