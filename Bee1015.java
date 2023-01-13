package beecrowd.iniciante;

import java.util.Scanner;

/*
	QUESTÃO
	Leia os quatro valores correspondentes aos eixos x e y de dois pontos 
	quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, 
	mostrando 4 casas decimais após a vírgula, segundo a fórmula: http://prntscr.com/jvxvhv
	
	ENTRADA
	O arquivo de entrada contém duas linhas de dados. A primeira linha contém 
	dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores 
	de ponto flutuante x2 y2.
	
	SAÍDA
	Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
*/

public class Bee1015 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*Entradas*/
		double x1 = entrada.nextDouble();
		double y1 = entrada.nextDouble();
		double x2 = entrada.nextDouble();
		double y2 = entrada.nextDouble();
		
		/*Processamento*/
		double calculo = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		/*Saida*/
		System.out.println(String.format("%.4f", calculo));
		
	}
}
