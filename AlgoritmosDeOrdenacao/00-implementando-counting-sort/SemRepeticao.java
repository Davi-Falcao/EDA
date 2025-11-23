import java.util.*;
import java.io.*;

public class SemRepeticao{
    public static void main(String[] args){
            try{
                BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
                String line = br.readLine();
                String[] tokens = line.split(" ");

                int[] v = new int[tokens.length];
                for(int i = 0; i < v.length; i++){
                    v[i] = Integer.parseInt(tokens[i]);
                }

                int[] resultado = countingSort(v, 7);
                System.out.println(Arrays.toString(resultado));

            }catch(IOException ioe){}
    }

    public static int[] countingSort(int[] A, int k){
        boolean[] C = new boolean[k];

        for (int i = 0; i < A.length; i++){
            
            // Vai pegar o valor de A como se fosse o indice, se
            // A[i] for 7, ele vai deixar o indice 6 do array C
            // como true

            C[A[i] - 1] = true;
        }

        int j = 0;
        int[] B = new int[A.length];

        for (int i = 0; i < C.length; i++){
            if(C[i]){
                B[j] = i + 1;
                j++;
            }
        }

        return B;
    }

}
