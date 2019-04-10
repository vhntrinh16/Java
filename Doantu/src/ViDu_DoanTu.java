

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViDu_DoanTu extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterWord;
	private JTextField txtRightWord;
	private JTextField txtScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViDu_DoanTu frame = new ViDu_DoanTu();
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
	 
	 String[] word = {"cat", "dog", "lion", "pig", "tiger"};
	 int index = 0;
	 int score = 0;
	 Boolean result = false;
	 
	public ViDu_DoanTu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHinhAnh = new JLabel("New label");
		lblHinhAnh.setBounds(10, 11, 175, 144);
		contentPane.add(lblHinhAnh);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Word");
		lblNewLabel_1.setBounds(208, 21, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		txtEnterWord = new JTextField();
		txtEnterWord.setBounds(292, 18, 86, 20);
		contentPane.add(txtEnterWord);
		txtEnterWord.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Right Word:");
		lblNewLabel_2.setBounds(208, 58, 62, 14);
		contentPane.add(lblNewLabel_2);
		
		txtRightWord = new JTextField();
		txtRightWord.setEditable(false);
		txtRightWord.setBounds(292, 55, 86, 20);
		contentPane.add(txtRightWord);
		txtRightWord.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Score:");
		lblNewLabel_3.setBounds(208, 98, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtScore = new JTextField();
		txtScore.setEditable(false);
		txtScore.setBounds(292, 95, 86, 20);
		contentPane.add(txtScore);
		txtScore.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = 0;
				score = 0;
				txtEnterWord.setText("");
				txtRightWord.setText(null);
				txtScore.setText(null);
				txtEnterWord.requestFocus();
				ImageIcon icon = new ImageIcon("src/hinh anh/" + word[index] + ".jpg");
				icon.setImage(icon.getImage().getScaledInstance(lblHinhAnh.getWidth(), lblHinhAnh.getHeight(), Image.SCALE_SMOOTH));
				lblHinhAnh.setIcon(icon);
				result = false;
			}
		});
		btnStart.setBounds(10, 187, 89, 23);
		contentPane.add(btnStart);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (index <=3)
				{
					index++;
					txtEnterWord.setText(null);
					txtEnterWord.requestFocus();
					ImageIcon icon = new ImageIcon("src/hinh anh/" + word[index] + ".jpg");
					icon.setImage(icon.getImage().getScaledInstance(lblHinhAnh.getWidth(), lblHinhAnh.getHeight(), Image.SCALE_SMOOTH));
					lblHinhAnh.setIcon(icon);
					txtRightWord.setText("");
					result=false;
				}else {
					JOptionPane.showMessageDialog(rootPane, "End !");
				}
			}
		});
		btnNext.setBounds(109, 187, 89, 23);
		contentPane.add(btnNext);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(result == true) return;
				txtRightWord.setText(word[index]);
				if (txtEnterWord.getText().equalsIgnoreCase(word[index])) {
					score +=2;
				}
				txtScore.setText(score + "");
				if (score == 10 ) {
					JOptionPane.showMessageDialog(rootPane, "Congratulations !");
				}
				result = true;
			}
		});
		btnResult.setBounds(257, 187, 89, 23);
		contentPane.add(btnResult);
		
		//Hien thi hinh ban dau
		ImageIcon icon = new ImageIcon("src/hinh anh/cat.jpg");
		icon.setImage(icon.getImage().getScaledInstance(lblHinhAnh.getWidth(), lblHinhAnh.getHeight(), Image.SCALE_SMOOTH));
		lblHinhAnh.setIcon(icon);
		
	}
}
