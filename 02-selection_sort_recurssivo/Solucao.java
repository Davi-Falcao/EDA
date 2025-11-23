import java.util.*;
import java.io.*;

public class Solucao{
	public static void main(String[] args){
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] tokens = line.split(" ");

		int[] v = new int[tokens.length];
		for (int i = 0; i < tokens.length; i++){
			v[i] = Integer.parseInt(tokens[i]);
		}
		
		selection_sort_recurssivo(v, 0);
		
		}catch(IOException ioe){}




	}
	private static void selection_sort_recurssivo(int[] v, int ini){
		if (ini >= v.length - 1){
			return;
		}

		int imenor = ini;
		for (int i = ini + 1; i < v.length; i++){
			if (v[i] < v[imenor]){
				imenor = i;
			}
		}

        swap(v, ini, imenor); 

		System.out.println(Arrays.toString(v));
		
		selection_sort_recurssivo(v, ini + 1);
		
	}

    private static void swap(int[] v, int i, int j){
        
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;

    }
	
}
