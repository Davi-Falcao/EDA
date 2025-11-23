import java.util.*;
import java.io.*;

public class Solucao{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new
            InputStreamReader(System.in));
            String line = br.readLine();
            String[] tokens = line.split(" ");
            int[] v = new int[tokens.length];
            for (int i = 0; i < v.length; i++){
                v[i] = Integer.parseInt(tokens[i]);
            }
            int[] resultado = countingSort(v, 10);
            System.out.println(Arrays.toString(resultado));

            

        }catch(IOException ioe){}

    }
    
    public static int[] countingSort(int[] A, int k){
        int[] C = new int[k];
        
        // For de frequencia
        for (int i = 0; i < A.length; i++){
            C[A[i] - 1 ] += 1;
        }

        // For Cumulativo
        
        for (int i = 1; i < C.length; i++){
            C[i] += C[i - 1];
        }

        // Ordenando aqui a lista
        int[] B = new int[A.length];

        for (int i = B.length - 1; i >= 0; i--){
            B[C[A[i] - 1] - 1] = A[i];
            //Decrementando o elemento cumulativo
            C[A[i] - 1] -= 1;
        }

        return B;


    }

}
