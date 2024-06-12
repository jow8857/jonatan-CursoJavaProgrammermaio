package GerenciaArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;

import entitis.Animal;
import entitis.Cachorro;
import entitis.Cobra;

public class ManipularArquivo {

	public void salvarCadCachorro(Cachorro cachorro) {

		String enderecoArquivo = "C:\\Users\\jonatan\\Documents\\cursojavaprogrammer\\jonatan-CursoJavaProgrammermaio\\CadastroFuncionario\\registroCachorro.txt";

		try {

			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(enderecoArquivo));

			bufferedWriter.append("O nome do cachorro é:" + cachorro.getNome());
			bufferedWriter.newLine();
			bufferedWriter.append("O doc do cachorro é:" + cachorro.getDoc());
			bufferedWriter.newLine();
			bufferedWriter.append("A a cor do pelo do cachorro é:" + cachorro.getCorPelo());

			bufferedWriter.close();

		} catch (Exception e) {
			System.out.println("Erro ao registrar o cachorro");
		}
	}

	public void salvarCadCobra(Cobra cobra) {

		String enderecoArquivo = "C:\\Users\\jonatan\\Documents\\cursojavaprogrammer\\jonatan-CursoJavaProgrammermaio\\CadastroFuncionario\\registroCachorro.txt";

		try {

			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(enderecoArquivo));

			bufferedWriter.append("O nome da cobra é:" + cobra.getNome());
			bufferedWriter.newLine();
			bufferedWriter.append("O doc da cobra é:" + cobra.getDoc());
			bufferedWriter.newLine();
			bufferedWriter.append("qual tipo de veneno:" + cobra.getVenenosa());

			bufferedWriter.close();

		} catch (Exception e) {
			System.out.println("Erro ao registrar a cobra");
		}
	}

}
