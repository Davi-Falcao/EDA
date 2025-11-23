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

		int[] resultado = selectionSort(v);
		System.out.println(Arrays.toString(resultado));

		}catch(IOException ioe){}
	}

	public static int[] selectionSort(int [] v){
		
		// O loop mais externo que vai "Selecionar" o número que vai ser comparado
		for (int i = 0; i < v.length; i++){
			//Considerando que o elemento selecionado é o menor para comparar com o resto da lista
			int imenor = i;
			for (int j = i + 1; j < v.length; j++){
				//Faz a comparação do elemento selecionado com todos a sua direita, se forem menores o imenor assume o do menor valor
				if (v[j] < v[imenor]){
					imenor = j;
				}
			}
			//Faz a troca do elemento para o menor em relação a sua posição
			int aux = v[i];
			v[i] = v[imenor];
			v[imenor] = aux;

		}
	
		return v;
	}

}
