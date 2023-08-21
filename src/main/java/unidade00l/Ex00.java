package main.java.unidade00l;

import java.lang.Math;


public class Ex00 {
    public static void main(String[] args){

    }

    public static class Retangulo {
    private double base;
    private double altura;

    // Construtor 1: Sem parâmetros (construtor padrão)
    public Retangulo() {
        base = 0.0;
        altura = 0.0;
    }

    // Construtor 2: Com parâmetros para base e altura
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular a área do retângulo
    public double getArea() {
        return base * altura;
    }

    // Método para calcular o perímetro do retângulo
    public double getPerimetro() {
        return 2 * (base + altura);
    }

    // Método para calcular a diagonal do retângulo
    public double getDiagonal() {
        return Math.sqrt(base * base + altura * altura);
    }
}


public class Lixao {
    public static void main(String[] args) {
        // Criação de dois objetos Retangulo
        Retangulo retangulo1 = new Retangulo(5.0, 3.0);
        Retangulo retangulo2 = new Retangulo(7.5, 4.2);

        // Chamar métodos da classe Retangulo e imprimir resultados
        System.out.println("Retangulo 1:");
        System.out.println("Área: " + retangulo1.getArea());
        System.out.println("Perímetro: " + retangulo1.getPerimetro());
        System.out.println("Diagonal: " + retangulo1.getDiagonal());

        System.out.println("\nRetangulo 2:");
        System.out.println("Área: " + retangulo2.getArea());
        System.out.println("Perímetro: " + retangulo2.getPerimetro());
        System.out.println("Diagonal: " + retangulo2.getDiagonal());
    }
}

class Ponto {
    private double x;
    private double y;
    private int id;
    private static int nextID = 0;

    // Construtor 1: Sem parâmetros
    public Ponto() {
        x = 0.0;
        y = 0.0;
        id = nextID;
        nextID++;
    }

    // Construtor 2: Com parâmetros x e y
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
        id = nextID;
        nextID++;
    }

    // Métodos get e set para o atributo x
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Métodos get e set para o atributo y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular a distância entre dois pontos
    public double dist(Ponto outro) {
        double dx = x - outro.getX();
        double dy = y - outro.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método para calcular a distância entre o ponto atual e um ponto com coordenadas específicas
    public double dist(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método estático para calcular a distância entre dois pontos com coordenadas específicas
    public static double dist(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método estático para verificar se três pontos formam um triângulo
    public static boolean isTriangulo(Ponto p1, Ponto p2, Ponto p3) {
        // Lógica para verificar se três pontos formam um triângulo
        // (Você precisa implementar essa lógica)
        return false;
    }

    // Método para calcular a área de um retângulo formado pelo ponto atual e outro ponto
    public double getAreaRetangulo(Ponto outro) {
        double lado1 = Math.abs(x - outro.getX());
        double lado2 = Math.abs(y - outro.getY());
        return lado1 * lado2;
    }

    // Método para obter o ID do ponto
    public int getID() {
        return id;
    }

    // Método estático para obter o próximo ID disponível
    public static int getNextID() {
        return nextID;
    }
}



}




/*
    Seja a classe Lixão abaixo e a Funcionário do exemplo 
anterior, faça o quadro de memória para o código abaixo


class Lixao{
   public static void main(String[] args){
           Funcionario f1;
           f1 = new Funcionario();
           f1 = new Funcionario(5);
  }
}

R: 

    Passo 1: Início da Execução

    Espaço de memória é alocado para o programa.
    A classe Lixao é carregada na memória.
    Passo 2: Declaração de Variáveis

    É alocado espaço na memória para a variável f1 do tipo Funcionario.
    Passo 3: Instanciação do Objeto Funcionario

    É alocado espaço na memória para um novo objeto Funcionario (primeira instanciação).
    O construtor padrão (sem parâmetros) de Funcionario é chamado para inicializar o objeto.
    A referência f1 é atribuída ao objeto Funcionario recém-criado.
    Passo 4: Reatribuição da Variável f1

    A referência f1 é agora apontada para um novo objeto Funcionario (segunda instanciação).
    Dessa vez, o construtor que aceita um parâmetro inteiro é chamado, possivelmente para inicializar algum atributo interno do objeto Funcionario.
    Aqui está um resumo do quadro de memória após cada etapa:

    Antes do Passo 2:

    f1: Não inicializada (null)
    Após o Passo 2:

    f1: Não inicializada (null)
    Após o Passo 3:

    f1: Aponta para um objeto Funcionario recém-criado (construtor padrão chamado)
    Após o Passo 4:

    f1: Aponta para um novo objeto Funcionario com parâmetro (construtor com parâmetro chamado) 


    Visibilidade --------------------------------------------------------------------------------

    • public : acessíveis “dentro” e “fora” da classe
    • private : acessíveis somente “dentro” da classe
    • Qual é a vantagem disso?

    R: Métodos e classes public permitem maior flexibilidade ao manuseá-las em diferentes níveis de scopo.
       Métodos e classes private conferem maior segurança ao código e cercam possivéis erros presentes na interação direta com o código de origem, sendo que
       seu foco e' na aplicação e nao na forma como foi implementado.

    • Atributos e métodos estáticos podem ser chamados sem que 
    um objeto seja instanciado (por exemplo, IO.println)
    • Qual é a vantagem disso?

    R:
       Quando as propriedades e funcionalidades daquele objeto não são relevantes podemos nos atentar apenas à utilização de seus métodos.
       Adaptabilidade à membros estaticos contidos em outros escopos do código.
       Reciclagem de código, pois as funções e metodos genericos posteriormente podem ser aplicados em outros códigos.

 */