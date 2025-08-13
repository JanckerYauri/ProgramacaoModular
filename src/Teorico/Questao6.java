package Teorico;

import java.util.Scanner;

public class Questao6 {
    public static void verificarDia(int dia) {
        if (dia < 0 || dia > 31) {
            System.out.println("Valor do dia inválido");
        }

    }

    public static void verificarMes(int mes) {
        if (mes < 0 || mes > 12) {
            System.out.println("Valor do mês é inválido");
        }
    }

    public static void verificarAno(int ano) {
        if (ano < 0) {
            System.out.println("Valor do ano é inválido");
        }

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma data no formato DD/MM/YYYY.");

        String data = s.nextLine();

        String[] partes = data.split("/");

        verificarDia(Integer.parseInt(partes[0]));
        verificarMes(Integer.parseInt(partes[1]));
        verificarAno(Integer.parseInt(partes[2]));
    }
}
