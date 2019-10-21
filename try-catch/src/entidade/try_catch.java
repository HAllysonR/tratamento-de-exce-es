package entidade;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {

	public static void main(String[] args) {
		// chamada de m�todo
		metodo02();

		System.out.println("Fim do programa");

	}

	public static void metodo02() {
		System.out.println("IN�CIO DO M�TODO 02 !");
		metodo01();
		System.out.println("FIM DO M�TODO 02 !");

	}

	public static void metodo01() {
		System.out.println("IN�CIO DO M�TODO 01 !");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vetor = sc.nextLine().split(" ");
			int pos = sc.nextInt();
			System.out.println(vetor[pos]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida !!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("n�o � letra e sim n�mero!!");
		}

		System.out.println("FIM DO M�TODO 01 !");

	}

}
