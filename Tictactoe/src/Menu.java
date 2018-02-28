import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void Menu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe window = new tictactoe();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTicTacToe = new JLabel("\r\n\r\n\r\nTic Tac Toe\r\n");
		lblTicTacToe.setForeground(Color.YELLOW);
		lblTicTacToe.setBackground(new Color(255, 255, 255));
		lblTicTacToe.setFont(new Font("Star Jedi", Font.BOLD | Font.ITALIC, 18));
		lblTicTacToe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicTacToe.setBounds(50, 11, 328, 88);
		frame.getContentPane().add(lblTicTacToe);
		
		JButton btnNewButton = new JButton("Versus");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu window = new Menu();
				frame.dispose();
				window.main();
				
			}
		});
		btnNewButton.setFont(new Font("Source Code Pro", Font.PLAIN, 11));
		btnNewButton.setBounds(30, 110, 124, 88);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Singleplayer");
		btnNewButton_1.setFont(new Font("Source Code Pro", Font.PLAIN, 11));
		btnNewButton_1.setBounds(277, 109, 124, 88);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\Anakin.gif").getImage().getScaledInstance(434, 262, Image.SCALE_DEFAULT)));
		lblNewLabel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(lblNewLabel);
	}
}
