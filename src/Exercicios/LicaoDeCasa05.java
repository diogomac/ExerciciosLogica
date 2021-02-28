package Exercicios;
import java.util.Scanner;

public class LicaoDeCasa05 {

	public static void main(String[] args) {
		/*
		 * – Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor
		 * peso. Entre os pesos de 3 lixos informados pelo usuário, um programa deve
		 * indicar qual deles deve ser carregado pelo drone.
		 */
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o peso do primeiro saco de lixo : ");
		double lixo_01 = leitor.nextDouble();
		System.out.println("Digite o peso do segundo saco de lixo : ");
		double lixo_02 = leitor.nextDouble();
		System.out.println("Digite o peso do terceiro saco de lixo : ");
		double lixo_03 = leitor.nextDouble();
		double menor_valor;

		// SE LIXO 01 FOR MENOR QUE LIXO 02 E LIXO 01 FOR MENOR QUE 03 ENTÃO MENOR_VALOR
		// RECEBE LIXO 01
		if (lixo_01 < lixo_02 && lixo_01 < lixo_03) {
			menor_valor = lixo_01;
			// SE NÃO SE LIXO 02 FOR MENOR QUE LIXO 03, ENTAO MENOR_VALOR RECEBE LIXO 02
		} else if (lixo_02 < lixo_03) {
			menor_valor = lixo_02;
		}
		// SE NENHUMA DAS CONDIÇOES FOREM VERDADEIRAS ENTAO MENOR_VALOR É LIXO 02
		else {
			menor_valor = lixo_03;
		}
		System.out.println("Carregar o lixo " + menor_valor);

		leitor.close();
	}
}
