import java.util.*;
import java.io.*;


public class Solucao{
	public static void main(String[] args){

		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] tokens = line.split(" ");
		
		int[] v = new int[tokens.length];
		for (int i = 0; i < tokens.length; i++) {
			v[i] = Integer.parseInt(tokens[i]);
		}
		
		int[] resultado = insere_ordenado(v);		

		System.out.println(Arrays.toString(resultado));
		} catch(IOException ioe) {}
			

	}	

	private static int[] insere_ordenado(int[] v){
		int i = 0;
		int aux = 0;
		while (i < v.length && v[i] > v[i +  1]){
			aux = v[i];
			v[i] = v[i + 1];
			v[i + 1] = aux;
			i++;
		}

		return v;
	}
}
