//Programa para criação de um menu principal
package aula9;

import java.awt.Toolkit;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal extends JFrame {

	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnExemplos;
	private JMenuItem miSair, miBotao;
	
	public GuiMenuPrincipal() {
		inicializarComponentes();
		definirEventos();	
	}

	private void inicializarComponentes() {
		setTitle("Menu Principal");
		setBounds(0,0,800,600);
		contentPane = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Archive");
		mnArquivo.setMnemonic('A');
		mnExemplos = new JMenu("Examples");
		mnExemplos.setMnemonic('E');
		miSair = new JMenuItem("Sair" , new ImageIcon("C://Users//FIC//aula9/sair.jpg"));
		miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
		miBotao = new JMenuItem("Botão :>");
		mnExemplos.add(miBotao);
		mnArquivo.add(miSair);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnExemplos);
		setJMenuBar(mnBarra);
		
	}

	private void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		miBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiBotao botao = new GuiBotao();
				contentPane.removeAll();
				contentPane.add(botao);
				contentPane.validate();
			}
		});
		
	}
	
	public static void abrir() {
		
		GuiMenuPrincipal frame = new GuiMenuPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	
}
