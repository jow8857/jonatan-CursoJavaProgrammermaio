import java.util.Scanner;


import javax.swing.JOptionPane;

import entidade.Animal;
import entidade.Cachorro;
import entidade.Cobra;



public class Principal {
	public static void main(String[] args) {

		
		Cachorro objcachorro = new Cachorro();
		
		Cobra objcobra = new Cobra();
		
		
		//System.out.println("digite a cor do cachorro ");
		JOptionPane.showMessageDialog(null, "Caracteriscas do cahorro");
		
		
		objcachorro.setCorPelo(JOptionPane.showInputDialog("digite a cor do cachorro "));
		
	    objcachorro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o Pre�o do Cachorro"));
		
		//System.out.println("essa cobra � venenosa ? sim para venenosa n�o para n�o venenosa");
		
		objcobra.setTipoVeneno(JOptionPane.showInputDialog("essa cobra � venenosa ? "));
		
		JOptionPane.showMessageDialog(null, "a cordo do cachorro � " + objcachorro.getCorPelo());
		
		JOptionPane.showMessageDialog(null, "venenosa? " + objcobra.getTipoVeneno());
	
		
	
		
		
		
		
		


		


		
	
}}