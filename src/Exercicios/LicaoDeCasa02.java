package Exercicios;
import java.util.Scanner;

public class LicaoDeCasa02 {

	public static void main(String[] args) {
		/*
		 * Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
		 * solicite ao usu�rio que digite o tempo de um filme em minutos e informe a
		 * dura��o desse filme em horas e em segundos.
		 */

		int minutos = 60;
		int horas = 60;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o tempo do seu filme em minutos: ");
		int filme_minutos = leitor.nextInt();

		int duracao_filme_horas = filme_minutos / horas;
		int duracao_filme_segundos = filme_minutos * minutos;
		System.out.println("A dura��o do filme em horas � de " + duracao_filme_horas + " horas");
		System.out.println("A dura��o do filme em segundos � de " + duracao_filme_segundos + " segundos");

		leitor.close();

	}

}
