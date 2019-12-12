package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame{
	public Login() {
		setTitle("CafeManager");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 283);
		this.setLocationRelativeTo(null);
		JComponent contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField tfAccount = new JTextField();
		tfAccount.setBounds(87, 83, 155, 20);
		contentPane.add(tfAccount);
		tfAccount.setColumns(10);
		
		JTextPane txtpnngNhp = new JTextPane();
		txtpnngNhp.setEditable(false);
		txtpnngNhp.setBackground(Color.LIGHT_GRAY);
		txtpnngNhp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnngNhp.setText("\u0110\u0102NG NH\u1EACP");
		txtpnngNhp.setBounds(73, 25, 129, 30);
		contentPane.add(txtpnngNhp);
		
		JTextPane txtpnTiKhon = new JTextPane();
		txtpnTiKhon.setEditable(false);
		txtpnTiKhon.setBackground(Color.LIGHT_GRAY);
		txtpnTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnTiKhon.setText("T\u00E0i kho\u1EA3n:");
		txtpnTiKhon.setBounds(16, 83, 61, 20);
		contentPane.add(txtpnTiKhon);
		
		JTextPane txtpnMtKhu = new JTextPane();
		txtpnMtKhu.setEditable(false);
		txtpnMtKhu.setBackground(Color.LIGHT_GRAY);
		txtpnMtKhu.setText("M\u1EADt kh\u1EA9u:");
		txtpnMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnMtKhu.setBounds(16, 114, 61, 20);
		contentPane.add(txtpnMtKhu);
		
		JPasswordField passwordField = new JPasswordField(10);
		passwordField.setColumns(10);
		passwordField.setBounds(87, 114, 155, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("\u0110\u0103ng nh\u1EADp");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.setVisible(true);
				Login.this.dispose();
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnLogin.setBounds(87, 153, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Tho\u00E1t");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnExit.setBounds(87, 185, 89, 23);
		contentPane.add(btnExit);
		 try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 SwingUtilities.updateComponentTreeUI(this);
	}
}
