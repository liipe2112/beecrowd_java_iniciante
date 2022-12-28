package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		/*Entradas*/
		int codigoPeca1 = sc.nextInt();
		int numeroPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		int codigoPeca2 = sc.nextInt();
		int numeroPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		/*Processamento*/
		double calculo = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);
		
		/*Saida*/
		System.out.println((String.format("VALOR A PAGAR: R$ %.2f", calculo)));
		
		sc.close();
	}
}
