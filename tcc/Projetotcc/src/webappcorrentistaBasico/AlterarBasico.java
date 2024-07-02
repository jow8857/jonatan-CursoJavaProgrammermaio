package webappcorrentistaBasico;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllerCorrentistaBasico.AlterarCorrentistaBasicoController;
import entitis.CorrentistaBasico;

public class AlterarBasico {
	
	public  void alteraTela(CorrentistaBasico correntistaBasico) {
		
	
		JFrame frame = new JFrame();
		frame.setSize(200,200);
		JPanel jPanel = new JPanel();
		
		JLabel labelCpf = new JLabel("CPF :" + correntistaBasico.getCpF());
		jPanel.add(labelCpf);
		
		JTextField jTextNome = new JTextField(10);
		jTextNome.setText(correntistaBasico.getNome());
		jPanel.add(jTextNome);
		
		JTextField jTextEmail = new JTextField(10);
		jTextEmail.setText(correntistaBasico.getEmail());
		jPanel.add(jTextEmail);
		
		JTextField jTextCep = new JTextField(10);
		jTextCep.setText(correntistaBasico.getEndereco().getCEP());
		jPanel.add(jTextCep);
		
		JTextField jTextLocal = new JTextField(10);
		jTextLocal.setText(correntistaBasico.getEndereco().getLOCALIDADE());
		jPanel.add(jTextLocal);
		
		JTextField jTextLagradourou = new JTextField(10);
		jTextLagradourou.setText(correntistaBasico.getEndereco().getLAGRADOURO());
		jPanel.add(jTextLagradourou);
		
		JTextField jTextUf = new JTextField(10);
		jTextUf.setText(correntistaBasico.getEndereco().getUF());
		jPanel.add(jTextUf);
		
		JButton button = new JButton("alterar");
		jPanel.add(button);
		
		
		
		
		frame.add(jPanel);
		frame.setVisible(true);
		
		AlterarCorrentistaBasicoController alterarCorrentistaBasicoController = new AlterarCorrentistaBasicoController(jTextNome,jTextEmail,jTextCep,jTextLocal,jTextLagradourou,jTextUf);
		button.addActionListener(alterarCorrentistaBasicoController);
	}

}
