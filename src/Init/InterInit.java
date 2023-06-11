package Init;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterInit extends JFrame {

	private static final long serialVersionUID = 4301607527149527509L;

	private JPanel contentPane;

	final MainMenu venata1 = new MainMenu();
	
	public InterInit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(73, 73, 73));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTituloPrincipal = new JLabel("Smart-Color");
		lbTituloPrincipal.setFont(new Font("Broadway", Font.BOLD, 28));
		lbTituloPrincipal.setForeground(new Color(255, 255, 255));
		lbTituloPrincipal.setBounds(111, 32, 241, 56);
		contentPane.add(lbTituloPrincipal);
		
		JButton btEmpezar = new JButton("Empezar");
		btEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				venata1.setVisible(true);
				dispose();
				
			}
		});
		btEmpezar.setBounds(111, 146, 228, 43);
		contentPane.add(btEmpezar);
		
		JLabel lbSubTitulo = new JLabel("Pulsa aquí:");
		lbSubTitulo.setForeground(new Color(255, 255, 255));
		lbSubTitulo.setBounds(111, 129, 67, 14);
		contentPane.add(lbSubTitulo);
	}

}
