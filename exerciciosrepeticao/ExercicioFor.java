package exerciciosrepeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		
		int numero;
		int par = 0;
		int impar =0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <=10; i++) {
			System.out.print("Digite o "+ i + "º número: ");
			numero = sc.nextInt();
			if(numero % 2 ==0) {
				par++;
			}else {
				impar++;
			}
			
		}
		System.out.println("Soma de todos os números pares: " + par);
		System.out.println("Soma de todos os números ímpares: " + impar);

		sc.close();
	}

}
