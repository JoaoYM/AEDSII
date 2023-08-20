package main.java.unidade00f;

import java.util.Formatter;
import java.util.Scanner;
import java.io.File;



public class Ex00{
    // Execute e brinque com os arquivos 
    // ExemploArq01Escrita.java e ExemploArq02Leitura.java
    public static void main(String[] args){
      //   Escrita();
      //   Leitura();
      //copiarArquivo("teste.txt", "copiedFile.txt");
      copiarArquivoV2();
       
    }

    //Arquivo ExemploArq01Escrita.java
 public static void Escrita() {
    Arq.openWrite("exemplo.txt");
    Arq.println(1); 
    Arq.println(5.3); 
    Arq.println('X'); 
    Arq.println(true);
    Arq.println("Algoritmos"); 
    Arq.close(); 
} 

//• Faça um programa que abre um arquivo e cria uma cópia

   //Arquivo ExemploArq02Leitura.java class ExemploArq02
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
        System.out.println("boleano: " + boleano); System.out.println("str: " + str); 
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

  
      public static void copiarArquivoV2(){
            Arq.openRead("exemplo.txt");
            String str = "";
            while (Arq.hasNext()){
            str += Arq.readLine() + "\n";
            }
            Arq.close();
            Arq.openWrite("copia.txt");
            Arq.print(str);
            Arq.close();
      }
    

    
public static class Arq{
   private static String nomeArquivo = "";
   private static String charsetArquivo = "ISO-8859-1";
   private static boolean write = false, read = false;
   private static Formatter saida = null;
   private static Scanner entrada = null;

   public Arq(){
      System.out.println("Created");
   }

	public static boolean openWrite(String nomeArq, String charset) {
      boolean resp = false;
      close();
		try{
		   saida = new Formatter(nomeArq, charset);
         nomeArquivo = nomeArq;
         resp = write = true;
		}  catch (Exception e) {}
      return resp;
   }

	public static boolean openWrite(String nomeArq) {
      return openWrite(nomeArq, charsetArquivo);
   }

	public static boolean openWriteClose(String nomeArq, String charset, String conteudo) {
      boolean resp = openWrite(nomeArq, charset);
      if(resp == true){
         println(conteudo);
         close();
      }
      return resp;
   }

	public static boolean openWriteClose(String nomeArq, String conteudo) {
      return openWriteClose(nomeArq, charsetArquivo, conteudo);
   }

	public static boolean openRead(String nomeArq) {
      return openRead(nomeArq, charsetArquivo);
   }

	public static boolean openRead(String nomeArq, String charset) {
      boolean resp = false;
      close();
		try{
         entrada = new Scanner(new File(nomeArq), charset);
         nomeArquivo = nomeArq;
         resp = read = true;
		}  catch (Exception e) {}
      return resp;
   }

   public static String openReadClose(String nomeArq){
      openRead(nomeArq);
      String resp = readAll();
      close();
      return resp;
   }

	public static void close() {
      if(write == true){
         saida.close();
      }
      if(read == true){
         entrada.close();
      }
      write = read = false;
      nomeArquivo = "";
      charsetArquivo = "ISO-8859-1";
	}

   public static long length(){
      long resp = -1;
      if(read != write){
         File file = new File(nomeArquivo);
         resp = file.length();
      }
      return resp;
   }

   public static void print(int x){
      if(write == true){
		   saida.format( "%d", x);
      }
   }

   public static void print(double x){
      if(write == true){
	   	saida.format( "%f", x);
      }
   }

   public static void print(String x){
      if(write == true){
   		saida.format( "%s", x);
      }
   }

   public static void print(boolean x){
      if(write == true){
		   saida.format( "%s", ((x) ? "true" : "false"));
      }
   }

   public static void print(char x){
      if(write == true){
	   	saida.format( "%c", x);
      }
   }

   public static void println(int x){
      if(write == true){
   		saida.format( "%d\n", x);
      }
   }

   public static void println(double x){
      if(write == true){
		   saida.format( "%f\n", x);
      }
   }

   public static void println(String x){
      if(write == true){
	   	saida.format( "%s\n", x);
      }
   }

   public static void println(boolean x){
      if(write == true){
   		saida.format( "%s\n", ((x) ? "true" : "false"));
      }
   }

   public static void println(char x){
      if(write == true){
		   saida.format( "%c\n", x);
      }
   }

   public static int readInt(){
      int resp = -1;
		try{
         resp = entrada.nextInt();
		}  catch (Exception e) {}
      return resp;
   }

   public static char readChar(){
      char resp = ' ';
		try{
         resp = (char)entrada.nextByte();
		}  catch (Exception e) {}
      return resp;
   }

   public static double readDouble(){
      double resp = -1;
		try{
         resp = Double.parseDouble(readString().replace(",","."));
		}  catch (Exception e) {}
      return resp;
   }

   public static String readString(){
      String resp = "";
		try{
         resp = entrada.next();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
      return resp;
	}

   public static boolean readBoolean(){
      boolean resp = false;
		try{
         resp = (entrada.next().equals("true")) ? true : false;
		}  catch (Exception e) {}
      return resp;
	}

   public static String readLine(){
      String resp = "";
		try{
         resp = entrada.nextLine();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
      return resp;
	}


   public static boolean hasNext(){
      return entrada.hasNext();
   }

   public static String readAll(){
      String resp = "";
      while(hasNext()){
         resp += (readLine() + "\n");
      }
      return resp;
   }

  
}
}
   

