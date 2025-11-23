import java.util.*;
import java.io.*;


public class insere_ordenado_ultimo{
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
		int i = v.length - 1;
		while (i > 0 && v[i] < v[i -  1]){
			int aux = v[i];
			v[i] = v[i - 1];
			v[i - 1] = aux;
			i -= 1;
		}

		return v;
	}
}
