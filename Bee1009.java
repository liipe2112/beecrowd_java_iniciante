package beecrowd.iniciante;

import java.util.Scanner;

public class Bee1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Entradas*/
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double totalDeVendas = sc.nextDouble();
		
		/*Processamento*/
		double calculo = salarioFixo + (0.15 * totalDeVendas);
		
		/*Saida*/
		System.out.println((String.format("TOTAL = R$ %.2f", calculo)));
	}
}
