package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Stat extends JFrame{
	public Stat() {
		setBounds(100, 100, 521, 378);
		this.setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 505, 339);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Doanh thu", null, panel, null);
		panel.setLayout(null);
		
		JTextPane txtpnT = new JTextPane();
		txtpnT.setBackground(UIManager.getColor("Panel.background"));
		txtpnT.setText("Từ");
		txtpnT.setBounds(24, 11, 19, 20);
		panel.add(txtpnT);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(53, 11, 121, 20);
		panel.add(comboBox);
		
		JTextPane txtpnn = new JTextPane();
		txtpnn.setBackground(UIManager.getColor("Panel.background"));
		txtpnn.setText("Đến");
		txtpnn.setBounds(194, 11, 32, 20);
		panel.add(txtpnn);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(239, 11, 121, 20);
		panel.add(comboBox_1);
		
		JButton btnThngK = new JButton("Thống kê");
		btnThngK.setBounds(389, 11, 89, 23);
		panel.add(btnThngK);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Món", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextPane txtpnMnaThch = new JTextPane();
		txtpnMnaThch.setBackground(UIManager.getColor("Panel.background"));
		txtpnMnaThch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnMnaThch.setEditable(false);
		txtpnMnaThch.setText("Món ưa thích");
		txtpnMnaThch.setBounds(75, 29, 120, 20);
		panel_1.add(txtpnMnaThch);
		
		JTextPane txtpnMntThch = new JTextPane();
		txtpnMntThch.setText("Món ít thích");
		txtpnMntThch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnMntThch.setEditable(false);
		txtpnMntThch.setBackground(SystemColor.menu);
		txtpnMntThch.setBounds(298, 29, 120, 20);
		panel_1.add(txtpnMntThch);
	}
}
