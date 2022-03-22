package br.com.newton.LingProg.Pratica01;

import java.util.Scanner;

public class Questao_01 {
	public static void main(String[] args) {
		 
		Double tempViagem, VelMedia, Distancia, ConListros, litrosPHoras;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o tempo gasto na viagem ");
		tempViagem = entrada.nextDouble();
		System.out.println("Informe a velocidade do media ");
		VelMedia = entrada.nextDouble();
		System.out.println("Informe quantos litros o automóvel faz por horas ");
		litrosPHoras = entrada.nextDouble();
		
		Distancia = tempViagem * VelMedia;
		ConListros = Distancia/litrosPHoras;
		
		System.out.printf("consumo final de combustível gasto e de %.2f\n", ConListros);
		entrada.close();

	}


}

