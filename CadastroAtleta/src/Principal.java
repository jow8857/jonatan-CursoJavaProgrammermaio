import java.util.Scanner;

import entidade.Animal;
import entidade.Cachorro;
import entidade.Cobra;



public class Principal {
	public static void main(String[] args) {

		Scanner entradaDeDados = new Scanner(System.in);
		
		Cachorro objcachorro = new Cachorro();
		
		Cobra objcobra = new Cobra();
		
		
		System.out.println("digite a cor do cachorro ");
		objcachorro.setCorPelo(entradaDeDados.next());
		
		System.out.println("a cor do cao � " + objcachorro.getCorPelo());
		
		System.out.println("essa cobra � venenosa ? sim para venenosa n�o para n�o venenosa");
		objcobra.setTipoVeneno(entradaDeDados.next());
		
		System.out.println("venenosa? " + objcobra.getTipoVeneno());
		
	
		
		
		
		
		


		


		
	
}}