package main.java.lib;

import java.util.Scanner;

public class ExerciciosFor {
    public static void calcPrintMedia() {
    Scanner scanner = new Scanner(System.in);
    double somaDasNotas = 0;

    System.out.println("Digite as notas dos 5 alunos:");

    for (int i = 1; i <= 5; i++) {
        System.out.print("Nota do aluno " + i + ": ");
        double nota = scanner.nextDouble();
        somaDasNotas += nota;
    }

    scanner.close();

    double media = somaDasNotas / 5;

    System.out.println("Média das notas dos alunos: " + media);
}

public static void calcPrintMedia80() {
    Scanner scanner = new Scanner(System.in);
    double somaDasNotas = 0;
    int countNotasMaioresOuIguaisOitenta = 0;

    System.out.println("Digite as notas dos 5 alunos:");

    for (int i = 1; i <= 5; i++) {
        System.out.print("Nota do aluno " + i + ": ");
        double nota = scanner.nextDouble();
        
        if (nota >= 80) {
            somaDasNotas += nota;
            countNotasMaioresOuIguaisOitenta++;
        }
    }

    scanner.close();

    if (countNotasMaioresOuIguaisOitenta > 0) {
        double media = somaDasNotas / countNotasMaioresOuIguaisOitenta;
        System.out.println("Média das notas maiores ou iguais a oitenta: " + media);
    } else {
        System.out.println("Nenhuma nota maior ou igual a oitenta foi informada.");
    }
}
}
