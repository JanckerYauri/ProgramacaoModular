package Teorico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao3 {
    public static double avaliaExercicios(Scanner s, double[] exercicios) {
        double nota = 0;
        System.out.println("Digite a nota dos exercícios. (max: 10 pts)");

        for (int i = 0; i < exercicios.length; i++) {
            nota += s.nextDouble();
        }

        nota = (nota / 4) * 0.20;

        return nota;
    }

    public static double avaliaProvas(Scanner s, double[] provas) {
        double nota = 0;
        System.out.println("Digite a nota das provas. (max: 100 pts)");

        for (int i = 0; i < provas.length; i++) {
            nota += s.nextDouble();
        }

        nota = (nota / 2) * 0.60;

        return nota;
    }

    public static double avaliaTrabalho(Scanner s, double trabalhopratico) {
        System.out.println("Digite a nota do trabalho prático. (max: 20 pts)");
        trabalhopratico = s.nextDouble();

        return trabalhopratico;
    }

    public static void notaFinal(double notafinal) {
        System.out.println("A nota final é: " + notafinal + " em 100 pontos");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");

        double[] exercicios = new double[4];
        double[] provas = new double[2];
        double trabalhopratico = 0;
        double notafinal = 0;

        notafinal += avaliaExercicios(s, exercicios);
        notafinal += avaliaProvas(s, provas);
        notafinal += avaliaTrabalho(s, trabalhopratico);
        notaFinal(notafinal);

    }
}
