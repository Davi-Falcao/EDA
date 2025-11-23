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
        for (int i = 0; i < tokens.length; i++){
            v[i] = Integer.parseInt(tokens[i]);
        }
        
        quickSort(v, 0, tokens.length - 1);
        
        System.out.println(Arrays.toString(v));
        }catch(IOException ioe){}

    }


    public static void quickSort(int[] v, int left, int right){
        if (left >= right) return;
        
        // guarde o indice do pivot, retornado pelo
        // particionamento para ser usado na chamada recurssiva
        // do quick sort
        int index_pivot = particiona(v, left, right); 
        //faça o particionamento na metade esquerda, antes do
        //pivot
        quickSort(v, left, index_pivot - 1);
		//faça o particionamento na metade a direita, depois do
        //pivot
        quickSort(v, index_pivot + 1, right);	
        

    }

    public static int particiona(int[] v, int left, int right){
        // i começa logo após primeiro elemento("pivot")
        int i = left + 1;
        // j começa a partir do último elemento do array
        int j = right;
        // pivot é o primeiro elemento do array
        int pivot = v[left];
        
        // enquanto o i(indo para a direita) for menor ou igual
        // ao j(vindo da direita para a esquerda), continue o
        // loop
        while(i <= j){
            while(i <= j && v[i] <= pivot){
                // enquanto o elemento atual do i for menor ou
                // igual ao pivot, continue andando, se o
                // elemento atual for maior que o pivot ele para
                i++;
            }

            while(i <= j && v[j] > pivot){
                // enquanto o j(que está voltando não for menor
                // ou igual ao pivot, continue. quando for ele
                // para de decrementar
                j--;
            }

            if (i < j){
                // se o indice i for menor que j, troque i por j.
                swap(v, i, j);
            }
            
        }
        // faça a troca do pivot para a posição certa.
        swap(v, left, j);
        // retorne a posição certa do pivot para ser guardado como
        // indice
        return j;


    }

    private static void swap(int[] v, int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;

    }
}
