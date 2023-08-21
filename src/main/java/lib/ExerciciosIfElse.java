package main.java.lib;

import java.util.Scanner;

public class ExerciciosIfElse {
    /*
        • Faça um programa que leia a nota de um aluno e escreva na tela: 
        “Parabéns, muito bom” (se a nota >= 80); “Parabéns, aprovado” (se a 
        nota >= 70 && nota < 80); e, caso contrário, “Infelizmente, reprovado”
     */

     public static void notaAluno(){
        Scanner scan = new Scanner(System.in);
        int nota = 0;
        System.out.printf("Digite a nota do aluno: \t");
        nota = scan.nextInt();

        // Nota maior ou igual a 80
        if (nota >= 80){
            System.out.println("Parabens, muito bom.");
        }else if( nota >= 70 && nota < 80){  // Nota superior ou igual a 70 e inferior a 80
            System.out.println("Parabens, aprovado.");
        }else{ // Nota abaixo da media
            System.out.println("Infelizmente, reprovado."); 
        } 

        scan.close();
     }


        public static void tipoTriangulo(){
            double lado1 = 5.0;
            double lado2 = 5.0;
            double lado3 = 6.0;
    
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        }

       
            public static void minMax() {
                int num1 = 7;
                int num2 = 15;
                int num3 = 3;
        
                int maior = Math.max(Math.max(num1, num2), num3);
                int menor = Math.min(Math.min(num1, num2), num3);
        
                System.out.println("Maior valor: " + maior);
                System.out.println("Menor valor: " + menor);
            }


           
            public static void maxValue(){
                int[] numeros = {10, 23, 7, 45, 12, 30, 50, 18, 6, 35};
        
                int maior = numeros[0];
                for (int i = 1; i < numeros.length; i++) {
                    if (numeros[i] > maior) {
                        maior = numeros[i];
                    }
                }
        
                System.out.println("Maior valor: " + maior);
            }

            
            public static void sumCase(){
                double num1 = 50;
                double num2 = 15;
        
                if (num1 > 45) {
                    System.out.println("Soma: " + (num1 + num2));
                } else if (num1 > 20 && num2 > 20) {
                    System.out.println("Subtração: " + (Math.max(num1, num2) - Math.min(num1, num2)));
                } else if (num1 < 10 && num2 != 0) {
                    System.out.println("Divisão: " + (num1 / num2));
                } else {
                    System.out.println("Nome: Seu Nome Aqui");
                }
            }
            
        
            public static void getWinner(){
                int golsMandante = 3;
                int golsVisitante = 2;
        
                if (golsMandante > golsVisitante) {
                    System.out.println("Vencedor: Mandante");
                } else if (golsMandante < golsVisitante) {
                    System.out.println("Vencedor: Visitante");
                } else {
                    System.out.println("Empate");
                }
            }

                public static void validCredit(){
                    double salarioBruto = 5000.0;
                    double prestacao = 1800.0;
                    double limitePrestacao = salarioBruto * 0.4;
            
                    if (prestacao <= limitePrestacao) {
                        System.out.println("Empréstimo concedido");
                    } else {
                        System.out.println("Empréstimo não concedido");
                    }
                }

           
                public static void raizCubxLog(){
                    double num1 = 8.0;
                    double num2 = 27.0;
            
                    double raizCubicaMenor = Math.cbrt(Math.min(num1, num2));
                    double logMenorNaBaseMaior = Math.log(Math.min(num1, num2)) / Math.log(Math.max(num1, num2));
            
                    System.out.println("Raiz cúbica do menor: " + raizCubicaMenor);
                    System.out.println("Logaritmo do menor na base do maior: " + logMenorNaBaseMaior);
                }

               
                public static void minMaxFrom10(){
                    int[] numeros = {23, 7, 15, 35, 9, 12, 50, 18, 6, 30};
            
                    int maior = numeros[0];
                    int menor = numeros[0];
            
                    for (int i = 1; i < numeros.length; i++) {
                        if (numeros[i] > maior) {
                            maior = numeros[i];
                        }
                        if (numeros[i] < menor) {
                            menor = numeros[i];
                        }
                    }
            
                    System.out.println("Maior valor: " + maior);
                    System.out.println("Menor valor: " + menor);
                }
}
