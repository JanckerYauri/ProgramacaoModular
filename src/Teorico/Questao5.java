package Teorico;

import java.util.Scanner;

public class Questao5 {

    public static String criptografa(String mensagem) {
        int colunas = 5;
        int linhas = (int) Math.ceil((double) mensagem.length() / colunas);

        // Matriz para armazenar os caracteres
        char[][] matriz = new char[linhas][colunas];

        // Preenche a matriz linha a linha
        int index = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (index < mensagem.length()) {
                    matriz[i][j] = mensagem.charAt(index++);
                } else {
                    matriz[i][j] = ' '; // Preenche com espaço se faltar caractere
                }
            }
        }

        // Lê coluna por coluna e monta string criptografada
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

    public static String descriptografa(String criptografada) {
        String[] colunas = criptografada.split("\\*");
        int linhas = colunas[0].length();
        int qtdColunas = colunas.length;

        char[][] matriz = new char[linhas][qtdColunas];

        // Preenche matriz lendo cada coluna
        for (int j = 0; j < qtdColunas; j++) {
            for (int i = 0; i < linhas; i++) {
                matriz[i][j] = colunas[j].charAt(i);
            }
        }

        // Lê linha por linha para reconstruir mensagem original
        StringBuilder original = new StringBuilder();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < qtdColunas; j++) {
                original.append(matriz[i][j]);
            }
        }

        return original.toString().trim(); // Remove espaços no final
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a mensagem que deseja criptografar:");
        String mensagem = s.nextLine();

        String criptografada = criptografa(mensagem);
        System.out.println("Mensagem criptografada: " + criptografada);

        System.out.println("\nDigite a mensagem criptografada para descriptografar:");
        String entradaCripto = s.nextLine();

        String original = descriptografa(entradaCripto);
        System.out.println("Mensagem original: " + original);

        s.close();
    }
}
