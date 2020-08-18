package semestre2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Frame01 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNome2;
	String login = "admin";
	String senha = "swordfish";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame01 frame = new Frame01();
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
	public Frame01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOK = new JButton("ok");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtNome.getText().equals(login)& txtNome2.getText().equals(senha) ){
					JOptionPane.showMessageDialog(contentPane, "login correto");
				}
				else{
					JOptionPane.showMessageDialog(contentPane, "login Incorreto");
				}
				
				
			}
			
		});
		btnOK.setBounds(97, 137, 89, 23);
		contentPane.add(btnOK);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(52, 42, 46, 17);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(52, 91, 46, 14);
		contentPane.add(lblSenha);
		
		txtNome = new JTextField();
		txtNome.setBounds(97, 42, 114, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNome2 = new JTextField();
		txtNome2.setBounds(97, 88, 114, 20);
		contentPane.add(txtNome2);
		txtNome2.setColumns(10);
		
		
}}

