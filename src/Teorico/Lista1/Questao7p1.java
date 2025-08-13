package Teorico.Lista1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao7p1 {
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
        String caminhoArquivo = "entrada_q4.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            int repeticoes = Integer.parseInt(br.readLine());

            for (int i = 0; i < repeticoes; i++) {
                String mensagem = br.readLine();
                String criptografada = criptografa(mensagem);
                System.out.println("Original: " + mensagem);
                System.out.println("Criptografada: " + criptografada);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}