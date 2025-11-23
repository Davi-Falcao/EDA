import java.util.*;
import java.io.*;

public class Solucao{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			String[] tokens = line.trim().split(" ");
			int[] v = new int[tokens.length];
			for (int i = 0; i < v.length; i++){
				v[i] = Integer.parseInt(tokens[i]);
			}

            RadixSort(v);
			
            System.out.println(Arrays.toString(v));
		} catch(IOException ioe){}	
	}

    public static void RadixSort(int[] v){
        int max = getMax(v);
        int base = 100;
        int exp = 1;
        
        while((max/exp) > 0){
            countingSort(v, base, exp);
            exp *= base;
        }
    }

    public static void countingSort(int[] A, int base, int exp){
        int n = A.length;
        int[] C = new int[base];

        for (int i = 0; i < n; i++){
            int index = (A[i]/ exp) % base;
            C[index]++;
        }

        for(int i = 0; i < C.length - 1; i++){
            C[i + 1] += C[i];
        }

        int[] B = new int[n];
        for (int j = n - 1; j >=  0; j--){
            int index = (A[j]/exp) % base;
            B[C[index] - 1] = A[j];
            C[index]--;
        }
        
        System.out.println(Arrays.toString(B));
        
        System.arraycopy(B, 0, A, 0, n);
    }

    public static int getMax(int[] arr){
        int vmaior = 0;
        for (int v : arr){
            if (v > vmaior){
                vmaior = v;
            }
        }
        
        return vmaior;

    }
}
