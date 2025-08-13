package Teorico.Lista1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao7p3 {
    public static void verificarDia(int dia) {
        if (dia <= 0 || dia > 31) {
            System.out.println("Valor do dia inválido");
        }
    }

    public static void verificarMes(int mes) {
        if (mes <= 0 || mes > 12) {
            System.out.println("Valor do mês inválido");
        }
    }

    public static void verificarAno(int ano) {
        if (ano <= 0) {
            System.out.println("Valor do ano inválido");
        }
    }

    public static void main(String[] args) {
        String caminhoArquivo = "entrada_q6.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            int repeticoes = Integer.parseInt(br.readLine());

            for (int i = 0; i < repeticoes; i++) {
                String data = br.readLine();
                String[] partes = data.split("/");

                int dia = Integer.parseInt(partes[0]);
                int mes = Integer.parseInt(partes[1]);
                int ano = Integer.parseInt(partes[2]);

                System.out.println("Validando: " + data);
                verificarDia(dia);
                verificarMes(mes);
                verificarAno(ano);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}