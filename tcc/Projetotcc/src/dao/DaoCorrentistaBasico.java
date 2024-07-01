package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conn.ConexaoDb;
import entitis.CorrentistaBasico;
import entitis.Endereco;

public class DaoCorrentistaBasico {

	public boolean cadastrarCorrentistaBasico(CorrentistaBasico correntistaBasico) {

		String queryCadastroPlus = "insert into correntista_plus(nome,cpf,email,cep,localidade,logradouro,uf,qtd_transacao,valor_anuidade,limite_credito)\r\n"
				+ "values(?,?,?,?,?,?,?,?,?,?)";

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConexaoDb.conn();

			preparedStatement = connection.prepareStatement(queryCadastroPlus);

			preparedStatement.setString(1, correntistaBasico.getNome());
			preparedStatement.setString(2, correntistaBasico.getCpF());
			preparedStatement.setString(3, correntistaBasico.getEmail());
			preparedStatement.setString(4, correntistaBasico.getEndereco().getCEP());
			preparedStatement.setString(5, correntistaBasico.getEndereco().getLOCALIDADE());
			preparedStatement.setString(6, correntistaBasico.getEndereco().getLAGRADOURO());
			preparedStatement.setString(7, correntistaBasico.getEndereco().getUF());
			preparedStatement.setString(8, String.valueOf(correntistaBasico.getqtdTransacao()));
			preparedStatement.setString(9, Double.toString(correntistaBasico.getValorAnuidade()));
			preparedStatement.setString(10, Double.toString(correntistaBasico.getLimiteDeSaque()));

			preparedStatement.execute();

		} catch (Exception e) {
			System.out.println(e);
		}
		return true;

	}

	public List<CorrentistaBasico> retornaListarCorrentistaBasico() {

		String queryList = "SELECT * FROM correntista_plus;";

		List<CorrentistaBasico> listaBasico = new ArrayList<CorrentistaBasico>();

		Connection conexaoBancoDeDados = null;
		PreparedStatement preparaQuery = null;
		ResultSet resutadoSelect = null;

		try {
			conexaoBancoDeDados = ConexaoDb.conn();

			preparaQuery = conexaoBancoDeDados.prepareStatement(queryList);

			resutadoSelect = preparaQuery.executeQuery();

			while (resutadoSelect.next()) {

				CorrentistaBasico correntistaBasico = new CorrentistaBasico();
				Endereco endereco = new Endereco();

				correntistaBasico.setNome(resutadoSelect.getString("nome"));
				correntistaBasico.setCpF(resutadoSelect.getString("cpf"));
				correntistaBasico.setEmail(resutadoSelect.getString("email"));
				try {
					correntistaBasico.setValorAnuidade(Double.parseDouble(resutadoSelect.getString("valor_anuidade")));
					correntistaBasico.setqtdTransacao(Integer.parseInt(resutadoSelect.getString("qtd_transacao")));
					correntistaBasico.setLimiteDeSaque(Double.parseDouble(resutadoSelect.getString("limite_saque")));

				} catch (Exception e) {
					// TODO: handle exception
				}

				try {
					endereco.setCEP(resutadoSelect.getString("cep"));
					endereco.setLOCALIDADE(resutadoSelect.getString("localidade"));
					endereco.setLAGRADOURO(resutadoSelect.getString("logradouro"));
					endereco.setUF(resutadoSelect.getString("uf"));

				} catch (Exception e) {
					System.out.println(e);
				}
                correntistaBasico.setEndereco(endereco);
				listaBasico.add(correntistaBasico);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				if (conexaoBancoDeDados != null) {

					conexaoBancoDeDados.close();// Se objeto connectionBaseExemplo estiver aberto essa linha vai
												// encerrar
				}
				if (preparaQuery != null) {// Se objeto preparaOcomandoSQL estiver aberto essa linha vai encerrar

					preparaQuery.close();
				}

			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
		return listaBasico;

	}
}
