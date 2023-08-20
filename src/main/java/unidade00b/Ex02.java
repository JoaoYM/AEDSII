package main.java.unidade00b;

public class Ex02 {
    public static void main(String[] args){
        if(doidao('Z')){
            System.out.println("E' uma vogal");
        }else{
            System.out.println("Nao e' uma vogal");
        }

       
    }

/* 
// • O que o código abaixo faz?
    ---------------------------
    Exercício

    Algoritmos e Estruturas de Dados II (4)
*/

        //R: O metodo abaixo valida se o parametro char fornecido se refere a uma vogal ou não.
        public static boolean doidao (char c){
            boolean resp= false;
            int v = (int) c;
            if (v == 65 || v == 69 || v == 73 || v == 79 || v == 85 || v == 97 || v == 101 || v ==105 || 
             v == 111 || v == 117){
            resp = true;
            }
            return resp;
        }
/* 
// • O que o código abaixo faz?
    ---------------------------
    Exercício

    Algoritmos e Estruturas de Dados II (5)
*/
    
    // R: Valida se o parametro char informado se refere a uma letra minuscula, caso seja o caso ira' tranforma-lo em maiusculo
    // , caso o parametro em questao ja esteja no formato maiuscula este valo sera apenas retornado, validacao por meio do uso de operador ternario.
    public char toUpper(char c){
        return (c >= 'a' && c <= 'z') ? ((char) (c - 32)) : c ;
    }
    
    // R: Ao utilizar o metodo de conversao para maiuscula 'toUpper' o metodo abaixo reduz o numero de validacoes necessarias para verificar se um char e' vogal
    // ou nao, pois ira tratar apenas char Maiusculas, não tendo a preocupação de discernir as minusculas. 

    public boolean isVogal (char c){
        c = toUpper(c);
        return (c =='A' || c =='E' || c =='I' || c =='O' || c =='U');
    }

    /*
        • Outras opções
        ---------------------------
        Exercício
        Algoritmos e Estruturas de Dados II (6)
    */

        // R: Validar se o parametro char e' uma letra, independentemente se maiuscula ou minuscula
        boolean isLetra (char c){
            return (c >= 'A' && c <='Z' || c >='a' && c <='Z');
        }

        // R: Validar se o parametro char e' uma consoante, independentemente se maiuscula ou minuscula.
        // Utiliza-se o metodo isLetra em conjunto com o isVogal e se o retorno de ambas for true temos a condição && atendida indicando que se trata sim de uma vogal.

        boolean isConsoante (char c){
            return (isLetra(c) == true && isVogal(c) == false); 
        }
 /*
     • Um aluno desenvolveu o código abaixo, corrija-o:
        ---------------------------
        Exercício Resolvido
        Algoritmos e Estruturas de Dados II (7)
 */

 boolean isConsoantev2(String s, int n){
    boolean resp= true;
    if (n!=s.length()){
        if (s.charAt(n)<'0' || s.charAt(n)>'9'){
            if (isVogal(s.charAt(n)) == true){
                     resp= false;
            } else{ 
                     resp=isConsoantev2(s, n + 1);
            }
        } else {
            resp=false;
        }
    }
         return resp;
    }

/* Resposta:
    Acredito que o trecho "if (s.charAt(n)<'0' || s.charAt(n)>'9')" poderia ser substituido pelo método:
	    boolean isLetra (char c){
            return (c >= 'A' && c <='Z' || c >='a' && c <='Z');
        }
    Feita a validação do valor contido no indice cairiamos na condição:
        if (isVogal(s.charAt(n)) == true){
            resp= false;
        }
    Que por sua vez não garante a leitura e consequente validação de toda a String, pois a função isConsoante não é chamada, dando fim a recursividade. 
    Logo, o melhor cenário seria:
 */
boolean isConsoante(String s, int i){
    boolean resp= true;
    if (i < s.length()){
        if (!isConsoante(s.charAt(i))){
             resp = false;
        } else {
             resp = isConsoante(s, i + 1);
        }
    } else {
             resp = true;
      }
            return resp;
}
    //  Algoritmos e Estruturas de Dados II (16)
        
    // R: Sendo o método acima o de melhor entendimento também, a nível de identação e lógica. 
    
/*
Qual é a sua opinião sobre o código REAL abaixo?
---------------------------
Exercício
 Algoritmos e Estruturas de Dados II (17)
Unidade recuperarUnidadeComCodigoDeUCI(Unidade unidadeFilha) {
    Unidade retorno = null;
    if (unidadeFilha.getCodUci() != null && !unidadeFilha.getCodUci().isEmpty()) {
    retorno = unidadeFilha;
    } else {
    retorno = unidadeFilha.getUnidadeSuperior();
    }
    while (retorno == null || retorno.getCodUci() == null || retorno.getCodUci().isEmpty()) {
    retorno = retorno.getUnidadeSuperior();
    }
    return retorno;
}

R: O trecho while (retorno == null || retorno.getCodUci() == null || retorno.getCodUci().isEmpty()) me pareceu redundante
Pois estamos fazendo a mesma validação de retorno null ou empty mesmo que utilizando métodos de classe ou retornos para cada cenário.
    - o nome recuperarUnidadeComCodigoDeUCI e' muito grande e poderia ser simplificado.
    - O trecho: if (unidadeFilha.getCodUci() != null && !unidadeFilha.getCodUci().isEmpty()) {
                    retorno = unidadeFilha;
                } else {
                    retorno = unidadeFilha.getUnidadeSuperior();
                }
      Pareceu-me desnecessario, pois o while ja esta tratando valores invalidos (null e Empty), ou seja, poderia ser removido e substituido por:
                    retorno = unidadeFilha; 
      Pois, se retorno == null || retorno.getCodUci() == null || retorno.getCodUci().isEmpty() seria tratado no while.

*/  

/*
Qual é a diferença entre os dois métodos abaixo?
---------------------------
Exercício
 Algoritmos e Estruturas de Dados II (18)

    
    int m1(int i){
      return i--;
    }
        R: O valor de i e' usado e posteriormente incrementado.

    int m2(int i){
        return --i;
    }
        R: O valor de i e' incrementado e posteriormente usado. 
 */

/*
    
• O que o programa abaixo mostra na tela?
---------------------------
Exercício
    Algoritmos e Estruturas de Dados II (19)
    
    byte b = 0; short s = 0; int i = 0; long l = 0;
    
    while (true){
        b++; s++; i++; l++;
        System.out.println(b + “ ” + s + “ ” + i + “ ” + l);
    }

    R: Os valores incrementados das variaveis b, s, i, l indefinidamente, pois a condição será sempre true.
       A única peculiariade e' cada valor sera incrementado obedecendo a restrição do seu tipo, long vai comportar mais bytes que int, por exemplo.
 */

/*
    • Por que o código abaixo imprime [46 - 11]?
---------------------------
    Exercício Resolvido
    Algoritmos e Estruturas de Dados II (20)
    int x = 23, y = 23;
        x = x << 1;
        y = y >> 1;
    System.out.println(“[” + x + “ - ” + y + “]”);

    R: Isso acontece em razão do carater da operacao que estamos efetuando, sendo ela conhecida como deslocamento de bytes.
    << : Indica o deslocamento 'a esquerda multiplicando o valor por 2 elevado à potência do número de posições deslocadas. Como é feito um deslocamento de 1 posição à esquerda, x agora se torna 46 (23 * 2^1).
    >> : Indica o deslocamento 'a direita dividindo o valor por 2 elevado à potência do número de posições deslocadas. Como é feito um deslocamento de 1 posição à direita, y agora se torna 11 (23 / 2^1).
 */

}
