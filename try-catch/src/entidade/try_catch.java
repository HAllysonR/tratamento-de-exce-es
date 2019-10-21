package entidade;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {

	public static void main(String[] args) {
		// chamada de método
		metodo02();

		System.out.println("Fim do programa");

	}

	public static void metodo02() {
		System.out.println("INÍCIO DO MÉTODO 02 !");
		metodo01();
		System.out.println("FIM DO MÉTODO 02 !");

	}

	public static void metodo01() {
		System.out.println("INÍCIO DO MÉTODO 01 !");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vetor = sc.nextLine().split(" ");
			int pos = sc.nextInt();
			System.out.println(vetor[pos]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida !!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("não é letra e sim número!!");
		}

		System.out.println("FIM DO MÉTODO 01 !");

	}

}
