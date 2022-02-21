/*

Autor: Ygor Pires

O site considera uma senha forte quando ela satisfaz os seguintes critérios:
-Possui no mínimo 6 caracteres.
-Contém no mínimo 1 digito.
-Contém no mínimo 1 letra em minúsculo.
-Contém no mínimo 1 letra em maiúsculo.
-Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

 Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados
 para uma string qualquer ser considerada segura.
* */

import java.util.Scanner;
public class Questao02 {

    public static int qtdMaiuscula = 0; //Esta variável informa a quantidade de caracteres Maiusculos no texto informado
    public static int qtdMinuscula = 0; //Esta variável informa a quantidade de caracteres Minusculos no texto informado
    public static int qtdNumero = 0; //Esta variável informa a quantidade de caracteres Números no texto informado
    public static int qtdCaracteres = 0; //Esta variável informa a quantidade de Caracteres Especiais no texto informado
    public static String senha; // Senha digitada pelo usuário



    public static void main(String[] args) {

        digitarSenha();

    }

    /**
     *Ler uma valor de entrada e atribuir esse valor a variavél senha,
     * após essa leitura faz a chamada da função verificarSenha e
     * imprimirSenha.
     */
    public static void digitarSenha(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe uma senha segura: ");
        senha = ler.next();
        verificarSenha(senha);
        imprimirSenha(senha);
    }

    /**
     * Esta função percorre todos os caracteres e verifica se existe Letras maiusca,
     * miusculas, números e caracteres especiais
     * @param senha um String Objeto
     * */
    public static void verificarSenha(String senha){
        for(int i = 0; i < senha.length();i++){

            char letra = senha.charAt(i);

            if(Character.isDigit(letra)){
                qtdNumero++;
            }else if(Character.isUpperCase(letra)){
                qtdMaiuscula++;
            }else if(Character.isLowerCase(letra)){
                qtdMinuscula++;
            }else if((!Character.isLetter(letra))||(!Character.isDigit(letra))){
                qtdCaracteres++;
            }

        }

    }
    /**
     * Função verifica se as variáveis qtdMaiuscula, qtdMinuscula, qtdNumero, qtdCaracteres são igual a zero
     * verifica se o tamanho da senha digitada é menor que seis caracteres
     * imprimi um aviso caso for menor que 6 ou não atente o padrão de segurança
     * @param senha um objeto String
     * */
    public static void imprimirSenha(String senha){
       if(senha.length() < 6){
           int restante = 6-senha.length();
           System.out.println("ATENÇÃO - Faltam " +restante+ " caracteres para completar o valor padrao da senha! ");
           System.out.println("Favor digitar novamente a senha no campo abaixo.");
           digitarSenha();
       }else if((qtdMaiuscula==0)||(qtdMinuscula==0)||(qtdNumero==0)||(qtdCaracteres==0)){
           System.out.println("--------------------------ATENÇÃO-----------------------------------");
           System.out.println("A senha informada não corresponde com o padrão de segurança exigido na lista abaixo:");
           System.out.println("Possui no mínimo 6 caracteres.");
           System.out.println("Contém no mínimo 1 digito.");
           System.out.println("Contém no mínimo 1 letra em minúsculo.");
           System.out.println("Contém no mínimo 1 letra em maiúsculo.");
           System.out.println("Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\n");
           System.out.println("---------------------------------------------------------------------");
           System.out.println("Favor digitar novamente a senha no campo abaixo.");
           digitarSenha();
       }else{
           System.out.println("A senha "+senha+" gravada com sucesso!");
       }

    }
}
