package main.java.lib;

import java.util.Scanner;

public class ExerciciosWhile{
        public static void printPositivos_10() {
            int num = 1;
            int count = 0;
    
            System.out.println("Os 10 primeiros números inteiros positivos:");
    
            while (count < 10) {
                System.out.println(num);
                num++;
                count++;
            }
        }

     
    public static void selectN_Impares() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        printN_Impares(n);
        scanner.close();
    }

    public static void printN_Impares(int n) {
        int num = 1;
        int count = 0;

        System.out.println("Os " + n + " primeiros números ímpares:");

        while (count < n) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }

  


    public static void selectNumSeq() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        printN_Sequencia(n);
        scanner.close();
    }

    public static void printN_Sequencia(int n) {
        int num = 1;
        int count = 0;

        System.out.println("Os " + n + " primeiros números da sequência:");

        while (count < n) {
            System.out.println(num);
            num += 4 + count;
            count++;
        }
    }   



    public static void defineParamNota() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota máxima em uma prova: ");
        int notaMaxima = scanner.nextInt();
        procNotasAlunos(notaMaxima);
        scanner.close();
    }

    public static void procNotasAlunos(int notaMaxima) {
        Scanner scanner = new Scanner(System.in);
        double totalNotas = 0;
        int numAlunos = 20;
        int numNotasMenorMedia = 0;
        int numAlunosConceitoA = 0;

        for (int i = 1; i <= numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            int notaAluno = scanner.nextInt();
            totalNotas += notaAluno;

            if (notaAluno < 0.6 * notaMaxima) {
                numNotasMenorMedia++;
            }

            if (notaAluno > 0.9 * notaMaxima) {
                numAlunosConceitoA++;
            }
        }

        double mediaTurma = totalNotas / numAlunos;

        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Número de alunos com nota menor que a média da Universidade: " + numNotasMenorMedia);
        System.out.println("Quantidade de alunos com conceito A: " + numAlunosConceitoA);

        scanner.close();
    }


  
    public static void paramNesimoTerm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro n: ");
        int n = scanner.nextInt();
        int resultado = fibonacciNesimoTermo(n);
        System.out.println("O " + n + "-ésimo termo da sequência de Fibonacci é: " + resultado);
        scanner.close();
    }

    public static int fibonacciNesimoTermo(int n) {
        if (n <= 0) {
            return -1; // Valor inválido
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int termoAnterior1 = 1;
        int termoAnterior2 = 1;
        int resultado = 0;

        int count = 3;
        while (count <= n) {
            resultado = termoAnterior1 + termoAnterior2;
            termoAnterior1 = termoAnterior2;
            termoAnterior2 = resultado;
            count++;
        }

        return resultado;
    }

    public static void firstOdds10() {
        int count = 0;  // Contador para controlar a quantidade de números pares encontrados
        int num = 0;    // Número a ser verificado

        System.out.println("Os primeiros 10 números pares são:");

        while (count < 10) {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    
        public static void logaritmoBase10()  {
            System.out.println("Logaritmos na base 10 dos números de 1 a 10:");
    
            for (int num = 1; num <= 10; num++) {
                double logBase10 = Math.log10(num);
    
                System.out.println("Log10(" + num + ") = " + logBase10);
            }
        }
    


    public static void mediaNotasAlunos() {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1;
        double somaDasNotas = 0;

        System.out.println("Digite as notas dos 5 alunos:");

        while (contador <= 5) {
            System.out.print("Nota do aluno " + contador + ": ");
            double nota = scanner.nextDouble();
            somaDasNotas += nota;
            contador++;
        }

        scanner.close();

        double media = somaDasNotas / 5;

        System.out.println("Média das notas dos alunos: " + media);
    }


}