package Teorico;

import java.util.Scanner;

public class Questao2 {

    public static String[][] calculaRetangulo(int altura, int largura, int deslocamento) {
        String[][] retangulo = new String[altura][largura + deslocamento];

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura + deslocamento; j++) {
                if (j < deslocamento) {
                    retangulo[i][j] = " ";
                } else if (i == 0 || i == altura - 1) {
                    retangulo[i][j] = "X";
                } else if (j == deslocamento || j == deslocamento + largura - 1) {
                    retangulo[i][j] = "X";
                } else {
                    retangulo[i][j] = " ";
                }
            }
        }
        return retangulo;
    }

    public static void printaRetangulo(int altura, int largura, int deslocamento, String[][] retangulo) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura + deslocamento; j++) {
                System.out.print(retangulo[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe altura, largura e deslocamento do retângulo: ");
        int altura = s.nextInt();
        int largura = s.nextInt();
        int deslocamento = s.nextInt();

        String[][] retangulo = calculaRetangulo(altura, largura, deslocamento);
        printaRetangulo(altura, largura, deslocamento, retangulo);

        s.close();
    }
}