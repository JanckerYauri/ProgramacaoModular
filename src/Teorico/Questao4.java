package Teorico;

import java.util.Scanner;

public class Questao4 {
    public static String criptografa(String mensagem) {
        int colunas = 5;
        int linhas = (int) Math.ceil((double) mensagem.length() / colunas);

        char[][] matriz = new char[linhas][colunas];

        int index = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (index < mensagem.length()) {
                    matriz[i][j] = mensagem.charAt(index++);
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        StringBuilder criptografada = new StringBuilder();
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                criptografada.append(matriz[i][j]);
            }
            if (j < colunas - 1) {
                criptografada.append("*");
            }
        }
        return criptografada.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a mensagem que deseja criptografar:");
        String mensagem = s.nextLine();

        String criptografada = criptografa(mensagem);
        System.out.println("Mensagem criptografada: " + criptografada);
    }
}
