package beecrowd.iniciante;

import java.util.Scanner;

public class Bee1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Entradas*/
		int number = sc.nextInt();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		/*Processamento*/
		double calculo = valorHora * horas;
		
		/*Saída*/
		System.out.println(String.format("NUMBER = %d", number));
		System.out.println(String.format("SALARY = U$ %.2f", calculo));
		
		sc.close();
	}
}
