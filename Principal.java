import java.util.Scanner;

public class Principal{
      public static void main(String[] args){
       
      Scanner entradaDeDados = new Scanner(System.in);
      Animal objetoanimal = new Animal();

      System.out.println("Digite o nome do Animal: ");
      
      objetoanimal.nomeAnimal = entradaDeDados.next();
     
      System.out.println("o nome do animal é " + objetoanimal.nomeAnimal);
      
      System.out.println("Digite a idade do Animal: ");
       
      objetoanimal.idadeAnimal = Integer.parseInt(entradaDeDados.next());

      System.out.println("a idade do animal e " + objetoanimal.idadeAnimal);
      
      

      
  }
}