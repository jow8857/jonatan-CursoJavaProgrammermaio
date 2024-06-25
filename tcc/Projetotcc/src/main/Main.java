package main;

import java.sql.SQLException;

import client.ClientApiViaCep;
import conn.ConexaoDb;
import dao.DaoCorrentistaBasico;
import webapp.TelaInicialCorrentista;
import webappcorrentistaBasico.ListarCorrentistaBasico;

public class Main {

	public static void main(String[] args) throws SQLException {
	//	TelaInicialCorrentista inicialCorrentista = new TelaInicialCorrentista();
		//inicialCorrentista.TelaCorrentista();
		ListarCorrentistaBasico basico = new ListarCorrentistaBasico();
		basico.listarCorrentistaBasico();
		// DaoCorrentistaBasico correntistaBasico = new DaoCorrentistaBasico();
		// correntistaBasico.retornaListarCorrentistaBasico();
		//ClientApiViaCep teste = new  ClientApiViaCep();
		//teste.BuscarClienteApi("03953060");
		
		//ConexaoDb conexaoDb = new ConexaoDb();
		//conexaoDb.conn();
	//	DaoCorrentistaPlus correntistaPlus = new DaoCorrentistaPlus();
		//correntistaPlus.cadastrarCorrentistaPlus(null);
		
		//conexaoDb.closeConnDb(conexaoDb.conn());
		//TelaCorrentistaPlus correntistaPlus = new TelaCorrentistaPlus();
		//correntistaPlus.menuOpcPlus();
		
		//TelaCorrentistaPremium correntistaPremium = new TelaCorrentistaPremium();
		//correntistaPremium.menuOpcPremium();
		
	}

}
