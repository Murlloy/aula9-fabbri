//Criação de botais
package aula9;

import java.awt.Toolkit;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class GuiBotao extends JPanel{
	
	private JButton btMensagem, btTeimoso;
	private ImageIcon imageIcon1;
	
	public GuiBotao() {
		inicializarComponentes();
		definirEventos();	
	}

	private void inicializarComponentes() {
		setLayout(null);
		imageIcon1 = new ImageIcon("C://Users//FIC//aula9//java.jpg");
		btMensagem = new JButton("Mensagem", imageIcon1);
		btMensagem.setBounds(50, 20, 140, 38);
		btMensagem.setMnemonic(KeyEvent.VK_M);
		btMensagem.setToolTipText("Clique aqui para ver a mensagem!!");
		btTeimoso = new JButton("Teimoso");
		btTeimoso.setBounds(50, 70, 100, 25);
		add(btTeimoso);
		add(btMensagem);
		
	}
	
	private void definirEventos() {
		btMensagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Você descobriu a mensagem!!", "Mensagem Secreta", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		btTeimoso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Não!!", "Não!!", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		btTeimoso.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
				btTeimoso.setBounds(50, 120, 100, 25);
			}
			public void mouseExited(MouseEvent e) {
				btTeimoso.setBounds(50, 70, 100, 25);
			}
		});
	}

}
