import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo;
        double valorSolicitado;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Insira valor a retirar: ");
        valorSolicitado = scanner.nextDouble();

        if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
            System.out.println("Novo saldo: "+saldo);
        } else {
            System.out.println("Saldo Insuficiente! ");
        }
        
    }
}
