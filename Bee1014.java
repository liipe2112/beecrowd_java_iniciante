package beecrowd.iniciante;

import java.util.Scanner;

public class Bee1014 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Entradas
		int x = entrada.nextInt();
		double y = entrada.nextDouble();
		
		//Processamento
		double calculo = x / y;
		
		//Saida
		System.out.println(String.format("%.3f km/l", calculo));
		
		entrada.close();
	}
}
