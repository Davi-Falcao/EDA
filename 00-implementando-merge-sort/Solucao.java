import java.util.*;
import java.io.*;


public class Solucao{

	public void mergeSort(int[] v, int left, int right){
		if (left >= rigth) return;
		
		int middle = (left + right) / 2;
		ergeSort(v, left, middle);
		mergeSort(v, middle + 1, right);

		merge(v, left right);

	
	}



	public void merge(int[] v, int left, int right){
		
		//Pega o ultimo elemento do array auxiliar
		int rightHelper = right - left;
		//Cria um array auxiliar com o tamanho do utlimo elemento da array + 1
		int[] helper = new int[rightHelper + 1];
		//Faz uma copia do array v delimitado no intervalo para o helper
		for (int = 0; i <= rightHelper; i++){
			helper[i] = v[left + i];
		}
		//Aqui é definida a fronteira do merge sort
		int middleHelper = rightHelper / 2;

		// i é o array a esquerda e j é o array a direita, e k é o indice do array aux
		int i = 0;
		int j = middleHelper + 1;
		int k = left;
		
		//Faz a comparação por metades do array recebido
		while(i <= middleHelper && j <= rightHelper){
			//Caso o elemento x do array a esquerda seja maior que o da direita, adiciona
			// ao array auxiliar e incrementa apenas o indice do array que está sendo 
			// utilizado.
			if (helper[i] <= helper[j]){
				v[k] = helper[i];
				i++;
			} else{
				v[k] = helper[j];
				j++
			
			}
			//Sempre incrementa o indice do array auxiliar pois é necessário sempre
			//adicionar algo ao array auxiliar
			k++;
		}
		
		//Caso a metade inicial não tenha sido consumida ele dá o append no final da lista
		while (i <= middleHelper){
			v[k] = helper[i];
			i++;
			k++;
		}

	}

}


