package beecrowd.iniciante;

import java.util.Scanner;

public class Bee1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Entradas*/
		double volume = 4 / 3.0;
		double pi = 3.14159;
		double raio = sc.nextDouble();
		
		/*Processamento*/
		double calculo = (volume) * pi * (Math.pow(raio, 3)); 
		
		/*Saida*/
		System.out.println((String.format("VOLUME = %.3f", calculo)));
	}
}

/*public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
sc.useLocale(Locale.ENGLISH);
double terco = 4/3.0;
double pi = 3.14159;
double raio = Math.pow(sc.nextDouble(), 3);
double total = terco * pi * raio;

System.out.println((String.format("VOLUME = %.3f", total)));

sc.close();
}*/