
public class Conta {
    
    double saldo = 10.0;

    public void sacar(Double valor) {
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        System.out.println(saldo);
        
        //novoSaldo pertence apenas ao método sacar()
        //System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial() {
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for (int x = 1; x <= 5; x++) {
            double valorCalculado = valorParcela * x;
            valorMontante += valorCalculado;
        }
        //escopo de fluxo
        return valorMontante;
    }
}
