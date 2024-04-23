package exerciciosrepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		int idade = 0;
		int maior = 0, menor= 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(idade>=0) {
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
			if(idade<21 && idade > 0) {
				menor++;
			}if(idade>50) {
				maior++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: "+ menor);
		System.out.println("Total de pessoas menores de 50 anos: "+ maior);

		sc.close();
	}

}
