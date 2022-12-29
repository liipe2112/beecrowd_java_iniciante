package beecrowd.iniciante;

import java.util.Scanner;

public class Bee1012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Entradas*/
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;
		
		/*Processamento*/
		double areaTrianguloRetangulo = (a * c) / 2.0;
		double areaCirculoRaio = pi * (c * c);
		double areaTrapezio = ((a + b) * c) / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		
		/*Saida*/
		System.out.println((String.format("TRIANGULO: %.3f", areaTrianguloRetangulo)));
		System.out.println((String.format("CIRCULO: %.3f", areaCirculoRaio)));
		System.out.println((String.format("TRAPEZIO: %.3f", areaTrapezio)));
		System.out.println((String.format("QUADRADO: %.3f", areaQuadrado)));
		System.out.println((String.format("RETANGULO: %.3f", areaRetangulo)));
		
		sc.close();
	}
}
