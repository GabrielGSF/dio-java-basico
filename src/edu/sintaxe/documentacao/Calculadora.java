package edu.sintaxe.documentacao;
/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
*@author Gabriel dos Santos Ferreira
*@version 1.0
*@since 22/08/2023
*/


public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
    // Comentário de linha única
    /*
     * Comentário linha multipla
     */
    /**
     * Documentação
     */
    
     /*
     * Este método foi elaborado as pressas
     * por isso eu abreviei o nome das variáveis
     * mas olha, ele tem a finalidade de somar ou multiplicar
     * dois núemros
     */
    public int somaMultiplica (int n, int x, String m) {
        int r = 0; //r é igual ao resultado
        if (m == "M") { // M = multiplicação
            r = n * x;
        } else {
            // se não soma mesmo
        }
        return r;
    }
}
