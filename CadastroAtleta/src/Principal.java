import java.util.Scanner;

import javax.jws.Oneway;

import entidade.Animal;

public class Principal {
	public static void main(String[] args) {

		Scanner entradaDeDados = new Scanner(System.in);
		Animal objetoanimal = new Animal();

		System.out.println("Digite o nome do Animal: ");

		objetoanimal.nome = entradaDeDados.next();

		System.out.println("Digite a idade do Animal: ");

		objetoanimal.idade = Integer.parseInt(entradaDeDados.next());

		System.out.println("digite o peso do animal");

		objetoanimal.peso = Integer.parseInt(entradaDeDados.next());
		
		
		objetoanimal.preco = CalcularPrecoAnimal(objetoanimal.peso);


		Imprimir(objetoanimal);

	}
	
	
public static double CalcularPrecoAnimal(int peso) {
	double preco = peso * 50;
    return preco;
}



	public static void Imprimir(Animal objetoanimal) {
		System.out.println("o nome do animal � " + objetoanimal.nome);
		System.out.println("a idade do animal e " + objetoanimal.idade);
		System.out.println("o peso do animal� " + objetoanimal.peso);
		System.out.println("o pre�o do animal � " + objetoanimal.preco);

	}
}