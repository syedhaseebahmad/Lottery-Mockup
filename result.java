package myLottery;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
public class result extends JFrame {

	private JPanel contentPane;
	Tolo t = new Tolo();
	static String s;
	ImageIcon images = new ImageIcon(this.getClass().getResource("/logo.PNG"));
	String win;

	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					result frame = new result(s);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public result(String win) {
		this.win= win;
		

	}
	public void result_initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(0x00FF00));
		setIconImage(images.getImage());
		
		JLabel lblNewLabel = new JLabel("Results for the last draw");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(52, 22, 344, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Regular Numbers");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 83, 129, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Super Number");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(267, 83, 129, 20);
		contentPane.add(lblNewLabel_1_1);
		// takes values from tolo of real lottery numbers and displays them
		JLabel lblNewLabel_n1 = new JLabel(t.winningNumbers.get(0).toString());
		lblNewLabel_n1.setBounds(10, 114, 21, 23);
		contentPane.add(lblNewLabel_n1);
		// takes values from tolo of real lottery numbers and displays them
		JLabel lblNewLabel_n2 = new JLabel(t.winningNumbers.get(1).toString());
		lblNewLabel_n2.setBounds(36, 114, 21, 23);
		contentPane.add(lblNewLabel_n2);
		// takes values from tolo of real lottery numbers and displays them
		JLabel lblNewLabel_n3 = new JLabel(t.winningNumbers.get(2).toString());
		lblNewLabel_n3.setBounds(66, 114, 21, 23);
		contentPane.add(lblNewLabel_n3);
		// takes values from tolo of real lottery numbers and displays them
		JLabel lblNewLabel_n4 = new JLabel(t.winningNumbers.get(3).toString());
		lblNewLabel_n4.setBounds(97, 114, 21, 23);
		contentPane.add(lblNewLabel_n4);
	    // takes value of actual super number of lottery and displays them	
		JLabel lblNewLabel_super = new JLabel(String.valueOf(t.superNumber));
		lblNewLabel_super.setBounds(267, 114, 21, 23);
		contentPane.add(lblNewLabel_super);
		
		JLabel lblNewLabel_2 = new JLabel("Gain = ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 204, 77, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_gain = new JLabel(win);
		lblNewLabel_gain.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_gain.setBounds(66, 215, 65, 17);
		contentPane.add(lblNewLabel_gain);
		
		JLabel lblNewLabel_4 = new JLabel("EURO");
		lblNewLabel_4.setBounds(129, 218, 49, 14);
		contentPane.add(lblNewLabel_4);
	}

}
