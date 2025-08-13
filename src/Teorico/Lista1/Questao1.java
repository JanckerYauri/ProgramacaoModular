package Teorico.Lista1;

import java.util.Scanner;

public class Questao1 {
    public static void dividirNumeros(Scanner s) {
        int a = s.nextInt();
        int b = s.nextInt();

        if (a != 0 || b != 0) {
            System.out.println("Resultado da divisão: " + (a / b));
        } else {
            System.out.println("Valor inválido inserido.");
        }
    }

    public static void maiorNumero(Scanner s) {
        int maior = 0;

        System.out.println("Digite 3 números:");

        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            numeros[i] = s.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);
    }

    public static int[] armazenarNumeros(Scanner s) {
        System.out.println("Digite a quantidade de números que quer armazenar.");
        int quantidade = s.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }

        System.out.println("Números armazenados com sucesso.");

        return numeros;
    }

    public static void somarNumerosArmazenados(int[] numeros) {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("Soma dos números armazenados: " + soma);
    }

    public static void parImpar(int[] numeros) {
        int par = 0;
        int impar = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = null;

        System.out.println("Escolha uma das opções abaixo.");
        System.out.println("1 - Dividir dois números.");
        System.out.println("2 - Ler 3 números e mostrar qual é o maior deles");
        System.out.println("3 - Ler e armazenar 3 números.");
        System.out.println("4 - Mostrar a soma dos números armazenados");
        System.out.println("5 - Conta quantos dos números armazenados são pares e quantos são ímpares");
        System.out.println("0 - Sair");

        int op = s.nextInt();

        while (op != 0) {

            switch (op) {
                case 1:
                    dividirNumeros(s);
                    break;
                case 2:
                    maiorNumero(s);
                    break;
                case 3:
                    numeros = armazenarNumeros(s);
                    break;
                case 4:
                    if (numeros != null) {
                        somarNumerosArmazenados(numeros);
                    } else {
                        System.out.println("Nenhum número foi armazenado.");
                    }
                    break;
                case 5:
                    if (numeros != null) {
                        parImpar(numeros);
                    } else {
                        System.out.println("Nenhum número foi armazenado.");
                    }
                    break;
                default:
                    System.out.println("opção inválida.");
            }

            op = s.nextInt();
        }
    }
}
