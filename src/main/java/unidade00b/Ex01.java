package main.java.unidade00b;

/*
       Algoritmos e Estruturas de Dados II (2)
   Exercícios Iniciais
       • Faça um método que receba um array de inteiros e mostre na 
   tela o maior e o menor elementos do array.
       • Repita o exercício acima fazendo menos comparações com 
   os elementos do array
*/

public class Ex01 extends Valid {
    public static void main(String[] args) {
        int[] y = { 1, 2, 3, 4, 5, 6 };
        int param = 2; // 1 para utilizar o for para pesquisar no Array, 2 para utilizar a pesquisa
                       // binária.

        findMinMax(y, param);

    }

    public static boolean findMinMax(int[] array, int param) {
        int min, max;

        if (!IsNull(array)) {
            return false;
        }

        if (param == 1) {
            min = array[0];
            max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
            }

            System.out.println("O menor elemento é: " + min);
            System.out.println("O maior elemento é: " + max);
        } else {
            if (IsPar(array.length)) {
                if (array[0] < array[1]) {
                    min = array[0];
                    max = array[1];
                } else {
                    min = array[1];
                    max = array[0];
                }
                for (int i = 2; i < array.length; i += 2) {
                    if (array[i] < array[i + 1]) {
                        min = Math.min(min, array[i]);
                        max = Math.max(max, array[i + 1]);
                    } else {
                        min = Math.min(min, array[i + 1]);
                        max = Math.max(max, array[i]);
                    }
                }
            }else{
                    min = array[0];
                    max = array[0];
                for (int i = 1; i < array.length; i += 2) {
                    if (i == array.length - 1) {
                        min = Math.min(min, array[i]);
                        max = Math.max(max, array[i]);
                    }else {
                        if (array[i] < array[i + 1]) {
                            min = Math.min(min, array[i]);
                            max = Math.max(max, array[i + 1]);
                        }else {
                            min = Math.min(min, array[i + 1]);
                            max = Math.max(max, array[i]);
                        }
                     }
                }
             }

            System.out.println("O menor elemento é: " + min);
            System.out.println("O maior elemento é: " + max);
        }
        return true;
    }

}
