/*
Author: Ygor Pires

DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI

Questão 01 :

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere *
e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter
nenhum espaço.
* */
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        //A Variavel "num" tem como objetivo definir o tamanho da matriz quadrada
        int num;
        //Matriz "tab" tem como objetivo receber o valor "*" caso a condição for verdadeira
        String [][]tab;

        /*A variável "ler" tem como objetivo receber um valor através de uma entrada
            e atribuir esse valor a variável "num".
        * */
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o tamanho da escada: ");
        num = ler.nextInt();
        //Definição do tamanho da matriz com a variável "num"
        tab = new String[num][num];

        //Conjunto de laço de repetição com a funcionalidade a percorrer os valores da matriz "tab"
        for(int l = 0; l< num; l++){
            for(int c = 0; c < num; c++){
               if(c+l>=num-1){
                    tab[l][c] = "*";/* Se a "c+1" for maior a "num-1" é atribuido o valor "*" */
                }else{
                    tab[l][c] = " ";/* Se a "c+1" for menor a "num-1" é atribuido o valor " " */
                }
            }

        }

        imprimirEscada(tab);
    }
    /*Função "imprimirEscada" recebe como parâmetro uma matriz do tipo String
      e devolve a impressão do formato solicitado pela questão*/
    public static void imprimirEscada(String [] [] matriz){
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j< matriz[0].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
