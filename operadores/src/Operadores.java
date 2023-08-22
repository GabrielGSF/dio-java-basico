import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        //Operador Atribuição
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //Operadores Aritmétricos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicação = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
        // + para Concatenação de textos
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //Oeradores Unários
        int numero = 5;
        System.out.println(- numero);
        numero ++;
        System.out.println(numero);
        System.out.println(numero ++);
        System.out.println(numero);
        System.out.println(++ numero);
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);

        //Operadores Ternários
        int a, b;
        a = 5;
        b = 6;
        String resultado2;
        if (a==b) {
            resultado2 = "verdadeiro";
        } else {
            resultado2 = "falso";
        }
        System.out.println(resultado2);
        String resultado3 = (a==b) ? "verdadeiro" : "falso";
        System.out.println(resultado3);

        //Operadores Relacionais
        int numero1 = 1;
        int numero2 = 2;
        if(numero1 > numero2) {
            System.out.println("Numero 1 maior que numero 2");
        }
        if(numero1 < numero2) {
            System.out.println("Numero 1 menor que numero 2");
        }
        if (numero1 >= numero2) {
            System.out.println("Numero 1 maior ou igual que numero 2");
        }
        if (numero1 <= numero2) {
            System.out.println("Numero 1 menor ou igual que numero 2");
        }
        if (numero1 != numero2) {
            System.out.println("Numero 1 é diferente de numero 2");
        }

        //Operadores Lógicos
        boolean condicao1=true;
        boolean condicao2=false;
        //Se condicao1 E condicao2 forem verdadeiras...
        if(condicao1 && condicao2) {
            System.out.println("Os dois valores precisam ser verdadeiros");
        }
        //Se condicao1 OU condicao2 for verdadeira...
        if(condicao1 || condicao2) {
            System.out.println("Um dos valores precisa ser verdadeiro");
        }  
    }   
}
