package main.java.unidade00f;

import main.java.lib.Arq;

public class Ex00 {
   // Execute e brinque com os arquivos
   // ExemploArq01Escrita.java e ExemploArq02Leitura.java
   public static void main(String[] args) {
      // Escrita();
      // Leitura();
      // copiarArquivo("teste.txt", "copiedFile.txt");
      copiarArquivoV2();

   }

   // Arquivo ExemploArq01Escrita.java
   public static void Escrita() {
      Arq.openWrite("exemplo.txt");
      Arq.println(1);
      Arq.println(5.3);
      Arq.println('X');
      Arq.println(true);
      Arq.println("Algoritmos");
      Arq.close();
   }

   // • Faça um programa que abre um arquivo e cria uma cópia

   // Arquivo ExemploArq02Leitura.java class ExemploArq02
   public static void Leitura() {
      Arq.openRead("exemplo.txt");
      int inteiro = Arq.readInt();
      double real = Arq.readDouble();
      char caractere = Arq.readChar();
      boolean boleano = Arq.readBoolean();
      String str = Arq.readString();
      Arq.close();
      System.out.println("inteiro: " + inteiro);
      System.out.println("real: " + real);
      System.out.println("caractere: " + caractere);
      System.out.println("boleano: " + boleano);
      System.out.println("str: " + str);
   }

   public static void copiarArquivo(String nomeArqOrigem, String nomeArqDestino) {
      if (Arq.openRead(nomeArqOrigem)) {
         String conteudo = Arq.readAll();
         Arq.close();

         if (Arq.openWriteClose(nomeArqDestino, conteudo)) {
            System.out.println("Arquivo copiado com sucesso.");
         } else {
            System.out.println("Erro ao copiar o arquivo.");
         }
      } else {
         System.out.println("Erro ao abrir o arquivo de origem.");
      }
   }

   public static void copiarArquivoV2() {
      Arq.openRead("exemplo.txt");
      String str = "";
      while (Arq.hasNext()) {
         str += Arq.readLine() + "\n";
      }
      Arq.close();
      Arq.openWrite("copia.txt");
      Arq.print(str);
      Arq.close();
   }

}
