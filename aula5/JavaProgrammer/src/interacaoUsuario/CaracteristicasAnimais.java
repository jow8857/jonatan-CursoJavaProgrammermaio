package interacaoUsuario;

import java.util.List;

import javax.swing.JOptionPane;

import entidades.Cachorro;
import entidades.Cobra;
import entidades.Animal;

public class CaracteristicasAnimais {

	

	public Cachorro CaracteristicaCachorro() {
		
		Cachorro objcachorro = new Cachorro();

	
		JOptionPane.showMessageDialog(null, "Caracteriscas do cahorro");
                          objcachorro.setCorPelo(JOptionPane.showInputDialog("digite a cor do cachorro "));
       
         boolean entradaValida = true;                 
         while (entradaValida)    {             
         try {                 
        objcachorro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("digite o preço do cachorro ")));
        entradaValida = false;
         } catch(NumberFormatException  e) {
        	 System.out.println("favor digitar o preço");
         } 		 
         }
    
				return objcachorro;
	}

	public void imprimirCachorro(List<Cachorro> CachorroLista) {

		StringBuilder impressaoCachorrosString = new StringBuilder();

		for (Cachorro imprimirCachorro: CachorroLista) {
			impressaoCachorrosString.append("A Cor do Pelo: ").append(imprimirCachorro.getCorPelo()).append("\n");
		}

		JOptionPane.showMessageDialog(null, impressaoCachorrosString.toString());

	}

	public Cobra CaracteristicaCobra() {
		
		Cobra objcobra = new Cobra();

		JOptionPane.showMessageDialog(null, "Caracteriscas da Cobra");
		objcobra.setTipoVeneno(JOptionPane.showInputDialog("essa cobra é venenosa ? "));
		JOptionPane.showMessageDialog(null, "venenosa? " + objcobra.getTipoVeneno());
        return objcobra;
	}
	
	public void imprimirCobra() {
		
		
		
	}
	
	

}
