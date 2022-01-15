package myLottery;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;

import javax.swing.plaf.synth.ColorType;
import javax.tools.Tool;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class initial_gui implements ActionListener,KeyListener{

	// declaring the variables
	private JFrame frame;
	private JTextField textField_num1;
	private JTextField textField_num2;
	private JTextField textField_num3;
	private JTextField textField_num4;
	private JTextField textField_sup;
	private JTextField textField_bet;
	private JToggleButton ToggleButton;
	private JButton btnNewButton;
	 Tolo t = new Tolo();
	protected String s1,s2,s3,s4,s5;
	String betInput;
	ImageIcon images = new ImageIcon(this.getClass().getResource("/logo.PNG"));
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initial_gui window = new initial_gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public initial_gui() {
		initialize();
		
	}
	// forcing user to enter integer values only by limiting his options for text
	public void keyTyped(KeyEvent e) {
		char c =e.getKeyChar();
		if( !(Character.isDigit(c) || (c== KeyEvent.VK_BACK_SPACE) ||(c== KeyEvent.VK_DELETE)) ){
			e.consume();	
		}	
	}
	// we are not using these methods but they are indirectly used for backspace etc
	public void keyPressed(KeyEvent e) {
		
	}
	public void keyReleased(KeyEvent e) {
			
		}
	// action listener used by button called drawNumbers
	public void actionPerformed(ActionEvent e) {
	
// takes textfield values and stores them as strings
	s1= textField_num1.getText();
	s2= textField_num2.getText();
	s3= textField_num3.getText();
	s4= textField_num4.getText();
	s5= textField_sup.getText();
	betInput= textField_bet.getText();
	// displaying error messages
	if(s1.length()<=0 || s2.length()<=0 || s3.length()<=0 || s4.length()<=0 || betInput.length()<=0 || (ToggleButton.isSelected() && s5.length() <= 0 )) {
		JOptionPane.showMessageDialog(null, "Fill in all the numbers");
	}
	// I feel this error message is not beneficial for lottery company, if one person wants to loose, we should let him loose
	else if( !(s1.length()<=0 || s2.length()<=0 || s3.length()<=0|| s4.length()<=0) &&
		(s1.equals(s2) ||s1.equals(s3)|| s1.equals(s4) || s2.equals(s3)|| s2.equals(s4) || s3.equals(s4))) {
		JOptionPane.showMessageDialog(null, "Enter different numbers in Bet Numbers ");
	}
	else if(Integer.parseInt(s1)>20 || Integer.parseInt(s2)>20 || Integer.parseInt(s3)>20 || Integer.parseInt(s4)>20 ){
		
		JOptionPane.showMessageDialog(null, "Enter a value less than 20 for Regular Numbers");
	}
	else if(ToggleButton.isSelected() && Integer.parseInt(s5)>10){
		
		JOptionPane.showMessageDialog(null, "Enter a value less than 10 for Super Number");
	}
	else if( betInput.equals("0")){
			
			JOptionPane.showMessageDialog(null, "Enter a value greater than 0 for Bet Amount");
		}
	

	else {
		
	// gives the conditions for using super bet in case user activates it
	if (ToggleButton.isSelected()) {
						 
				SuperBet sb= new SuperBet(s1, s2 , s3 , s4, betInput, s5);
				sb.computeGain();
				result r = new result(String.valueOf(sb.WinAmount));
			    r.result_initialize();
				r.show();
				frame.dispose();
				
		}
	// gives simple bet condition
	 else {
		   
			Bet b = new Bet(s1, s2 , s3 , s4, betInput);
			b.computeGain();
			result r = new result(String.valueOf(b.WinAmount));
			r.result_initialize();
			r.show();
			frame.dispose();

		}
	}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 437, 265);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(images.getImage());
		frame.getContentPane().setBackground(Color.green);
		
		JLabel lblNewLabel = new JLabel("Welcome to the Tolo Interface");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 419, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose your Numbers");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 74, 153, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_num1 = new JTextField();
		textField_num1.addKeyListener(this);
		
		textField_num1.setBounds(10, 104, 23, 20);
		
		frame.getContentPane().add(textField_num1);
		textField_num1.setColumns(10);
		
		textField_num2 = new JTextField();
		textField_num2.addKeyListener(this);
		textField_num2.setColumns(10);
		textField_num2.setBounds(43, 104, 23, 20);
		frame.getContentPane().add(textField_num2);
		
		textField_num3 = new JTextField();
		textField_num3.addKeyListener(this);
		textField_num3.setColumns(10);
		textField_num3.setBounds(76, 104, 23, 20);
		frame.getContentPane().add(textField_num3);
		
		textField_num4 = new JTextField();
		textField_num4.addKeyListener(this);
		textField_num4.setColumns(10);
		textField_num4.setBounds(109, 104, 23, 20);
		frame.getContentPane().add(textField_num4);
		
		JLabel lblNewLabel_2 = new JLabel("Extra Number for Super Bet");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(196, 74, 204, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_sup = new JTextField();
		textField_sup.setEditable(false);
		textField_sup.addKeyListener(this);
		textField_sup.setColumns(10);
		textField_sup.setBounds(206, 104, 23, 20);
		frame.getContentPane().add(textField_sup);
		
	    ToggleButton = new JToggleButton("");
		ToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ToggleButton.isSelected()) {
					
					textField_sup.setEditable(true);
				}
				else {
					textField_sup.setEditable(false);
					
				}
			
			}
		});
		ToggleButton.setBounds(10, 135, 23, 23);
		frame.getContentPane().add(ToggleButton);
		
		JLabel lblNewLabel_3 = new JLabel("Super Bet?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(43, 135, 82, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		btnNewButton = new JButton("Draw Numbers");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(274, 194, 126, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JLabel lblNewLabel_4 = new JLabel("Bet =");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 199, 49, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_bet = new JTextField();
		textField_bet.setBounds(53, 196, 96, 20);
		textField_bet.addKeyListener(this);
		frame.getContentPane().add(textField_bet);
		textField_bet.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Euro");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(159, 199, 49, 14);
		frame.getContentPane().add(lblNewLabel_5);
	}

	private Image image() {
		// TODO Auto-generated method stub
		return null;
	}
}
