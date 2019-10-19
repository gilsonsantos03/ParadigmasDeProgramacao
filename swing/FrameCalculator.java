

package br.ufma.ecp.paradigmas.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameCalculator extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameCalculator(String titulo) {
		super(titulo);
		setLayout(new FlowLayout());
		
		JPanel jpnPeso = new JPanel();
		add(jpnPeso);
		JPanel jpnAltura = new JPanel();
		add(jpnAltura);
		JPanel jpnButtons = new JPanel();
		add(jpnButtons);
		
		jpnPeso.add(new JLabel("Peso: "));
		JTextField txtPeso = new JTextField(15);
		jpnPeso.add(txtPeso);
		
		jpnPeso.add(new JLabel("Altura: "));
		JTextField txtAltura = new JTextField(15);
		jpnPeso.add(txtAltura);
		
		JButton btnCalcular = new JButton("Calcular");
		jpnButtons.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		jpnButtons.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		jpnButtons.add(btnFechar);
		
		//eventos
		
		btnFechar.addActionListener( (ev) -> System.exit(0));
		btnLimpar.addActionListener((ev) -> {
			txtPeso.setText("");
			txtAltura.setText("");
		});
		btnCalcular.addActionListener((ev) -> {
			Float altura = Float.parseFloat(txtAltura.getText());
			Float peso = Float.parseFloat(txtPeso.getText());
			float imc = peso / (altura*altura);
			System.out.println(imc);
		});
		
		
		
	}
}
