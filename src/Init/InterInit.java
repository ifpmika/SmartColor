package Init;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class InterInit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterInit frame = new InterInit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterInit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTitulo = new JLabel("SMART-COLOR");
		lbTitulo.setBounds(0, 11, 424, 29);
		lbTitulo.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbTitulo);
		
		JButton btEmpezar = new JButton("EMPEZAR");
		btEmpezar.setBounds(129, 112, 186, 61);
		btEmpezar.setBackground(new Color(255, 128, 128));
		contentPane.add(btEmpezar);
	}

}
