package br.ufma.ecp.paradigmas.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrimeiroSwing extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrimeiroSwing() {
		super();
		setTitle("Primeiro Swing");
		JButton bt = new JButton("Diga Ol�");
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				JOptionPane.showMessageDialog(null, "Ol�!");
			}
		});
		
		setLayout(new FlowLayout());
		setSize(250,60);
		add(bt);
		JButton btfechar = new JButton("Diga Adeus");
		btfechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				System.exit(1);
			}
		});
		
		add(btfechar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}


	
}
