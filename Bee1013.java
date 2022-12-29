package beecrowd.iniciante;

import java.util.Scanner;

public class Bee1013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Entrada*/
		int a = sc.nextInt();
		int b = sc.nextInt();
		int abs = sc.nextInt();
		
		/*Processamento e Saida*/
		if (a > b && a > abs) {
			System.out.println(a + " eh o maior");
		} else if (b > abs && b > a) {
			System.out.println(b + " eh o maior");
		} else {
			System.out.println(abs + " eh o maior");
		}
		sc.close();
	}
}
