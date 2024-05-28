package interacaoUsuario;

import javax.swing.JOptionPane;

import entidades.Cachorro;
import entidades.Cobra;
import entidades.Animal;





public class CaracteristicasAnimais {
		
		Cachorro objcachorro = new Cachorro();
		
		
		public void CaracteristicaCachorro() {
		
		//System.out.println("digite a cor do cachorro ");
		JOptionPane.showMessageDialog(null, "Caracteriscas do cahorro");
		
		
		objcachorro.setCorPelo(JOptionPane.showInputDialog("digite a cor do cachorro "));
		JOptionPane.showMessageDialog(null, "a cordo do cachorro é " + objcachorro.getCorPelo());
		
		//System.out.println("essa cobra é venenosa ? sim para venenosa não para não venenosa");
		
		}
		
		public void CaracteristicaCobra() {
		Cobra objcobra = new Cobra();
		
		JOptionPane.showMessageDialog(null, "Caracteriscas da Cobra");
		objcobra.setTipoVeneno(JOptionPane.showInputDialog("essa cobra é venenosa ? "));
		JOptionPane.showMessageDialog(null, "venenosa? " + objcobra.getTipoVeneno());
		
	
		}
}
	
	
		
	
		