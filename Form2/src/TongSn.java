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

public class TongSn extends JFrame {

	private JPanel contentPane;
	private JTextField txtSn1;
	private JTextField txtSn2;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TongSn frame = new TongSn();
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
	public TongSn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbSn1 = new JLabel("S\u1ED1 nguy\u00EAn th\u1EE9 nh\u1EA5t");
		lbSn1.setBounds(49, 25, 104, 26);
		contentPane.add(lbSn1);
		
		JLabel lblNewLabel_1 = new JLabel("S\u1ED1 nguy\u00EAn th\u1EE9 hai");
		lblNewLabel_1.setBounds(49, 62, 104, 17);
		contentPane.add(lblNewLabel_1);
		
		txtSn1 = new JTextField();
		txtSn1.setBounds(163, 28, 91, 20);
		contentPane.add(txtSn1);
		txtSn1.setColumns(10);
		
		txtSn2 = new JTextField();
		txtSn2.setBounds(163, 60, 91, 20);
		contentPane.add(txtSn2);
		txtSn2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("K\u1EBFt Qu\u1EA3");
		lblNewLabel_2.setBounds(49, 97, 62, 17);
		contentPane.add(lblNewLabel_2);
		
		txtKQ = new JTextField();
		txtKQ.setBounds(163, 95, 91, 20);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
		
		JButton btnTong = new JButton("T\u1ED5ng");
		btnTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					int so1 = Integer.parseInt(txtSn1.getText());
					int so2 = Integer.parseInt(txtSn2.getText());
					int kq = so1 + so2;
					//txtKQ.setText(kq + "");
					//txtKQ.setText(Integer.toString(kq));
					txtKQ.setText(String.valueOf(kq));
				}catch(NumberFormatException e) {
					
				}
			}
		});
		btnTong.setBounds(165, 140, 89, 23);
		contentPane.add(btnTong);
	}
}
