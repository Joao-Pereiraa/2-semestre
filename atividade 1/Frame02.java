package semestre2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame02 extends JFrame {

	private JPanel contentPane;
	private JTextField ValorA;
	private JTextField ValorB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame02 frame = new Frame02();
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
	public Frame02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("A:");
		lblA.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		lblA.setBounds(52, 49, 28, 22);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B:");
		lblB.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		lblB.setBounds(52, 82, 28, 27);
		contentPane.add(lblB);
		
		ValorA = new JTextField();
		ValorA.setBounds(78, 52, 99, 20);
		contentPane.add(ValorA);
		ValorA.setColumns(10);
		
		ValorB = new JTextField();
		ValorB.setBounds(78, 82, 99, 20);
		contentPane.add(ValorB);
		ValorB.setColumns(10);
		
		JButton btn1 = new JButton("Mostrar N\u00FAmeros ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String text1 = ValorA.getText();
				String text2 = ValorB.getText();
				int i = Integer.parseInt(text1);
				int j = Integer.parseInt(text2);
				String value = "";
				
				for( int x = i; x <= j; x++){
					if (x > i && x < j){
						value = value + "," +x;
					}
				}
					
				JOptionPane.showMessageDialog(contentPane, "Valores entre "+ i +" e " + j + ": "  + value);
			}
		});
		btn1.setBounds(63, 139, 125, 23);
		contentPane.add(btn1);
	}

}
