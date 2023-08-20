package main.java.unidade00f;

import java.io.RandomAccessFile;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        // ExemploRAF01Escrita.escritaRAF();
        // ExemploRAF02Leitura.leituraRAF();
        // ExemploRAF03Cabecote.cabecoteRAF();
    }

    public class ExemploRAF01Escrita {
        public static void main(String args[]) throws Exception {

        }

        public static void escritaRAF() throws Exception {
            RandomAccessFile raf = new RandomAccessFile("exemploRAF.txt", "rw");

            raf.writeInt(1);
            raf.writeDouble(5.3);
            raf.writeChar('X');
            raf.writeBoolean(true);
            raf.writeBytes("Algoritmos");

            raf.close();
        }
    }

    public class ExemploRAF02Leitura {
        public static void main(String[] args) throws Exception {

        }

        public static void leituraRAF() throws Exception {
            RandomAccessFile raf = new RandomAccessFile("exemploRAF.txt", "rw");

            int inteiro = raf.readInt();
            double real = raf.readDouble();
            char caractere = raf.readChar();
            boolean boleano = raf.readBoolean();
            String str = raf.readLine();

            raf.close();

            System.out.println("inteiro: " + inteiro);
            System.out.println("real: " + real);
            System.out.println("caractere: " + caractere);
            System.out.println("boleano: " + boleano);
            System.out.println("str: " + str);
        }
    }

    public class ExemploRAF03Cabecote {
        public static void main(String args[]) throws Exception {

        }

        public static void cabecoteRAF() throws Exception {
            RandomAccessFile raf = new RandomAccessFile("exemploRAF.txt", "rw");

            raf.writeInt(1);
            raf.writeDouble(5.3);
            raf.writeChar('X');
            raf.writeBoolean(true);
            raf.writeBytes("Algoritmos");

            raf.seek(0); // Retornando o cabecote para a posicao 0
            System.out.println(raf.readInt()); // imprimindo o inteiro

            raf.seek(12); // Setando o cabecote na posicao 12 (do caractere,
                          // 12 = 4 do int + 8 do double)
            System.out.println(raf.readChar());

            raf.seek(12); // Setando o cabecote novamente na posicao 12
            raf.writeChar('@'); // Substituindo o caractere

            raf.seek(12);
            System.out.println(raf.readChar());

            raf.close();
        }
    }

    public class ExemploRandomAccessFile {
        public static void main(String[] args) {
            // Exemplo de uso dos métodos
            escreverArquivo("arquivo.txt", "Olá, mundo!");
            lerArquivo("arquivo.txt");
            converterParaMaiusculas("arquivo.txt", "arquivo_maiusculas.txt");
            copiarArquivo("arquivo.txt", "copia_arquivo.txt");
            copiarConvertendoMaiusculas("arquivo.txt", "copia_maiusculas.txt");
            inverterConteudo("arquivo.txt", "arquivo_invertido.txt");
            criptografarCesar("arquivo.txt", "arquivo_criptografado.txt", 3);
            descriptografarCesar("arquivo_criptografado.txt", "arquivo_descriptografado.txt", 3);
        }

        public static void escreverArquivo(String nomeArquivo, String conteudo) {
            try {
                RandomAccessFile arquivo = new RandomAccessFile(nomeArquivo, "rw");
                arquivo.writeBytes(conteudo);
                arquivo.close();
                System.out.println("Conteúdo escrito no arquivo.");
            } catch (Exception e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        }

        public static void lerArquivo(String nomeArquivo) {
            try {
                RandomAccessFile arquivo = new RandomAccessFile(nomeArquivo, "r");
                String linha;
                while ((linha = arquivo.readLine()) != null) {
                    System.out.println(linha);
                }
                arquivo.close();
            } catch (Exception e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }

        public static void converterParaMaiusculas(String nomeArquivoOrigem, String nomeArquivoDestino) {
            try {
                RandomAccessFile arquivoOrigem = new RandomAccessFile(nomeArquivoOrigem, "r");
                RandomAccessFile arquivoDestino = new RandomAccessFile(nomeArquivoDestino, "rw");
                String linha;
                while ((linha = arquivoOrigem.readLine()) != null) {
                    arquivoDestino.writeBytes(linha.toUpperCase() + "\n");
                }
                arquivoOrigem.close();
                arquivoDestino.close();
                System.out.println("Conteúdo convertido para maiúsculas e salvo no arquivo.");
            } catch (Exception e) {
                System.out.println("Erro ao converter para maiúsculas: " + e.getMessage());
            }
        }

        public static void copiarArquivo(String nomeArquivoOrigem, String nomeArquivoDestino) {
            try {
                RandomAccessFile arquivoOrigem = new RandomAccessFile(nomeArquivoOrigem, "r");
                RandomAccessFile arquivoDestino = new RandomAccessFile(nomeArquivoDestino, "rw");
                String linha;
                while ((linha = arquivoOrigem.readLine()) != null) {
                    arquivoDestino.writeBytes(linha + "\n");
                }
                arquivoOrigem.close();
                arquivoDestino.close();
                System.out.println("Arquivo copiado.");
            } catch (Exception e) {
                System.out.println("Erro ao copiar o arquivo: " + e.getMessage());
            }
        }

        public static void copiarConvertendoMaiusculas(String nomeArquivoOrigem, String nomeArquivoDestino) {
            try {
                RandomAccessFile arquivoOrigem = new RandomAccessFile(nomeArquivoOrigem, "r");
                RandomAccessFile arquivoDestino = new RandomAccessFile(nomeArquivoDestino, "rw");
                String linha;
                while ((linha = arquivoOrigem.readLine()) != null) {
                    arquivoDestino.writeBytes(linha.toUpperCase() + "\n");
                }
                arquivoOrigem.close();
                arquivoDestino.close();
                System.out.println("Arquivo copiado e convertido para maiúsculas.");
            } catch (Exception e) {
                System.out.println("Erro ao copiar e converter para maiúsculas: " + e.getMessage());
            }
        }

        public static void inverterConteudo(String nomeArquivoOrigem, String nomeArquivoDestino) {
            try {
                RandomAccessFile arquivoOrigem = new RandomAccessFile(nomeArquivoOrigem, "r");
                RandomAccessFile arquivoDestino = new RandomAccessFile(nomeArquivoDestino, "rw");
                String linha;
                StringBuilder conteudoReverso = new StringBuilder();
                while ((linha = arquivoOrigem.readLine()) != null) {
                    conteudoReverso.insert(0, linha + "\n");
                }
                arquivoDestino.writeBytes(conteudoReverso.toString());
                arquivoOrigem.close();
                arquivoDestino.close();
                System.out.println("Conteúdo invertido e salvo no arquivo.");
            } catch (Exception e) {
                System.out.println("Erro ao inverter o conteúdo: " + e.getMessage());
            }
        }

        public static void criptografarCesar(String nomeArquivoOrigem, String nomeArquivoDestino, int deslocamento) {
            try {
                RandomAccessFile arquivoOrigem = new RandomAccessFile(nomeArquivoOrigem, "r");
                RandomAccessFile arquivoDestino = new RandomAccessFile(nomeArquivoDestino, "rw");
                String linha;
                while ((linha = arquivoOrigem.readLine()) != null) {
                    StringBuilder linhaCriptografada = new StringBuilder();
                    for (char c : linha.toCharArray()) {
                        if (Character.isLetter(c)) {
                            char novoCaractere = (char) (((c - 'A' + deslocamento) % 26) + 'A');
                            linhaCriptografada.append(novoCaractere);
                        } else {
                            linhaCriptografada.append(c);
                        }
                    }
                    arquivoDestino.writeBytes(linhaCriptografada.toString() + "\n");
                }
                arquivoOrigem.close();
                arquivoDestino.close();
                System.out.println("Conteúdo criptografado e salvo no arquivo.");
            } catch (Exception e) {
                System.out.println("Erro ao criptografar o conteúdo: " + e.getMessage());
            }
        }

        public static void descriptografarCesar(String nomeArquivoOrigem, String nomeArquivoDestino, int deslocamento) {
            try {
                RandomAccessFile arquivoOrigem = new RandomAccessFile(nomeArquivoOrigem, "r");
                RandomAccessFile arquivoDestino = new RandomAccessFile(nomeArquivoDestino, "rw");
                String linha;
                while ((linha = arquivoOrigem.readLine()) != null) {
                    StringBuilder linhaDescriptografada = new StringBuilder();
                    for (char c : linha.toCharArray()) {
                        if (Character.isLetter(c)) {
                            char novoCaractere = (char) (((c - 'A' - deslocamento + 26) % 26) + 'A');
                            linhaDescriptografada.append(novoCaractere);
                        } else {
                            linhaDescriptografada.append(c);
                        }
                    }
                    arquivoDestino.writeBytes(linhaDescriptografada.toString() + "\n");
                }
                arquivoOrigem.close();
                arquivoDestino.close();
                System.out.println("Conteúdo descriptografado e salvo no arquivo.");
            } catch (Exception e) {
                System.out.println("Erro ao descriptografar o conteúdo: " + e.getMessage());
            }
        }
    }

}
