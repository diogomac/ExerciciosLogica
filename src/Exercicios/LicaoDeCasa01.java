package Exercicios;
import java.util.Scanner;

public class LicaoDeCasa01 {

	public static void main(String[] args) {
		/*
		 * � Para um ano de nascimento fornecido pelo usu�rio, informe a idade que ele
		 * ter� no dia 31 de dezembro de 2021.
		 */

		// fa�a o usuario digitar o ano de nascimento.

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o seu ano de nascimento: ");
		int ano_de_nascimento = leitor.nextInt();

		// informe a idade que ele ter� no dia 31 de dezembro de 2021

		int ano = 2021;
		int idade_2021 = ano - ano_de_nascimento;
		System.out.println("Voc� ter� " + idade_2021 + " Anos de idade em 2021.");
		leitor.close();

	}

}
