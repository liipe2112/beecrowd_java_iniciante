package beecrowd.iniciante;

import java.util.Scanner;

public class Bee1007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Entradas*/
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		/*Processamento*/
		int diferenca = (a * b) - (c * d);
		
		/*Saída*/
		System.out.println(String.format("DIFERENCA = %d", diferenca));
	}
}
