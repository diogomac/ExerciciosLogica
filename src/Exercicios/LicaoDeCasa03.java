package Exercicios;
import java.util.Scanner;

public class LicaoDeCasa03 {

	public static void main(String[] args) {
		// – Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B.
		// Sem usar uma terceira variável, troque os valores de A e B entre si
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro numero inteiro: ");
		int A = leitor.nextInt();
		System.out.println("Digite o segundo numero inteiro: ");
		int B = leitor.nextInt();

		// A = 2
		// B = 5
		// -> A = 5
		// -> B=5 A=5
		// B = A = 5
		// B = A = 5
		// int aux;
		// aux = A;
		A = A ^ B;
		B = B ^ A;
		A = A ^ B;
//B = A;

		System.out.println("O valor da variavel A é de : " + A);
		System.out.println("O valor da variavel B é de : " + B);

		leitor.close();
	}

}
