package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Find extends JFrame {
	public Find() {
		setBounds(100, 100, 694, 378);
		this.setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 678, 339);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Món", null, panel, null);
		panel.setLayout(null);

		JButton btnAddFood = new JButton("Thêm");
		btnAddFood.setBounds(10, 11, 89, 46);
		panel.add(btnAddFood);

		JButton btnEditFood = new JButton("Sửa");
		btnEditFood.setBounds(109, 11, 89, 46);
		panel.add(btnEditFood);

		JButton btnDeleteFood = new JButton("Xóa");
		btnDeleteFood.setBounds(208, 11, 89, 46);
		panel.add(btnDeleteFood);

		JButton btnRefresh = new JButton("Làm mới");
		btnRefresh.setBounds(307, 11, 89, 46);
		panel.add(btnRefresh);

		JList list = new JList();
		list.setBounds(20, 269, 366, -191);
		panel.add(list);

		JTextField tfFind = new JTextField();
		tfFind.setBounds(442, 37, 120, 20);
		panel.add(tfFind);
		tfFind.setColumns(10);

		JButton btnFind = new JButton("Tìm");
		btnFind.setBounds(572, 36, 89, 23);
		panel.add(btnFind);

		JTextPane txtpnId = new JTextPane();
		txtpnId.setBackground(UIManager.getColor("Panel.background"));
		txtpnId.setText("ID");
		txtpnId.setBounds(442, 68, 17, 20);
		panel.add(txtpnId);

		JTextField txtIdFood = new JTextField();
		txtIdFood.setEditable(false);
		txtIdFood.setBounds(523, 68, 86, 20);
		panel.add(txtIdFood);
		txtIdFood.setColumns(10);

		JTextPane txtpnTn = new JTextPane();
		txtpnTn.setBackground(UIManager.getColor("Panel.background"));
		txtpnTn.setText("Tên:");
		txtpnTn.setBounds(442, 94, 28, 20);
		panel.add(txtpnTn);

		JTextField tfNameFood = new JTextField();
		tfNameFood.setBounds(523, 94, 120, 20);
		panel.add(tfNameFood);
		tfNameFood.setColumns(10);

		JTextPane txtpnDanhMc = new JTextPane();
		txtpnDanhMc.setBackground(UIManager.getColor("Panel.background"));
		txtpnDanhMc.setText("Danh mục:");
		txtpnDanhMc.setBounds(442, 121, 71, 20);
		panel.add(txtpnDanhMc);

		JComboBox cbCategory = new JComboBox();
		cbCategory.setBounds(523, 121, 120, 20);
		panel.add(cbCategory);

		JTextPane txtpnnGi = new JTextPane();
		txtpnnGi.setBackground(UIManager.getColor("Panel.background"));
		txtpnnGi.setText("Đơn giá:");
		txtpnnGi.setBounds(442, 152, 57, 20);
		panel.add(txtpnnGi);

		JTextField tfUnitFood = new JTextField();
		tfUnitFood.setBounds(523, 152, 120, 20);
		panel.add(tfUnitFood);
		tfUnitFood.setColumns(10);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Hóa đơn", null, panel_1, null);
		panel_1.setLayout(null);
	}
}
