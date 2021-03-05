package Exercicios;

import java.util.Scanner;

public class LicaoDeCasa10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < 150; i++) {
			System.out.println("Digite o nome do funcionario: ");
			String nomeFuncionario = leitor.nextLine();
			System.out.println("Digite o seu SETOR: ");
			String setorFuncionario = leitor.nextLine();
			System.out.println("Digite o seu meio de transporte: ");
			String meioTransporte = leitor.next();
			if(meioTransporte.equalsIgnoreCase("CARRO")) {
				System.out.println("Digite o ultimo digito numerico da placa do seu carro: ");
				int numeroPlaca = leitor.nextInt();
				switch (numeroPlaca) {
				case 1:
				case 2:
					System.out.println(nomeFuncionario+ "do Setor de " + setorFuncionario+ " Seu dia de rodízio é segunda-feira");
					break;
				case 3:
				case 4:
					System.out.println(nomeFuncionario + "do Setor de " + setorFuncionario + "Seu dia de rodízio é terça-feira");
					break;
				case 5:
				case 6:
					System.out.println(nomeFuncionario + "do Setor de " + setorFuncionario + "Seu dia de rodízio é quarta-feira");
					break;
				case 7:
				case 8:
					System.out.println(nomeFuncionario + "do Setor de " + setorFuncionario + "Seu dia de rodízio é quinta-feira");
					break;
				case 9:
				case 10:
					System.out.println(nomeFuncionario + "do Setor de " + setorFuncionario + "Seu dia de rodízio é sexta-feira");
					break;
				default:
					System.out.println(nomeFuncionario + "do Setor de " + setorFuncionario + "Numero invalido digite um numero de 1 a 10");
				
				}
			} else if (meioTransporte.equalsIgnoreCase("ONIBUS")) {
				System.out.println("Rodízio não se aplica");
			}
			
			
		}
		leitor.close();
	}

}
