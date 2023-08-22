package edu.sintaxe.operadores;
public class ComparacaoAvancada {
    public static void main(String[] args) {
        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2);

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3);

        String nome4 = nome3;

        System.out.println(nome3 == nome4);

        System.out.println(nome1.equals(nome2));
        System.out.println(nome2.equals(nome3));
        System.out.println(nome3.equals(nome4));

        System.out.println("----------------");

        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2);

        Integer numero3 = 130;
        Integer numero4 = 130;
        System.out.println(numero3 == numero4);
        System.out.println(numero3.equals(numero2));

        System.out.println("----------------");

        int numero5 = 1;
        int numero6 = 1;
        if(numero5 == 2 || numero6 ++ == 2) {
            System.out.println("As 2 condições são verdadeiras");
        }
        System.out.println("O numero 5 agora é " + numero5);
        System.out.println("O numero 6 agora é " + numero6);

    }
}
