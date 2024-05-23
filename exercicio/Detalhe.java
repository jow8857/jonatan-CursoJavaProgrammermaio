import java.util.Scanner;

public class Detalhe {
 
  	public static void main(String[] args){

  	Scanner entradaDeDados = new Scanner(System.in);
  
 	 Carro objetoCarro = new Carro();

  	System.out.println("qual a cor do carro? ");

  	objetoCarro.cor = entradaDeDados.next();

 	System.out.println("qual o medelo do carro? ");

	objetoCarro.Modelo = entradaDeDados.next();

	System.out.println("qual a potencia do carro? ");

	objetoCarro.potencia = Integer.parseInt(entradaDeDados.next());

  	System.out.println("A cor do carro é " + objetoCarro.cor);

	System.out.println("O modelo do carro é " + objetoCarro.Modelo);

	System.out.println("A potencia do carro é " + objetoCarro.potencia);


        



  



}
}