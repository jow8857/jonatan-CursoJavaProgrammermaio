package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

import entitis.Endereco;

public class ClientApiViaCep {

	public static Endereco BuscarClienteApi(String Cep) throws Exception {
		Endereco endereco = new Endereco();

		String urlApi = "https://viacep.com.br/ws/" + Cep + "/json/";/// cria a url junto com o parametro recebido

		URL url = new URL(urlApi); /// cria um objeto url que vai receber a String da urll

		HttpURLConnection conecxao = (HttpURLConnection) url.openConnection();

		conecxao.setRequestMethod("GET");

		int respostaApi = conecxao.getResponseCode();

		if (respostaApi == (HttpURLConnection.HTTP_OK)) {

			BufferedReader recebeDados = new BufferedReader(new InputStreamReader(conecxao.getInputStream()));

			String linhaEntrada;

			StringBuffer respostaDaApi = new StringBuffer();

			while ((linhaEntrada = recebeDados.readLine()) != null) {
				respostaDaApi.append(linhaEntrada);
				System.out.println(linhaEntrada);
			}

			recebeDados.close();
			String jsonRecebidoDaApi = respostaDaApi.toString();
			System.out.println(jsonRecebidoDaApi);
			endereco = jsonParaEndereco(jsonRecebidoDaApi);

		} else {
			JOptionPane.showMessageDialog(null, "sem endereço");
		}

		return endereco;

	}

	// Recebe uma String JSON e retorna a entidade endereço
	// Aula teorica de manipulação de string
	public static Endereco jsonParaEndereco(String jsonString) {

		Endereco endereco = new Endereco();

		jsonString = jsonString.trim().substring(1, jsonString.length() - 1);

		String[] parts = jsonString.split(",\\s*");

		for (String part : parts) {

			String[] keyValue = part.split(":\\s*");

			if (keyValue.length == 2) {
				String key = keyValue[0].trim().replaceAll("^\"|\"$", "");
				String value = keyValue[1].trim().replaceAll("^\"|\"$", "");

				switch (key) {
				case "cep":
					endereco.setCEP(value);
					break;
				case "logradouro":
					endereco.setLAGRADOURO(value);
					break;

				case "localidade":
					endereco.setLOCALIDADE(value);
					break;
				case "uf":
					endereco.setUF(value);
					break;

				}
			}
		}

		return endereco;
	}

}
