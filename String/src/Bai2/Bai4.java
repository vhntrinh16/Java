package Bai2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtsb;
	private JTextField txtsb1;
	private JTextField txtsb2;
	private JTextField txtVTchen;
	private JTextField txtVTdau;
	private JTextField txtVTcuoi;
	private JTextArea txtaResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai4 frame = new Bai4();
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
	public Bai4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 413);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		JTextArea txtaResult = new JTextArea();
		txtaResult.setBounds(175, 287, 174, 59);
		contentPane.add(txtaResult);
		
		JLabel lblNewLabel = new JLabel("Chu\u1ED7i sb");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(82, 21, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblChuiSb = new JLabel("Chu\u1ED7i sb1");
		lblChuiSb.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChuiSb.setBounds(82, 60, 60, 14);
		contentPane.add(lblChuiSb);
		
		JLabel lblChuiSb_1 = new JLabel("Chu\u1ED7i sb2");
		lblChuiSb_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChuiSb_1.setBounds(82, 100, 60, 14);
		contentPane.add(lblChuiSb_1);
		
		JLabel lblVTrChn = new JLabel("V\u1ECB tr\u00ED ch\u00E8n");
		lblVTrChn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVTrChn.setBounds(82, 136, 60, 14);
		contentPane.add(lblVTrChn);
		
		JLabel lblVTru = new JLabel("V\u1ECB tr\u00ED \u0111\u1EA7u");
		lblVTru.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVTru.setBounds(82, 172, 60, 14);
		contentPane.add(lblVTru);
		
		JLabel lblVTrCui = new JLabel("V\u1ECB tr\u00ED cu\u1ED1i");
		lblVTrCui.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVTrCui.setBounds(82, 208, 60, 14);
		contentPane.add(lblVTrCui);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKtQu.setBounds(82, 292, 46, 14);
		contentPane.add(lblKtQu);
		
		txtsb = new JTextField();
		txtsb.setBounds(175, 18, 174, 20);
		contentPane.add(txtsb);
		txtsb.setColumns(10);
		
		txtsb1 = new JTextField();
		txtsb1.setColumns(10);
		txtsb1.setBounds(175, 57, 174, 20);
		contentPane.add(txtsb1);
		
		txtsb2 = new JTextField();
		txtsb2.setColumns(10);
		txtsb2.setBounds(175, 97, 174, 20);
		contentPane.add(txtsb2);
		
		txtVTchen = new JTextField();
		txtVTchen.setColumns(10);
		txtVTchen.setBounds(175, 133, 174, 20);
		contentPane.add(txtVTchen);
		
		txtVTdau = new JTextField();
		txtVTdau.setColumns(10);
		txtVTdau.setBounds(175, 169, 174, 20);
		contentPane.add(txtVTdau);
		
		txtVTcuoi = new JTextField();
		txtVTcuoi.setColumns(10);
		txtVTcuoi.setBounds(175, 205, 174, 20);
		contentPane.add(txtVTcuoi);
		
		JButton btnXuly = new JButton("X\u1EED l\u00FD chu\u1ED7i");
		btnXuly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sb = txtsb.getText();
				String sb1 =  txtsb1.getText();
				String sb2 = txtsb2.getText();
				
				int vitri = Integer.parseInt(txtVTchen.getText());
				int batdau = Integer.parseInt(txtVTdau.getText());
				int ketthuc = Integer.parseInt(txtVTcuoi.getText());
				
				String ketQua = "Kết quả: ";
				
				StringBuilder str = new StringBuilder(200);
				str.append(sb);
				
				ketQua += "\nChuỗi sb: " + sb;
				ketQua += "\nChiều dài: " + str.length();
				str.append(sb1);
				ketQua += "\nChuỗi sb sau khi nối sb1: " + sb;
				ketQua += "\nChiều dài: " +str.length();
				str.insert(vitri, sb2);
				ketQua += "\nSau khi chèn sb2 vào vị trí" +vitri + ": \n" + str;
				str.delete(batdau, ketthuc);
				ketQua += "\nSau khi xóa: \n" +str;
				str.reverse();
				ketQua += "\nSau khi đảo ngược: \n" +str;
				txtaResult.setText(String.valueOf(ketQua));
			}
		});
		btnXuly.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnXuly.setBounds(175, 242, 89, 23);
		contentPane.add(btnXuly);
		
		JTextArea txtaResult = new JTextArea();
		txtaResult.setBounds(175, 287, 174, 59);
		contentPane.add(txtaResult);
	}
}
