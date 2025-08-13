package Teorico.Lista1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao7p2 {
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

    public static String descriptografa(String criptografada) {
        String[] colunas = criptografada.split("\\*");
        int linhas = colunas[0].length();
        int qtdColunas = colunas.length;

        char[][] matriz = new char[linhas][qtdColunas];

        for (int j = 0; j < qtdColunas; j++) {
            for (int i = 0; i < linhas; i++) {
                matriz[i][j] = colunas[j].charAt(i);
            }
        }

        StringBuilder original = new StringBuilder();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < qtdColunas; j++) {
                original.append(matriz[i][j]);
            }
        }

        return original.toString().trim();
    }

    public static void main(String[] args) {
        String caminhoArquivo = "entrada_q5.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            int repeticoes = Integer.parseInt(br.readLine());

            for (int i = 0; i < repeticoes; i++) {
                String mensagemOriginal = br.readLine();
                String mensagemCriptografada = criptografa(mensagemOriginal);
                String mensagemDescriptografada = descriptografa(mensagemCriptografada);

                System.out.println("Original: " + mensagemOriginal);
                System.out.println("Criptografada: " + mensagemCriptografada);
                System.out.println("Descriptografada: " + mensagemDescriptografada);
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}