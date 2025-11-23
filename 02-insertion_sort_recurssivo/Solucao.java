import java.util.*;
import java.io.*;

public class Solucao{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			String[] tokens = line.split(" ");
			
			int n = tokens.length;
			int[] v = new int[n];
			for (int i = 0; i < v.length; i++){
				v[i] = Integer.parseInt(tokens[i]);
			}
			insertion_sort_recurssivo(v, n);
			

		}catch(IOException ioe){}
	
	}
	

	private static void insertion_sort_recurssivo(int[] v, int n){
		
		// Se o tamanho do array for igual a 1, o array está ordenado, é o caso base recurssivo
		if (n <= 1){
			return;
		}
		
		// Ordena recurssivamente os n-1 primeiros elementos (Como se ele puxasse o array - 1 )
		insertion_sort_recurssivo(v, n - 1);

		// A chave é o ultimo elemento do array que foi passado na chamada do metodo
		int chave = v[n - 1]; 
		// j é o índice do penultimo elemento do array
		int j = n - 2;
		
		while (j >= 0 && v[j] > chave){
			v[j + 1] = v[j];
			j--;
		}

		v[j + 1] = chave;
		
		System.out.println(Arrays.toString(v));		
	}

}
