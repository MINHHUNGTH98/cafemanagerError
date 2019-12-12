package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame{
	public Home() {
		setTitle("CafeManager");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 388);
		this.setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 183, 21);
		contentPane.add(menuBar);
		
		JMenu mnFind = new JMenu("T\u00ECm ki\u1EBFm");
		mnFind.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Find find = new Find();
				find.setVisible(true);
			}
		});
		menuBar.add(mnFind);
		
		JMenu mnStat = new JMenu("Th\u1ED1ng k\u00EA");
		mnStat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Stat stat = new Stat();
				stat.setVisible(true);
			}
		});
		menuBar.add(mnStat);
		
		JMenu mnStaff = new JMenu("Nh\u00E2n vi\u00EAn");
		mnStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Staff staff = new Staff();
				staff.setVisible(true);
			}
		});
		menuBar.add(mnStaff);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Panel.background"));
		panel.setBounds(1, 25, 211, 313);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox cbCategory = new JComboBox();
		cbCategory.setBounds(78, 11, 114, 20);
		panel.add(cbCategory);
		
		JTextPane txtpnLoi = new JTextPane();
		txtpnLoi.setBounds(10, 11, 58, 20);
		panel.add(txtpnLoi);
		txtpnLoi.setBackground(UIManager.getColor("Panel.background"));
		txtpnLoi.setEditable(false);
		txtpnLoi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnLoi.setText("Lo\u1EA1i:");
		
		JTextPane txtpnMn = new JTextPane();
		txtpnMn.setBounds(10, 41, 58, 20);
		panel.add(txtpnMn);
		txtpnMn.setBackground(UIManager.getColor("Panel.background"));
		txtpnMn.setEditable(false);
		txtpnMn.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnMn.setText("M\u00F3n:");
		
		JComboBox cbFood = new JComboBox();
		cbFood.setBounds(78, 39, 114, 20);
		panel.add(cbFood);
		
		JButton btnThmMn = new JButton("Th\u00EAm m\u00F3n");
		btnThmMn.setBounds(78, 70, 114, 23);
		panel.add(btnThmMn);
		
		JButton btnGimGi = new JButton("Gi\u1EA3m gi\u00E1");
		btnGimGi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnGimGi.setBounds(10, 105, 120, 23);
		panel.add(btnGimGi);
		
		JButton btnChuynnBn = new JButton("Chuy\u1EC3n \u0111\u1EBFn");
		btnChuynnBn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnChuynnBn.setBounds(10, 139, 120, 23);
		panel.add(btnChuynnBn);
		
		JSpinner spDiscount = new JSpinner();
		spDiscount.setBounds(146, 105, 46, 20);
		panel.add(spDiscount);
		
		JComboBox cbSwitchTable = new JComboBox();
		cbSwitchTable.setBounds(140, 139, 52, 20);
		panel.add(cbSwitchTable);
		
		JTextPane txtpnTngTin = new JTextPane();
		txtpnTngTin.setBackground(UIManager.getColor("Panel.background"));
		txtpnTngTin.setEditable(false);
		txtpnTngTin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtpnTngTin.setText("T\u1ED5ng ti\u1EC1n");
		txtpnTngTin.setBounds(53, 176, 88, 28);
		panel.add(txtpnTngTin);
		
		JTextField tfTotal = new JTextField();
		tfTotal.setText("0");
		tfTotal.setHorizontalAlignment(SwingConstants.CENTER);
		tfTotal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		tfTotal.setBounds(53, 215, 86, 28);
		panel.add(tfTotal);
		tfTotal.setColumns(10);
		
		JButton btnPayment = new JButton("Thanh to\u00E1n");
		btnPayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnPayment.setBounds(24, 254, 146, 48);
		panel.add(btnPayment);
		
		JSpinner spCount = new JSpinner();
		spCount.setBounds(10, 72, 52, 20);
		panel.add(spCount);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(216, 25, 294, 313);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(516, 25, 321, 313);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		ImageIcon iconFull; // neu co khach thi doi mau
		Image imgFull = new ImageIcon(Home.class.getResource("/images/table_full.png")).getImage();
		iconFull = new ImageIcon(imgFull);
		
		JLabel lblTable = new JLabel("Table");
		lblTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblTable.setIcon(iconFull);
			}
		});
		lblTable.setBounds(20, 28, 65, 60);
		ImageIcon iconEmpty = new ImageIcon();
		Image img = new ImageIcon(Home.class.getResource("/images/table_empty.png")).getImage();
		iconEmpty = new ImageIcon(img);
		lblTable.setIcon(iconEmpty);
		panel_2.add(lblTable);
		
		JTextPane txtpnBn = new JTextPane();
		txtpnBn.setText("Bàn 2");
		txtpnBn.setEditable(false);
		txtpnBn.setBackground(SystemColor.menu);
		txtpnBn.setBounds(113, 89, 39, 20);
		panel_2.add(txtpnBn);
		
		JLabel label = new JLabel("Table");
		label.setBounds(95, 28, 65, 60);
		label.setIcon(iconEmpty);
		panel_2.add(label);
		
		JTextPane txtpnBn_1 = new JTextPane();
		txtpnBn_1.setText("Bàn 3");
		txtpnBn_1.setEditable(false);
		txtpnBn_1.setBackground(SystemColor.menu);
		txtpnBn_1.setBounds(188, 89, 39, 20);
		panel_2.add(txtpnBn_1);
		
		JLabel label_1 = new JLabel("Table");
		label_1.setBounds(170, 28, 65, 60);
		label_1.setIcon(iconEmpty);
		panel_2.add(label_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Bàn 1");
		textPane_2.setEditable(false);
		textPane_2.setBackground(SystemColor.menu);
		textPane_2.setBounds(41, 89, 39, 20);
		panel_2.add(textPane_2);
		
		JLabel label_2 = new JLabel("Table");
		label_2.setBounds(20, 120, 65, 60);
		label_2.setIcon(iconEmpty);
		panel_2.add(label_2);
		
		JTextPane txtpnBn_3 = new JTextPane();
		txtpnBn_3.setText("Bàn 6");
		txtpnBn_3.setEditable(false);
		txtpnBn_3.setBackground(SystemColor.menu);
		txtpnBn_3.setBounds(113, 181, 39, 20);
		panel_2.add(txtpnBn_3);
		
		JLabel label_3 = new JLabel("Table");
		label_3.setBounds(95, 120, 65, 60);
		label_3.setIcon(iconEmpty);
		panel_2.add(label_3);
		
		JTextPane txtpnBn_4 = new JTextPane();
		txtpnBn_4.setText("Bàn 7");
		txtpnBn_4.setEditable(false);
		txtpnBn_4.setBackground(SystemColor.menu);
		txtpnBn_4.setBounds(188, 181, 39, 20);
		panel_2.add(txtpnBn_4);
		
		JLabel label_4 = new JLabel("Table");
		label_4.setBounds(170, 120, 65, 60);
		label_4.setIcon(iconEmpty);
		panel_2.add(label_4);
		
		JTextPane txtpnBn_2 = new JTextPane();
		txtpnBn_2.setText("Bàn 5");
		txtpnBn_2.setEditable(false);
		txtpnBn_2.setBackground(SystemColor.menu);
		txtpnBn_2.setBounds(41, 181, 39, 20);
		panel_2.add(txtpnBn_2);
		
		JLabel label_5 = new JLabel("Table");
		label_5.setBounds(245, 28, 65, 60);
		label_5.setIcon(iconEmpty);
		panel_2.add(label_5);
		
		JTextPane txtpnBn_5 = new JTextPane();
		txtpnBn_5.setText("Bàn 4");
		txtpnBn_5.setEditable(false);
		txtpnBn_5.setBackground(SystemColor.menu);
		txtpnBn_5.setBounds(263, 89, 39, 20);
		panel_2.add(txtpnBn_5);
		
		JLabel label_6 = new JLabel("Table");
		label_6.setBounds(245, 120, 65, 60);
		label_6.setIcon(iconEmpty);
		panel_2.add(label_6);
		
		JTextPane txtpnBn_6 = new JTextPane();
		txtpnBn_6.setText("Bàn 8");
		txtpnBn_6.setEditable(false);
		txtpnBn_6.setBackground(SystemColor.menu);
		txtpnBn_6.setBounds(263, 181, 39, 20);
		panel_2.add(txtpnBn_6);
		
		JLabel label_7 = new JLabel("Table");
		label_7.setBounds(20, 212, 65, 60);
		label_7.setIcon(iconEmpty);
		panel_2.add(label_7);
		
		JTextPane txtpnBn_7 = new JTextPane();
		txtpnBn_7.setText("Bàn 9");
		txtpnBn_7.setEditable(false);
		txtpnBn_7.setBackground(SystemColor.menu);
		txtpnBn_7.setBounds(41, 273, 39, 20);
		panel_2.add(txtpnBn_7);
		
		JLabel label_8 = new JLabel("Table");
		label_8.setBounds(95, 212, 65, 60);
		label_8.setIcon(iconEmpty);
		panel_2.add(label_8);
		
		JTextPane txtpnBn_8 = new JTextPane();
		txtpnBn_8.setText("Bàn 10");
		txtpnBn_8.setEditable(false);
		txtpnBn_8.setBackground(SystemColor.menu);
		txtpnBn_8.setBounds(113, 273, 39, 20);
		panel_2.add(txtpnBn_8);
		
		JLabel label_9 = new JLabel("Table");
		label_9.setBounds(170, 212, 65, 60);
		label_9.setIcon(iconEmpty);
		panel_2.add(label_9);
		
		JTextPane txtpnBn_9 = new JTextPane();
		txtpnBn_9.setText("Bàn 11");
		txtpnBn_9.setEditable(false);
		txtpnBn_9.setBackground(SystemColor.menu);
		txtpnBn_9.setBounds(188, 273, 39, 20);
		panel_2.add(txtpnBn_9);
		
		JLabel label_10 = new JLabel("Table");
		label_10.setBounds(245, 212, 65, 60);
		label_10.setIcon(iconEmpty);
		panel_2.add(label_10);
		
		JTextPane txtpnBn_10 = new JTextPane();
		txtpnBn_10.setText("Bàn 12");
		txtpnBn_10.setEditable(false);
		txtpnBn_10.setBackground(SystemColor.menu);
		txtpnBn_10.setBounds(263, 273, 39, 20);
		panel_2.add(txtpnBn_10);
		
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
