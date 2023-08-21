package main.java.lib;

public class ExerciciosString {
    public static int contarCaractere(String str, char caractere) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == caractere) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean apenasDigitos(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
    
    public static int converterParaInteiro(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            int tmp = (int)(str.charAt(i) - '0');
            tmp *= (int)Math.pow(10, str.length() - i - 1);
            num += tmp;
        }
        return num;
    }
    
    
    public static boolean verificarPalindromo(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    
    public static void countCharMaiusculas(String str) {
        int totalCaracteres = str.length();
        int totalMaiusculos = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                totalMaiusculos++;
            }
        }
        
        System.out.println("Total de caracteres: " + totalCaracteres);
        System.out.println("Total de maiúsculos: " + totalMaiusculos);
    }
    
    
    public static int primeiraOcorrenciaA(String str) {
        return str.indexOf('A');
    }
    
    
    public static void countCharEType(String str) {
        int totalCaracteres = str.length();
        int totalLetras = 0;
        int totalNaoLetras = 0;
        int totalVogais = 0;
        int totalConsoantes = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toUpperCase(str.charAt(i));
            if (Character.isLetter(c)) {
                totalLetras++;
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    totalVogais++;
                } else {
                    totalConsoantes++;
                }
            } else {
                totalNaoLetras++;
            }
        }
        
        System.out.println("Total de caracteres: " + totalCaracteres);
        System.out.println("Total de letras: " + totalLetras);
        System.out.println("Total de não letras: " + totalNaoLetras);
        System.out.println("Total de vogais: " + totalVogais);
        System.out.println("Total de consoantes: " + totalConsoantes);
    }
}
