package main.java.unidade00b;

public class Valid {
    public static void main(String[] args){

    }

    public static boolean IsNull(int[] array){
         if (array.length == 0) {
            System.out.println("O array está vazio.");
            return false;
        }
            return true;
    }

    public static boolean IsPar(int x){
        if (x%2 == 0){
            return true;
        }
            return false;
    }
}
