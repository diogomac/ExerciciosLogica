package Exercicios;
import java.util.Scanner;

public class LicaoDeCasa06 {

	public static void main(String[] args) {
		/*
		 * Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom
		 * “DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e
		 * um cupom, informando o valor final a ser pago.
		 */

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da compra: ");
		double valor_compra = leitor.nextDouble();
		System.out.println("Digite o cupom de desconto: ");
		String cupom = leitor.next();

		if (cupom.equals("DIADEFESTA")) {

			double compra_com_desconto = valor_compra - (0.03 * valor_compra);

			System.out.println("Valor a ser pago com desconto de 3% é de " + compra_com_desconto + " Reais");
		} else {
			System.out.println("Valor a ser pago sem o CUPOM é de " + valor_compra + " Reais");
		}
		leitor.close();
	}

}
