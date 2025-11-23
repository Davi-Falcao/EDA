import java.util.*;
import java.io.*;


public class Solucao{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numero1 = Integer.parseInt(br.readLine());
		int numero2 = Integer.parseInt(br.readLine());
		
		System.out.println(geraNum(numero1, numero2));

	}

	private static int geraNum(int num1, int num2){
		int tamNum1 = contarPassos(num1);
		int tamNum2 = contarPassos(num2);

		return Math.max(tamNum1, tamNum2);	

	}

	private static int contarPassos(int num){
		int passos = 1;
		while (num > 1){
			if (num % 2 == 0){
				num /= 2;
			}else{
				num = num * 3 + 1;
			}
			passos++;
		}

		return passos;

	}
}
