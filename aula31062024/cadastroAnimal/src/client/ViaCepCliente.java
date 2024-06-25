package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JOptionPane;

import entitis.CEPEndereco;

public class ViaCepCliente {
	public static CEPEndereco BuscarClienteApi(String Cep) throws Exception {
		CEPEndereco endereco = new CEPEndereco();
	   
	   String urlApi = "https://viacep.com.br/ws/" + Cep +"/json/";///cria a url junto com o parametro recebido 
	   
	   URL url = new URL(urlApi);  ///cria um objeto url que vai receber a String da urll
	   
	   HttpURLConnection conecxao = (HttpURLConnection)url.openConnection();
	   
	   conecxao.setRequestMethod("GET");
	   
	   int respostaApi = conecxao.getResponseCode();
	   
	   if(respostaApi == (HttpURLConnection.HTTP_OK)) {
		   
		   BufferedReader recebeDados = new BufferedReader(new InputStreamReader(conecxao.getInputStream()));
		   
		   String linhaEntrada;
		   
		   StringBuffer respostaDaApi = new StringBuffer();
		   
		   while((linhaEntrada = recebeDados.readLine()) != null)  {
			   respostaDaApi.append(linhaEntrada);
			   System.out.println(linhaEntrada);
		   }
		   
		   recebeDados.close();
			String jsonRecebidoDaApi = respostaDaApi.toString();
			System.out.println(jsonRecebidoDaApi);
			endereco = jsonParaEndereco(jsonRecebidoDaApi);
		   
	   }else {JOptionPane.showMessageDialog(null, "sem endereço");}
	   
	   
	 
	   return endereco;
	   
	   
   }

	// Recebe uma String JSON e retorna a entidade endereço
	// Aula teorica de manipulação de string
	public static CEPEndereco jsonParaEndereco(String jsonString) {

		CEPEndereco CEPEndereco = new CEPEndereco();

		jsonString = jsonString.trim().substring(1, jsonString.length() - 1);

		String[] parts = jsonString.split(",\\s*");

		for (String part : parts) {

			String[] keyValue = part.split(":\\s*");

			if (keyValue.length == 2) {
				String key = keyValue[0].trim().replaceAll("^\"|\"$", "");
				String value = keyValue[1].trim().replaceAll("^\"|\"$", "");

				switch (key) {
				case "cep":
					CEPEndereco.setCep(value);
					break;
				case "logradouro":
					CEPEndereco.setLogradouro(value);
					break;
				case "complemento":
					CEPEndereco.setComplemento(value);
					break;
				case "bairro":
					CEPEndereco.setBairro(value);
					break;
				case "localidade":
					CEPEndereco.setLocalidade(value);
					break;
				case "uf":
					CEPEndereco.setUf(value);
					break;
				case "ibge":
					CEPEndereco.setIbge(value);
					break;
				case "gia":
					CEPEndereco.setGia(value);
					break;
				case "ddd":
					CEPEndereco.setDdd(value);
					break;
				case "siafi":
					CEPEndereco.setSiafi(value);
					break;
				default:

					break;
				}
			}
		}

		return CEPEndereco;
	}
}
