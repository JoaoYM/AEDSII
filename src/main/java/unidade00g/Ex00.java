package main.java.unidade00g;

//Classes Exercicios
import main.java.lib.ExerciciosArraysMatrizes;
import main.java.lib.ExerciciosIfElse;
import main.java.lib.ExerciciosWhile;
import main.java.lib.ExerciciosString;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex00 {
    public static void main(String[] args){
         // Exemplos de uso dos métodos
        String[] nomes = { "Alice", "Bob", "Charlie", "David", "Eve" };
        double[] notas = { 85, 72, 90, 78, 95 };
        int[] numeros = { 10, 5, 8, 2, 8 };
        int[] numeros2 = { 7, 3, 6, 1, 9 };


        // Chamar os métodos conforme a necessidade
        ExerciciosArraysMatrizes.acimaMedia(nomes, notas);
        ExerciciosArraysMatrizes.mostrarNums(numeros);
        ExerciciosArraysMatrizes.maioresMedia(numeros);
        ExerciciosArraysMatrizes.somaTermos(20);
        System.out.println("Maior elemento: " + ExerciciosArraysMatrizes.encontrarMaior(numeros));
        ExerciciosArraysMatrizes.maiorEMenor(numeros);
        ExerciciosArraysMatrizes.elementosIntercalados(numeros, numeros2);
        ExerciciosArraysMatrizes.minEMaxArray(numeros);
        ExerciciosArraysMatrizes.ordenarArray(numeros);
        ExerciciosArraysMatrizes.uniaoInter(numeros, numeros2);
        ExerciciosArraysMatrizes.mostrarVetor(numeros);
        ExerciciosArraysMatrizes.somaMedMenor(notas);
        ExerciciosArraysMatrizes.numsMaiorMed(numeros);
        ExerciciosArraysMatrizes.somaCondicao(50);

        // Exemplos para matrizes
        int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matriz2 = { { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 } };

        ExerciciosArraysMatrizes.intcldMatriz(matriz1, matriz2);
        System.out.println("Média da matriz: " + ExerciciosArraysMatrizes.mediaMatriz(matriz1));
        ExerciciosArraysMatrizes.mediaLinhas(matriz2);
        ExerciciosArraysMatrizes.mediaColunas(matriz2);
        
        
        // Exemplos While 
        ExerciciosWhile.defineParamNota();
        ExerciciosWhile.paramNesimoTerm();
        ExerciciosWhile.printN_Impares(5);
        ExerciciosWhile.printN_Sequencia(6);
        ExerciciosWhile.printPositivos_10();
        ExerciciosWhile.procNotasAlunos(100);
        ExerciciosWhile.selectN_Impares();
        ExerciciosWhile.selectNumSeq();

        //Exemplos String
        ExerciciosString.apenasDigitos("125456Quantidade");
        ExerciciosString.contarCaractere("abacate", 'a');
        ExerciciosString.converterParaInteiro("Abacate");
        ExerciciosString.countCharEType("Bela");
        ExerciciosString.countCharMaiusculas("Felicia Santos");
        ExerciciosString.primeiraOcorrenciaA("Banana");
        ExerciciosString.verificarPalindromo("Natan");


        // Exemplo01
        ExemploEscrever1.Escrever();

        ExerciciosIfElse.notaAluno();
        ExerciciosIfElse.getWinner();
        ExerciciosIfElse.maxValue();
        ExerciciosIfElse.minMax();
        ExerciciosIfElse.minMaxFrom10();
        ExerciciosIfElse.raizCubxLog();
        ExerciciosIfElse.sumCase();
        ExerciciosIfElse.tipoTriangulo();
        ExerciciosIfElse.validCredit();

        // Exemplo02
        try{
            ExemploBufferedReader.Buffer_ReadPrint();
        }catch(Exception e){
            System.out.println("Criaçao do objeto nao foi efetivada.");
        }

        // Exemplo03
        ExemploScanner.ScannerRead();
    }

    /*
        • Execute o compilador java para criar os bytecodes (arquivo ExemploEscrever1.class)
        • Execute o interpretador java e veja a mensagem “Alo Pessoal!!!” na tela
     */
    public class ExemploEscrever1 {
            public static void Escrever(){
            System.out.println("Alo pessoal!!!");
            }
    }


public class ExemploScanner {
    public static void ScannerRead() {
        // Criação de um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Leitura de uma String
        System.out.print("Digite uma String: ");
        String inputString = scanner.nextLine();

        // Leitura de um caractere (primeiro caractere da entrada)
        System.out.print("Digite um caractere: ");
        char inputChar = scanner.next().charAt(0);

        // Leitura de um inteiro
        System.out.print("Digite um inteiro: ");
        int inputInt = scanner.nextInt();

        // Leitura de um número real (ponto flutuante)
        System.out.print("Digite um número real: ");
        double inputDouble = scanner.nextDouble();

        // Fechando o objeto Scanner após a leitura
        scanner.close();

        // Imprimindo os valores lidos
        System.out.println("String lida: " + inputString);
        System.out.println("Caractere lido: " + inputChar);
        System.out.println("Inteiro lido: " + inputInt);
        System.out.println("Número real lido: " + inputDouble);
    }
}



public class ExemploBufferedReader {
    public static void Buffer_ReadPrint() throws IOException {
        // Criação de um objeto BufferedReader para ler entrada do usuário
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Leitura de uma String
        System.out.print("Digite uma String: ");
        String inputString = br.readLine();

        // Leitura de um caractere (primeiro caractere da entrada)
        System.out.print("Digite um caractere: ");
        char inputChar = (char) br.read();

        // Limpeza do buffer após a leitura do caractere
        br.readLine();

        // Leitura de um inteiro
        System.out.print("Digite um inteiro: ");
        int inputInt = Integer.parseInt(br.readLine());

        // Leitura de um número real (ponto flutuante)
        System.out.print("Digite um número real: ");
        double inputDouble = Double.parseDouble(br.readLine());

        // Fechando o objeto BufferedReader após a leitura
        br.close();

        // Imprimindo os valores lidos
        System.out.println("String lida: " + inputString);
        System.out.println("Caractere lido: " + inputChar);
        System.out.println("Inteiro lido: " + inputInt);
        System.out.println("Número real lido: " + inputDouble);
    }
}

    public class SomarDoisNumero{
        public static void Somar(){
                Scanner sc = new Scanner(System.in);

                //Declaracao de variaveis
                int num1, num2, soma;
                //Leituras
                System.out.println("Digite um número");
                num1 = sc.nextInt();
                System.out.println("Digite outro número");
                num2 = sc.nextInt();
                //Somar
                soma = num1 + num2;
                //Mostrar na tela
                System.out.println("Soma:" + soma); 

                sc.close();
        }         
    }
                
 /*
• Faça o quadro de memória e mostre a saída na tela para o código abaixo 


    int num = 0;
    while (num < 4){
        System.out.println(num++);
        num += 2;
    }



 Quadro de Memória:

int num = 0; - Variável num é inicializada com o valor 0.

Iteração 1:

    Condição num < 4 é verdadeira (0 < 4).
    System.out.println(num++); - Imprime 0 e, em seguida, incrementa num para 1.
    num += 2; - num é atualizado para 3.

Iteração 2:

    Condição num < 4 é verdadeira (3 < 4).
    System.out.println(num++); - Imprime 3 e, em seguida, incrementa num para 4.
    num += 2; - num é atualizado para 6.

Iteração 3:

    Condição num < 4 é falsa (6 não é menor que 4).

     -_________________________________
     |        Quadro de Memoria        | 
     | num 0 1 3 4 6                   |
     |_________________________________|     
 */               
                
 
 // Métodos While   

 
/*

    • Como imprimir os 3 primeiros números a partir do 1?

        for ( int i = 1 ; i <= 3 ; i++ ){
        System.out.println(i);
        }

        **Quadro de Memória:**

        1. **Inicialização:**
        - 'int i = 1;' - A variável 'i' é inicializada com o valor 1.

        2. **Loop Iteração 1:**
        - Condição 'i <= 3' é verdadeira (1 <= 3).
        - 'System.out.println(i);' - Imprime o valor de 'i', que é 1.
        - 'i++' - Incrementa 'i' para 2.

        3. **Loop Iteração 2:**
        - Condição 'i <= 3' é verdadeira (2 <= 3).
        - 'System.out.println(i);' - Imprime o valor de 'i', que é 2.
        - 'i++' - Incrementa 'i' para 3.

        4. **Loop Iteração 3:**
        - Condição 'i <= 3' é verdadeira (3 <= 3).
        - 'System.out.println(i);' - Imprime o valor de 'i', que é 3.
        - 'i++' - Incrementa 'i' para 4.

        5. **Loop Iteração 4:**
        - Condição 'i <= 3' é falsa (4 não é menor ou igual a 3).

        **Saída na Tela:**
        '''
        1
        2
        3
        '''

        O loop 'for' executa três iterações, com 'i' assumindo os valores 1, 2 e 3 em cada iteração. A saída na tela será a lista dos três primeiros números inteiros a partir de 1. 


      

     -_______________________________
     | ______Quadro de Memoria_______| 
     | i | 1 2 3 4                   |
     |___|___________________________|   


*/

// • Como criamos n variáveis (n é lido do teclado)?
// R: n pode ou não ser lido do teclado, porém com o recurso do array podemos definir n valores sem a necessidade de ler um por um do teclado ou inicializar multiplas variaveis.


}



        

    