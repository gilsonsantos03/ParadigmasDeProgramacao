package br.ufma.ecp.paradigmas.calculadoraimc;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculadoraIMC extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public CalculadoraIMC() {
		super();
		setTitle("CALCULADORA DE IMC");
		setSize(700, 200); //tamanho da janela
		setLayout(new GridLayout(0, 2)); //layout adotado com uma linha e duas colunas
		setDefaultCloseOperation(EXIT_ON_CLOSE); //para fechar a janela
		
		//instanciando os componentes da calculadora
		JTextField textPeso = new JTextField();
		JTextField textAltura = new JTextField();
		JButton calc = new JButton("CALCULAR");
		JButton limpar = new JButton("LIMPAR");
		JButton fechar = new JButton("FECHAR");
		JLabel peso = new JLabel("PESO (KG): ");
		JLabel altura = new JLabel("ALTURA (M): ");
		JLabel resultado = new JLabel("RESULTADO: ");
		
		//adicionando os componentes a janela/frame
		add(peso);
		add(altura);		
		add(textPeso);
		add(textAltura);
		add(resultado);
		add(calc);
		add(limpar);
		add(fechar);
		
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				double weight = Double.parseDouble(textPeso.getText());
				double height = Double.parseDouble(textAltura.getText());
				double imc = (weight/Math.pow(height, 2));
				
				//vamos formatar a saída de modo que tenhamos controle na qtd de casas decimais
				DecimalFormat form = new DecimalFormat("#0.0");
				String result = "RESULTADO: " + form.format(imc);
				
				if(imc < 18.5){
                    result += " ABAIXO DO PESO!";
                }
                else if(imc < 24.9){
                    result += " PESO IDEAL!";
                }
                else if(imc < 29.9){
                    result += " LEVEMENTE ACIMA DO PESO!";
                }
                else if(imc < 34.9){
                    result += " PRIMEIRO GRAU DE OBESIDADE!";
                }
                else if(imc < 39.9){
                    result += " SEGUNDO GRAU DE OBESIDADE!";
                }
                else
                    result += " OBESIDADE MÓRBIDA!";
				
				resultado.setText(result);
			}
		});
		
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				resultado.setText("");
				textPeso.setText("");
				textAltura.setText("");
			}
		});
		
		fechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				System.exit(1);
			}
		});
	}
	
}
