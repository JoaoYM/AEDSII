package main.java.lib;

import java.util.Arrays;

public class ExerciciosArraysMatrizes {
    // Exercício 1: Alunos acima da Média
    public static void acimaMedia(String[] nomes, double[] notas) {
        double somaDasNotas = 0;
        int n = nomes.length;

        for (double nota : notas) {
            somaDasNotas += nota;
        }

        double media = somaDasNotas / n;

        System.out.println("Alunos acima da média:");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println(nomes[i]);
            }
        }
    }

    // Exercício 2: Mostrar Números de um Array
    public static void mostrarNums(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    // Exercício 3: Mostrar Números Maiores que a Média
    public static void maioresMedia(int[] array) {
        double media = calcularMedia(array);

        System.out.println("Números maiores que a média:");
        for (int num : array) {
            if (num > media) {
                System.out.println(num);
            }
        }
    }

    // Exercício 4: Soma de Termos
    public static void somaTermos(int n) {
        int soma = 0;
        for (int i = 0; 2 * i + 1 < n; i++) {
            soma += n + (2 * i + 1);
        }
        System.out.println("Soma dos termos: " + soma);
    }

    // Exercício 5: Maior Elemento de um Array
    public static int encontrarMaior(int[] array) {
        int maior = array[0];
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    // Exercício 6: Maior e Menor Elemento de um Array
    public static void maiorEMenor(int[] array) {
        int maior = array[0];
        int menor = array[0];
        for (int num : array) {
            if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        }
        System.out.println("Maior: " + maior + "\nMenor: " + menor);
    }

    // Exercício 7: Elementos Intercalados de Dois Arrays
    public static void elementosIntercalados(int[] array1, int[] array2) {
        int tam1 = array1.length;
        int tam2 = array2.length;
        int tamMaior = Math.max(tam1, tam2);

        for (int i = 0; i < tamMaior; i++) {
            if (i < tam1) {
                System.out.println(array1[i]);
            }
            if (i < tam2) {
                System.out.println(array2[i]);
            }
        }
    }

    // Exercício 8: Encontrar Maior e Menor Elemento de um Array
    public static void minEMaxArray(int[] array) {
        int maior = array[0];
        int menor = array[0];
        int posicaoMenor = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            } else if (array[i] < menor) {
                menor = array[i];
                posicaoMenor = i;
            }
        }
        System.out.println("Maior: " + maior + "\nMenor: " + menor);
        System.out.println("Posição do Menor Elemento: " + posicaoMenor);
    }

    // Exercício 9: Ordenar Array
    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
    }

    // Exercício 10: União e Intercessão de Arrays
    public static void uniaoInter(int[] array1, int[] array2) {
        int[] uniao = new int[array1.length + array2.length];
        int[] intercessao = new int[Math.min(array1.length, array2.length)];

        int tamUniao = 0;
        int tamIntercessao = 0;

        for (int num : array1) {
            uniao[tamUniao++] = num;
            for (int num2 : array2) {
                if (num == num2) {
                    intercessao[tamIntercessao++] = num;
                    break;
                }
            }
        }

        for (int num : array2) {
            boolean encontrado = false;
            for (int numInter : intercessao) {
                if (num == numInter) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                uniao[tamUniao++] = num;
            }
        }

        System.out.println("União: " + Arrays.toString(uniao));
        System.out.println("Intercessão: " + Arrays.toString(intercessao));
    }

    // Exercício 11: Mostrar Elementos de um Vetor
    public static void mostrarVetor(int[] vetor) {
        System.out.println("Elementos do vetor:");
        for (int num : vetor) {
            System.out.println(num);
        }
    }

    // Exercício 12: Soma, Média e Menor Nota de Alunos
    public static void somaMedMenor(double[] notas) {
        double soma = 0;
        double menor = notas[0];

        for (double nota : notas) {
            soma += nota;
            if (nota < menor) {
                menor = nota;
            }
        }

        double media = soma / notas.length;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
        System.out.println("Menor nota: " + menor);
    }

    // Exercício 13: Números Maiores que a Média
    public static void numsMaiorMed(int[] numeros) {
        double media = calcularMedia(numeros);

        System.out.println("Números maiores que a média:");
        for (int num : numeros) {
            if (num > media) {
                System.out.println(num);
            }
        }
    }

    // Exercício 14: Soma de Elementos até Condição
    public static void somaCondicao(int n) {
        int soma = 0;
        int i = 1;
        while (2 * i + 1 < n) {
            soma += i + (2 * i + 1);
            i++;
        }
        System.out.println("Soma até condição: " + soma);
    }

    // Exercício 15: Elementos Intercalados de Matrizes
    public static void intcldMatriz(int[][] matriz1, int[][] matriz2) {
        int numLinhas = Math.max(matriz1.length, matriz2.length);

        for (int i = 0; i < numLinhas; i++) {
            if (i < matriz1.length) {
                System.out.println(Arrays.toString(matriz1[i]));
            }
            if (i < matriz2.length) {
                System.out.println(Arrays.toString(matriz2[i]));
            }
        }
    }

    // Exercício 16: Média de Matriz
    public static double mediaMatriz(int[][] matriz) {
        int soma = 0;
        int numElementos = 0;

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
                numElementos++;
            }
        }

        return (double) soma / numElementos;
    }

    // Exercício 17: Média de Elementos de Linhas de Matriz
    public static void mediaLinhas(int[][] matriz) {
        for (int[] linha : matriz) {
            double mediaLinha = calcularMedia(linha);
            System.out.println("Média da linha: " + mediaLinha);
        }
    }

    // Exercício 18: Média de Elementos de Colunas de Matriz
    public static void mediaColunas(int[][] matriz) {
        int numColunas = matriz[0].length;

        for (int j = 0; j < numColunas; j++) {
            int somaColuna = 0;
            int numElementosColuna = 0;
            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
                numElementosColuna++;
            }
            double mediaColuna = (double) somaColuna / numElementosColuna;
            System.out.println("Média da coluna " + j + ": " + mediaColuna);
        }
    }

    // Métodos auxiliares

    // Método para calcular a média de um array de inteiros
    public static double calcularMedia(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return (double) soma / array.length;
    }

    // Método para calcular a média de um array de doubles
    public static double calcularMedia(double[] array) {
        double soma = 0;
        for (double num : array) {
            soma += num;
        }
        return soma / array.length;
    }

    
    public static void paramCalMedia() {
        int[] numeros = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        double media = calcularMedia(numeros);
        System.out.println("A média dos números é: " + media);
        System.out.println("Números maiores que a média:");

        for (int num : numeros) {
            if (num > media) {
                System.out.println(num);
            }
        }
    }

}
