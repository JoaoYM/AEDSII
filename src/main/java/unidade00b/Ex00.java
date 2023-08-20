package main.java.unidade00b;
 /*
             Faça um método que receba um array de inteiros e um 
        número inteiro x e retorne um valor booleano informando se o 
        elemento x está contido no array
            • Repita o exercício acima considerando que os elementos do 
        array estão ordenados de forma crescente. Uma sugestão 
        seria começar a pesquisa pelo meio do array
  */

  public class Ex00 extends Valid{
        public static void main(String[] args){
            int[] y = {1,2,3,4,5,6};
            int   x = 3; 
            int   param = 1; // 1 para utilizar o for para pesquisar no Array, 2 para utilizar a pesquisa binária.            
    
            if(Ex01(y, x, param)){
                System.out.println("O numero " + x + " esta contido no array");
            }else{
                System.out.println("O numero " + x + " nao esta contido no array");
            }
        }

        public static boolean Ex01(int[] array, int target, int param){
            boolean response = false;
               
                if (!IsNull(array)){
                    return false;
                }


                if (param == 1){
                    for(int i=0; i<array.length;i++){
                        if (target == array[i]){
                            response = true;
                        }
                    }
                }else{
                        int left = 0;
                        int right = array.length - 1;
                
                        while (left <= right) {
                            int mid = left + (right - left) / 2;
                
                            if (array[mid] == target) {
                                //return mid; 
                                response = true;
                                break;
                            } else if (array[mid] < target) {
                                left = mid + 1; // Search in the right half
                            } else {
                                right = mid - 1; // Search in the left half
                            }
                        }
                    }
                            return response;
        }
        
  }