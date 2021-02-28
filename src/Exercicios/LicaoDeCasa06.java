package Exercicios;
import java.util.Scanner;

public class LicaoDeCasa06 {

	public static void main(String[] args) {
		/*
		 * Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom
		 * �DIADEFESTA�. Fa�a um programa onde o funcion�rio digite o valor da compra e
		 * um cupom, informando o valor final a ser pago.
		 */

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da compra: ");
		double valor_compra = leitor.nextDouble();
		System.out.println("Digite o cupom de desconto: ");
		String cupom = leitor.next();

		if (cupom.equals("DIADEFESTA")) {

			double compra_com_desconto = valor_compra - (0.03 * valor_compra);

			System.out.println("Valor a ser pago com desconto de 3% � de " + compra_com_desconto + " Reais");
		} else {
			System.out.println("Valor a ser pago sem o CUPOM � de " + valor_compra + " Reais");
		}
		leitor.close();
	}

}
