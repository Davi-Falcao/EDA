import java.util.*;

public class Solucao{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String elemConsultadoStr = sc.nextLine();
		int elemConsultado = Integer.parseInt(elemConsultadoStr);
		
		String elementos = sc.nextLine();
		String[] tokens = elementos.split(" ");

		int resConsulta = verificaFrequencia(tokens, elemConsultado);

		System.out.println(resConsulta);

	}


	public static int verificaFrequencia(String[] tokens, int elemConsultado){
		int qnt = 0;
		for (String e: tokens){
			int num = Integer.parseInt(e);
			if (num == elemConsultado){
				qnt++;
			}
		}
		return qnt;
	}

}
