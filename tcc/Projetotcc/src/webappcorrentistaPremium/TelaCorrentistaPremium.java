package webappcorrentistaPremium;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaCorrentistaPremium {
	String msgIninial = "<html><div style=text-align 'center'>Banco Java Programmer<br>Selecione a operação a ser realizada</html>";
	String opcCadastrar = "Novo Correntista Premium";
	String opcListar = "Listar correntistas cadastrados";
	String opcAlterar = "Alterar Correntista Premium";
	String opcDeletar = "Deletar correntista";
	
	public void menuOpcPremium() {
		JFrame frame = new JFrame();
		JPanel jPanel = new JPanel();
		frame.setSize(300,300);
		
		JLabel bvdLabel = new JLabel(msgIninial);
		jPanel.add(bvdLabel);
		
		JButton opc1 = new JButton(opcCadastrar);
		jPanel.add(opc1);
		
		JButton opc2 = new JButton(opcListar);
		jPanel.add(opc2);
		
		JButton opc3 = new JButton(opcAlterar);
		jPanel.add(opc3);
		
		JButton opc4 = new JButton(opcDeletar);
		jPanel.add(opc4);
		
		
		
		frame.add(jPanel);
		frame.setVisible(true);
		
	}

}
