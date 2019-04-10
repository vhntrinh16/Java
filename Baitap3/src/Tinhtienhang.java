import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tinhtienhang extends JFrame {

	private JPanel contentPane;
	private JTextField txtSL;
	private JTextField txtDG;
	private JTextField txtTT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tinhtienhang frame = new Tinhtienhang();
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
	public Tinhtienhang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EDnh gi\u00E1 tr\u1ECB h\u00F3a \u0111\u01A1n");
		lblNewLabel.setBounds(172, 11, 113, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("S\u1ED1 l\u01B0\u1EE3ng:");
		lblNewLabel_1.setBounds(143, 58, 63, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0110\u01A1n gi\u00E1:");
		lblNewLabel_2.setBounds(143, 97, 65, 27);
		contentPane.add(lblNewLabel_2);
		
		txtSL = new JTextField();
		txtSL.setBounds(231, 58, 86, 27);
		contentPane.add(txtSL);
		txtSL.setColumns(10);
		
		txtDG = new JTextField();
		txtDG.setBounds(231, 97, 86, 27);
		contentPane.add(txtDG);
		txtDG.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Th\u00E0nh ti\u1EC1n:");
		lblNewLabel_3.setBounds(143, 135, 63, 27);
		contentPane.add(lblNewLabel_3);
		
		txtTT = new JTextField();
		txtTT.setBounds(231, 138, 86, 27);
		contentPane.add(txtTT);
		txtTT.setColumns(10);
		
		JButton btnTinh = new JButton("T\u00EDnh ti\u1EC1n");
		btnTinh.setBounds(231, 181, 89, 23);
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int dongia = Integer.parseInt(txtDG.getText());
				int soluong = Integer.parseInt(txtSL.getText());
				int thanhtien = dongia * soluong;
				txtTT.setText(String.valueOf(thanhtien));
			}
		});
		contentPane.add(btnTinh);
		
		JLabel lblNewLabel_4 = new JLabel("VN\u0110");
		lblNewLabel_4.setBounds(327, 103, 35, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblVn = new JLabel("VN\u0110");
		lblVn.setBounds(327, 144, 35, 21);
		contentPane.add(lblVn);
	}
}
