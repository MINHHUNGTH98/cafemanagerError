package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Staff extends JFrame {
	public Staff() {
		setBounds(100, 100, 414, 289);
		this.setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 398, 256);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(138, 81, 200, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JComponent textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		((JTextField) textField_1).setColumns(10);
		textField_1.setBounds(138, 112, 200, 20);
		panel.add(textField_1);
		
		JTextPane txtpnTnngNhp = new JTextPane();
		txtpnTnngNhp.setEditable(false);
		txtpnTnngNhp.setText("Tên đăng nhập:");
		txtpnTnngNhp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnTnngNhp.setBackground(SystemColor.menu);
		txtpnTnngNhp.setBounds(10, 112, 98, 20);
		panel.add(txtpnTnngNhp);
		
		JTextField textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(138, 143, 200, 20);
		panel.add(textField_2);
		
		JTextPane txtpnMtKhu = new JTextPane();
		txtpnMtKhu.setEditable(false);
		txtpnMtKhu.setText("Mật khẩu:");
		txtpnMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMtKhu.setBackground(SystemColor.menu);
		txtpnMtKhu.setBounds(10, 143, 98, 20);
		panel.add(txtpnMtKhu);
		
		JTextField textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(138, 174, 200, 20);
		panel.add(textField_3);
		
		JTextPane txtpnLNgiQun = new JTextPane();
		txtpnLNgiQun.setEditable(false);
		txtpnLNgiQun.setText("Là người quản lý:");
		txtpnLNgiQun.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnLNgiQun.setBackground(SystemColor.menu);
		txtpnLNgiQun.setBounds(10, 174, 118, 20);
		panel.add(txtpnLNgiQun);
		
		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(138, 51, 27, 20);
		panel.add(textField_4);
		
		JTextPane txtpnMNhnVin = new JTextPane();
		txtpnMNhnVin.setEditable(false);
		txtpnMNhnVin.setText("Mã nhân viên:");
		txtpnMNhnVin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMNhnVin.setBackground(SystemColor.menu);
		txtpnMNhnVin.setBounds(10, 51, 98, 20);
		panel.add(txtpnMNhnVin);
		
		JTextPane txtpnThngTinNhn = new JTextPane();
		txtpnThngTinNhn.setEditable(false);
		txtpnThngTinNhn.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnThngTinNhn.setBackground(UIManager.getColor("Panel.background"));
		txtpnThngTinNhn.setText("Thông tin nhân viên");
		txtpnThngTinNhn.setBounds(118, 11, 178, 29);
		panel.add(txtpnThngTinNhn);
		
		JButton btnAddStaff = new JButton("Thêm");
		btnAddStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnAddStaff.setBounds(39, 215, 89, 23);
		panel.add(btnAddStaff);
		
		JButton btnUpdateStaff = new JButton("Cập nhật");
		btnUpdateStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnUpdateStaff.setBounds(165, 215, 89, 23);
		panel.add(btnUpdateStaff);
		
		JButton btnDeleteStaff = new JButton("Xóa");
		btnDeleteStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnDeleteStaff.setBounds(287, 215, 89, 23);
		panel.add(btnDeleteStaff);
		
		JTextPane txtpnTnNhnVin = new JTextPane();
		txtpnTnNhnVin.setText("Tên nhân viên:");
		txtpnTnNhnVin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnTnNhnVin.setEditable(false);
		txtpnTnNhnVin.setBackground(SystemColor.menu);
		txtpnTnNhnVin.setBounds(10, 81, 98, 20);
		panel.add(txtpnTnNhnVin);
		
		JButton btnFindStaff = new JButton("Tìm kiếm");
		btnFindStaff.setBounds(249, 51, 89, 23);
		panel.add(btnFindStaff);
	}
}
