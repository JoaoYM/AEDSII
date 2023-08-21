package main.java.unidade00h;


public class Ex00 {
    public static void main(String[] args){
       int valor = fibonacci(4);
       System.out.println(valor);

       int valor2 = fatorial(5);
       System.out.println(valor2);


       
        multiplicacaoSomas(4, 5);
        multiplicacaoSomasAux(4, 5, 5);

        int[] array = {5,9,8,1,2,6,7}; // O seu array de inteiros
        maiorElementoArray(array, array.length);
        maiorElementoArrayAux(array, array.length, 0);

        String str = "Natan"; // A sua string
        isPalindromo(str);
        isPalindromoAux(str, 0);

        contarVogais(str);
        contarVogaisAux(str, 0);
    }

    public static int fibonacci (int n){
        int resp;
       if (n == 0 || n == 1){
       resp = 1;
       } else {
       resp = fibonacci(n - 1) + fibonacci(n - 2);
       }
       return resp;
    }

    public static int fatorial (int n){
        int resp;
      if (n == 1){
        resp = 1;
      } else {
                resp = n * fatorial(n - 1);
      }
      return resp;
    }  




 

/*
 Era uma vez dois gatinhos: o grapete e o repete. O grapete morreu, quem ficou?

 Estória

Recursividade
• Definição: Um método é dito recursivo quando ele faz chamada a si próprio
• Um método recursivo normalmente apresenta duas características básicas:
• Chamada recursiva
• Condição de parada
• Qual é a condição de parada da nossa estória?

R: Enquanto a condição "Repete" for true a frase será repetida indefinidamente.

*/

//• Identifique as chamadas recursivas e condições de parada

/*

int fat (int n){
    int resp;
 if (n == 1){  // Condição de parada
    resp = 1;
 }else {
    resp = n * fat (n - 1); // Chamadas Recursivas
  }
    return resp;
}


int fib (int n){
    int resp;
 if (n == 0 || n == 1){ // Condições de parada
    resp = 1;
 } else {
    resp = fib (n - 1) + fib(n - 2); // Chamadas Recursivas
   }
    return resp;
}

• Faça métodos ITERATIVO e RECURSIVO para mostrar os números 0 à 3

 void mostrar (){
    for (int i = 0; i < 4; i = i + 1) {
        System.out.println(i);
    }
 }

 void mostrar () { 
    mostrar (0);
 }
 
 void mostrar (int i){
    if (i < 4) {
      System.out.println(i);
      mostrar (i + 1);
    }
 }

• Por que o código abaixo imprime 2, 1, 0, 0, 1 e 2?
 void printRecursivo(){
    printRecursivo(2);
 }

 void printRecursivo(int i){
   System.out.println(i);
   if (i > 0){
    printRecursivo(i - 1);
   }
    System.out.println(i);
 }

 R: Isso acontece em razão das outras instâncias de execução criadas ao se fazer a chamada recursiva do método printRecursivo(int i)
que ao final de sua execução executa a impressão na tela utilizando o respectivo println que o sucede. 


• O que o programa iterativo abaixo mostra na tela?

void primeiro(){
    System.out.println(“1o – inicio”);
    segundo();
    System.out.println(“1o – fim”);
}
 void segundo(){
    System.out.println(“2o – inicio e fim”);
 }
 void main (){
    System.out.println(“main – inicio”);
    primeiro();
    System.out.println(“main – fim”);
 }


R:
 ________________________
|________ TELA __________|
|    main  – início      | 
|    1º    – início      |
|    2º    – início e fim|
|    1º    – fim         |
|    main  – fim         |
--------------------------


• Definição do fatorial é recursiva:
    Fat(1) = 1
    Fat(n) = n * Fat(n – 1)
• Qual é o valor do fatorial de 5?

Fat(5) = 5 * Fat(4)


int fatorial (int n){
 int resp;
    if (n == 1){
        resp = 1;
    } else {
                resp = n * fatorial(n - 1);
      }
        return resp;
}

void main(){
                int valor = fatorial(5);
                System.out.println(valor);
}

R: 
    fatorial (5) = 120

• Definição do fatorial é recursiva:
    Fib(0) = 1
    Fib(1) = 1
    Fib(n) = Fib(n-1) + Fib(n-2)
•Qual é o Fibonacci de 4?
    Fibonacci(4)

    int fibonacci (int n){
        int resp;
            if (n == 0 || n == 1){
                resp = 1;
            } else {
                        resp = fibonacci(n - 1) + fibonacci(n - 2);
              }
                return resp;
    }

    void main(){
                    int valor = fibonacci(4);
                    System.out.println(valor);
    }

    R:  
            5


    • Por que na prática é importante manter um nível “limitado” de chamadas recursivas?

    R: Evitar um uso excessivo de memória e recursos, o que poderia até mesmo acarretar a finalização prematura do programa.



*/

public static int multiplicacaoSomas(int a, int b) {
    if (b == 0) {
        return 0;
    }
    return a + multiplicacaoSomas(a, b - 1);
}


public static int multiplicacaoSomasAux(int a, int b, int i) {
    if (i == b) {
        return 0;
    }
    return a + multiplicacaoSomasAux(a, b, i + 1);
}

public static int maiorElementoArray(int[] vet, int n) {
    return maiorElementoArrayAux(vet, n, 0);
}

public static int maiorElementoArrayAux(int[] vet, int n, int i) {
    if (i == n - 1) {
        return vet[i];
    }
    int resp = maiorElementoArrayAux(vet, n, i + 1);
    return (resp > vet[i]) ? resp : vet[i];
}

public static boolean isPalindromo(String s) {
    return isPalindromoAux(s, 0);
}

public static boolean isPalindromoAux(String s, int i) {
    if (i >= s.length() / 2) {
        return true;
    }
    if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        return false;
    }
    return isPalindromoAux(s, i + 1);
}

public static int contarVogais(String s) {
    return contarVogaisAux(s, 0);
}

public static int contarVogaisAux(String s, int i) {
    if (i >= s.length()) {
        return 0;
    }
    char c = Character.toUpperCase(s.charAt(i));
    int count = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') ? 1 : 0;
    return count + contarVogaisAux(s, i + 1);
}


}
