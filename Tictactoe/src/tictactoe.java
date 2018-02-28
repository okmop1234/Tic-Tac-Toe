import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.*;  
import javax.swing.*; 
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class tictactoe {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField player1;
	private JTextField player2;
	private JButton btnReset;
	private JLabel label;
	private JTextField textField_9;
	private JLabel label_1;
	private JTextField textField_10;
	boolean playerone;
	boolean playertwo;
	private int count = 0;
	public static boolean player1win = false;
	public static boolean player2win = false;
	private int Redcount = 0;
	private int Bluecount = 0;
	private JLabel image;
	private JLabel image2;
	private JLabel imagem1;
	private JLabel imagem2;
	private JLabel image3;
	private JLabel imagem3;
	private JLabel image4;
	private JLabel imagem4;
	private JLabel image5;
	private JLabel imagem5;
	private JLabel image6;
	private JLabel imagem6;
	private JLabel image7;
	private JLabel imagem7;
	private JLabel image8;
	private JLabel imagem8;
	private JLabel image9;
	private JLabel imagem9;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	public tictactoe() {
		initialize();
	}
	
	
	private void check()
	
	{
		String b1 = textField.getText();
		String b2 = textField_1.getText();
		String b3 = textField_2.getText();
		
		String b4 = textField_3.getText();
		String b5 = textField_4.getText();
		String b6 = textField_5.getText();
		
		String b7 = textField_6.getText();
		String b8 = textField_7.getText();
		String b9 = textField_8.getText();
		
		
		 if (b1.equals("X") && b2.equals("X") && b3.equals("X"))
		
		{
			
			JOptionPane.showMessageDialog(frame, player1.getText() + " win");
			Redcount++;
			score();
			
		}
		
		else if (b1.equals("O") && b2.equals("O") && b3.equals("O")){
			
			JOptionPane.showMessageDialog(frame, player2.getText() + " win" );
			Bluecount++;
			score();
			
		}
		
		else if (b4.equals("X") && b5.equals("X") && b6.equals("X")) {
			
			JOptionPane.showMessageDialog(frame, player1.getText() + " win");
			Redcount++;
			score();
			
		}
		
		else if (b4.equals("O") && b5.equals("O") && b6.equals("O")) {
			
			JOptionPane.showMessageDialog(frame, player2.getText() + " win" );
			Bluecount++;
			score();
			
			
		}
		
		else if (b7.equals("X") && b8.equals("X") && b9.equals("X")) {
			
			JOptionPane.showMessageDialog(frame, player1.getText() + " win");
			Redcount++;
			score();
			
		}
		
		else if (b7.equals("O") && b8.equals("O") && b9.equals("O")) {
			
			JOptionPane.showMessageDialog(frame, player2.getText() + " win");
			Bluecount++;
			score();
			
		}
		
		else if (b1.equals("X") && b5.equals("X") && b9.equals("X")) {
			
			JOptionPane.showMessageDialog(frame, player1.getText() + " win");
			Redcount++;
			score();
			
			
		}
		
		else if (b1.equals("O") && b5.equals("O") && b9.equals("O")) {
			
			JOptionPane.showMessageDialog(frame, player2.getText() + " win");
			Bluecount++;
			score();
			
		}
		
		else if (b3.equals("X") && b5.equals("X") && b7.equals("X")) {
			

			JOptionPane.showMessageDialog(frame, player1.getText() + " win");
			Redcount++;
			score();
			
			
		}
		
		else if (b3.equals("O") && b5.equals("O") && b7.equals("O")) {
			
			JOptionPane.showMessageDialog(frame, player2.getText() + " win");
			Bluecount++;
			score();
			
		}
		
		
		else if (b1.equals("X") && b4.equals("X") && b7.equals("X")) {
			
			JOptionPane.showMessageDialog(frame, player1.getText() + " win");
			Redcount++;
			score();
			
			
		}
		
		else if (b1.equals("O") && b4.equals("O") && b7.equals("O")) {
			

			JOptionPane.showMessageDialog(frame, player2.getText() + " win");
			Bluecount++;
			score();
			
		}
		
		else if (b2.equals("X") && b5.equals("X") && b8.equals("X")) {
			
			JOptionPane.showMessageDialog(frame, player1.getText() + " win");
			Redcount++;
			score();
			
			
		}
		
		else if (b2.equals("O") && b5.equals("O") && b8.equals("O")) {
			
			JOptionPane.showMessageDialog(frame, player2.getText() + " win");
			Bluecount++;
			score();
			
		}
		
		else if (b3.equals("X") && b6.equals("X") && b9.equals("X")) {
			
			JOptionPane.showMessageDialog(frame, player1.getText() + " win");
			Redcount++;
			score();
			
			
		}
		
		else if (b3.equals("O") && b6.equals("O") && b9.equals("O")){
			
			JOptionPane.showMessageDialog(frame, player2.getText() + " win");
			Bluecount++;
			score();
		}
		
		else if (!b1.isEmpty() && !b2.isEmpty() && !b3.isEmpty() && !b4.isEmpty() && !b5.isEmpty() && !b6.isEmpty() && !b7.isEmpty() && !b8.isEmpty() && !b9.isEmpty()){
			
			JOptionPane.showMessageDialog(frame, "Statemate");
			score();
			
		}
		
		
	}
	
	
	private void score(){
		
		textField_9.setText(String.valueOf(Redcount));
		textField_10.setText(String.valueOf(Bluecount));
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_6.setText("");
		textField_7.setText("");
		textField_8.setText("");
		
		image.setVisible(false);
		image2.setVisible(false);
		image3.setVisible(false);
		image4.setVisible(false);
		image5.setVisible(false);
		image6.setVisible(false);
		image7.setVisible(false);
		image8.setVisible(false);
		image9.setVisible(false);
		
		imagem1.setVisible(false);
		imagem2.setVisible(false);
		imagem3.setVisible(false);
		imagem4.setVisible(false);
		imagem5.setVisible(false);
		imagem6.setVisible(false);
		imagem7.setVisible(false);
		imagem8.setVisible(false);
		imagem9.setVisible(false);
		
		
		textField.setBackground(Color.WHITE);
		textField_1.setBackground(Color.WHITE);
		textField_2.setBackground(Color.WHITE);
		textField_3.setBackground(Color.WHITE);
		textField_4.setBackground(Color.WHITE);
		textField_5.setBackground(Color.WHITE);
		textField_6.setBackground(Color.WHITE);
		textField_7.setBackground(Color.WHITE);
		textField_8.setBackground(Color.WHITE);
		
		
		count = 0 ;
		
		
	}

	
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		
			
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				count++;
				if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
					
					
					textField.setText("X");
					textField.setBackground(Color.RED);
					image.setVisible(true);
					
					
					
					
				} else if (count == 2 || count == 4 || count == 6 || count == 8) {
					textField.setText("O");
					textField.setBackground(Color.BLUE);
					imagem1.setVisible(true);
				}
				check();	
				
				
			}
		});
		
		image = new JLabel("New label");
		image.setIconTextGap(2);
		image.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\21.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		image.setVisible(false);
		image.setPreferredSize(new Dimension(22, 14));
		image.setBounds(10, 11, 77, 68);
		frame.getContentPane().add(image);
		
		image2 = new JLabel("New label");
		image2.setIconTextGap(2);
		image2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\21.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		image2.setVisible(false);
		image2.setBounds(10, 90, 77, 68);
		frame.getContentPane().add(image2);
		
		imagem1 = new JLabel("New label");
		imagem1.setIconTextGap(2);
		imagem1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\general.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		imagem1.setVisible(false);
		
		image3 = new JLabel("New label");
		image3.setIconTextGap(2);
		image3.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\21.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		image3.setVisible(false);
		image3.setBounds(10, 169, 77, 68);
		frame.getContentPane().add(image3);
		
		image4 = new JLabel("New label");
		image4.setIconTextGap(2);
		image4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\21.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		image4.setVisible(false);
		image4.setBounds(97, 11, 77, 68);
		frame.getContentPane().add(image4);
		
		image5 = new JLabel("New label");
		image5.setIconTextGap(2);
		image5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\21.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		image5.setVisible(false);
		image5.setBounds(97, 90, 77, 68);
		frame.getContentPane().add(image5);
		
		imagem5 = new JLabel("New label");
		imagem5.setIconTextGap(2);
		imagem5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\general.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		imagem5.setVisible(false);
		
		image6 = new JLabel("New label");
		image6.setIconTextGap(2);
		image6.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\21.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		image6.setVisible(false);
		image6.setBounds(97, 170, 77, 67);
		frame.getContentPane().add(image6);
		
		image7 = new JLabel("New label");
		image7.setIconTextGap(2);
		image7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\21.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		image7.setVisible(false);
		
		image7.setBounds(184, 11, 77, 68);
		frame.getContentPane().add(image7);
		
		image8 = new JLabel("New label");
		image8.setIconTextGap(2);
		image8.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\21.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		image8.setVisible(false);
		image8.setBounds(184, 91, 77, 67);
		frame.getContentPane().add(image8);
		
		image9 = new JLabel("New label");
		image9.setIconTextGap(2);
		image9.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\21.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		image9.setVisible(false);
		image9.setBounds(184, 169, 77, 68);
		frame.getContentPane().add(image9);
		imagem5.setBounds(97, 90, 77, 68);
		frame.getContentPane().add(imagem5);
		imagem1.setBounds(10, 11, 77, 68);
		frame.getContentPane().add(imagem1);
		
		
		
		imagem2 = new JLabel("New label");
		imagem2.setIconTextGap(2);
		imagem2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\general.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		imagem2.setVisible(false);
		imagem2.setBounds(10, 90, 77, 68);
		frame.getContentPane().add(imagem2);
		
		imagem3 = new JLabel("New label");
		imagem3.setIconTextGap(2);
		imagem3.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\general.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		imagem3.setVisible(false);
		imagem3.setBounds(10, 169, 77, 68);
		frame.getContentPane().add(imagem3);
		
		imagem4 = new JLabel("New label");
		imagem4.setIconTextGap(2);
		imagem4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\general.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		imagem4.setVisible(false);
		imagem4.setBounds(97, 11, 77, 68);
		frame.getContentPane().add(imagem4);
		
		imagem6 = new JLabel("New label");
		imagem6.setIconTextGap(2);
		imagem6.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\general.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		imagem6.setVisible(false);
		imagem6.setBounds(97, 169, 77, 68);
		frame.getContentPane().add(imagem6);
		
		imagem7 = new JLabel("New label");
		imagem7.setIconTextGap(2);
		imagem7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\general.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		imagem7.setVisible(false);
		imagem7.setBounds(184, 11, 77, 68);
		frame.getContentPane().add(imagem7);
		
		
		imagem8 = new JLabel("New label");
		imagem8.setIconTextGap(2);
		imagem8.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\general.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		imagem8.setVisible(false);
		imagem8.setBounds(184, 90, 77, 68);
		frame.getContentPane().add(imagem8);
		
		imagem9 = new JLabel("New label");
		imagem9.setIconTextGap(2);
		imagem9.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\general.gif").getImage().getScaledInstance(77, 68, Image.SCALE_DEFAULT)));
		imagem9.setVisible(false);
		imagem9.setBounds(184, 169, 77, 68);
		frame.getContentPane().add(imagem9);
		
		
		
		
		
		
		
		textField.setEnabled(false);
		textField.setBounds(10, 11, 77, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count++;
				if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
					textField_1.setText("X");
					textField_1.setBackground(Color.RED);
					image2.setVisible(true);
					
				} else if (count == 2 || count == 4 || count == 6 || count == 8) {
					textField_1.setText("O");
					textField_1.setBackground(Color.BLUE);
					imagem2.setVisible(true);
					
				}
				check();
				
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 90, 77, 68);
		frame.getContentPane().add(textField_1);
		
		
		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count++;
				if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
					
					
					textField_2.setText("X");
					textField_2.setBackground(Color.RED);
					image3.setVisible(true);
					
					
				} else if (count == 2 || count == 4 || count == 6 || count == 8) {
					textField_2.setText("O");
					textField_2.setBackground(Color.BLUE);
					imagem3.setVisible(true);
					
				}
				check();
				
			}
		});
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(10, 169, 77, 68);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count++;
				if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
					textField_3.setText("X");
					textField_3.setBackground(Color.RED);
					image4.setVisible(true);
					
				} else if (count == 2 || count == 4 || count == 6 || count == 8) {
					textField_3.setText("O");
					textField_3.setBackground(Color.BLUE);
					imagem4.setVisible(true);
				}
				check();
				
				
			}
			}
		);
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(97, 11, 77, 68);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				count++;
				if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
					
					
					textField_4.setText("X");
					textField_4.setBackground(Color.RED);
					image5.setVisible(true);
					
					
				} else if (count == 2 || count == 4 || count == 6 || count == 8) {
					textField_4.setText("O");
					textField_4.setBackground(Color.BLUE);
					imagem5.setVisible(true);
				}
				check();	
			}
		});
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(97, 90, 77, 68);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				count++;
				if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
					
					
					textField_5.setText("X");
					textField_5.setBackground(Color.RED);
					image6.setVisible(true);
					
					
				} else if (count == 2 || count == 4 || count == 6 || count == 8) {
					textField_5.setText("O");
					textField_5.setBackground(Color.BLUE);
					imagem6.setVisible(true);
				}
				check();	
			}
		});
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		textField_5.setBounds(97, 169, 77, 68);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count++;
				if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
					
					textField_6.setText("X");
					textField_6.setBackground(Color.RED);
					image7.setVisible(true);
					
					
				} else if (count == 2 || count == 4 || count == 6 || count == 8) {
					textField_6.setText("O");
					textField_6.setBackground(Color.BLUE);
					imagem7.setVisible(true);
				}
				check();	
			}
		});
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setEnabled(false);
		textField_6.setColumns(10);
		textField_6.setBounds(184, 11, 77, 68);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				count++;
				if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
					
					
					textField_7.setText("X");
					textField_7.setBackground(Color.RED);
					image8.setVisible(true);
					
					
				} else if (count == 2 || count == 4 || count == 6 || count == 8) {
					textField_7.setText("O");
					textField_7.setBackground(Color.BLUE);
					imagem8.setVisible(true);
				}
				check();
					
			}
		});
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		textField_7.setBounds(184, 90, 77, 68);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				count++;
				if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
					
					
					textField_8.setText("X");
					textField_8.setBackground(Color.RED);
					image9.setVisible(true);
					
				} else if (count == 2 || count == 4 || count == 6 || count == 8) {
					textField_8.setText("O");
					textField_8.setBackground(Color.BLUE);
					imagem9.setVisible(true);
				}
				check();	
			}
		});
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		textField_8.setBounds(184, 169, 77, 68);
		frame.getContentPane().add(textField_8);
		
		player1 = new JTextField();
		player1.setBackground(Color.BLACK);
		player1.setFont(new Font("Star Jedi", Font.PLAIN, 11));
		player1.setHorizontalAlignment(SwingConstants.CENTER);
		player1.setBounds(428, 35, 86, 20);
		frame.getContentPane().add(player1);
		player1.setColumns(10);
		
		player2 = new JTextField();
		player2.setBackground(Color.BLACK);
		player2.setFont(new Font("Star Jedi", Font.PLAIN, 11));
		player2.setHorizontalAlignment(SwingConstants.CENTER);
		player2.setColumns(10);
		player2.setBounds(428, 114, 86, 20);
		frame.getContentPane().add(player2);
		
		JLabel lblPlayer = new JLabel("Player 1 :");
		lblPlayer.setFont(new Font("Star Jedi", Font.PLAIN, 11));
		lblPlayer.setForeground(Color.YELLOW);
		lblPlayer.setBounds(327, 38, 91, 14);
		frame.getContentPane().add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("Player 2 :");
		lblPlayer_1.setFont(new Font("Star Jedi", Font.PLAIN, 11));
		lblPlayer_1.setForeground(Color.YELLOW);
		lblPlayer_1.setBounds(327, 117, 91, 14);
		frame.getContentPane().add(lblPlayer_1);
		
		JButton Red = new JButton("JEDI");
		Red.setFont(new Font("Star Jedi", Font.PLAIN, 11));
		Red.setBorderPainted(false);
		Red.setFocusPainted(false);
		Red.setContentAreaFilled(false);
		Red.setForeground(Color.BLUE);
		Red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (playerone == false)
				{
				label.setText(player1.getText());
				label.setForeground(Color.RED);
				playerone = true;
				}
				else{
					playerone = false;
					
					
					
					
				}
				
				
				
			}
		});
		Red.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		Red.setBackground(Color.BLUE);
		Red.setBounds(416, 66, 98, 40);
		frame.getContentPane().add(Red);
		
		JButton Blue = new JButton("SITH");
		Blue.setFont(new Font("Star Jedi", Font.PLAIN, 11));
		Blue.setBorderPainted(false);
		Blue.setFocusPainted(false);
		Blue.setContentAreaFilled(false);
		Blue.setForeground(Color.RED);
		Blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (playertwo == false)
				{
				label_1.setText(player2.getText());
				label_1.setForeground(Color.BLUE);
				playertwo = true;
				}
				else{
					playertwo = false;
					
					
					
				}
				
			}
		});
		Blue.setBackground(Color.RED);
		Blue.setBounds(416, 145, 98, 40);
		frame.getContentPane().add(Blue);
		
		
		
		btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player1.setText("");
				player2.setText("");
				label.setText("Player 1: ");
				label_1.setText("Player 2: ");
				label.setForeground(Color.BLACK);
				label_1.setForeground(Color.BLACK);
				
				image.setVisible(false);
				image2.setVisible(false);
				image3.setVisible(false);
				image4.setVisible(false);
				image5.setVisible(false);
				image6.setVisible(false);
				image7.setVisible(false);
				image8.setVisible(false);
				image9.setVisible(false);
				
				imagem1.setVisible(false);
				imagem2.setVisible(false);
				imagem3.setVisible(false);
				imagem4.setVisible(false);
				imagem5.setVisible(false);
				imagem6.setVisible(false);
				imagem7.setVisible(false);
				imagem8.setVisible(false);
				imagem9.setVisible(false);
				
				
				textField_9.setText("0");
				textField_10.setText("0");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				
				
				textField.setBackground(Color.WHITE);
				textField_1.setBackground(Color.WHITE);
				textField_2.setBackground(Color.WHITE);
				textField_3.setBackground(Color.WHITE);
				textField_4.setBackground(Color.WHITE);
				textField_5.setBackground(Color.WHITE);
				textField_6.setBackground(Color.WHITE);
				textField_7.setBackground(Color.WHITE);
				textField_8.setBackground(Color.WHITE);
				
				
				count = 0 ;
				
				
				
				
			}
		});
		btnReset.setBounds(240, 419, 89, 23);
		frame.getContentPane().add(btnReset);
		
		label = new JLabel("Player 1 :");
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Star Jedi", Font.PLAIN, 11));
		label.setBounds(10, 275, 86, 14);
		frame.getContentPane().add(label);
		
		textField_9 = new JTextField();
		textField_9.setForeground(Color.BLUE);
		textField_9.setBackground(Color.BLACK);
		textField_9.setFont(new Font("Star Jedi", Font.PLAIN, 11));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("0");
		textField_9.setEnabled(false);
		textField_9.setColumns(10);
		textField_9.setBounds(91, 273, 60, 20);
		frame.getContentPane().add(textField_9);
		
		label_1 = new JLabel("Player 2 :");
		label_1.setFont(new Font("Star Jedi", Font.PLAIN, 11));
		label_1.setForeground(Color.YELLOW);
		label_1.setBounds(161, 275, 91, 14);
		frame.getContentPane().add(label_1);
		
		textField_10 = new JTextField();
		textField_10.setForeground(Color.RED);
		textField_10.setBackground(Color.BLACK);
		textField_10.setFont(new Font("Star Jedi", Font.PLAIN, 11));
		textField_10.setText("0");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setToolTipText("");
		textField_10.setEnabled(false);
		textField_10.setColumns(10);
		textField_10.setBounds(240, 273, 60, 20);
		frame.getContentPane().add(textField_10);
		
		JLabel wallpaper = new JLabel("New label");
		wallpaper.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\wallpaper.jpg").getImage().getScaledInstance(544, 453, Image.SCALE_DEFAULT)));
		wallpaper.setBounds(0, 0, 544, 453);
		frame.getContentPane().add(wallpaper);
		
		


		
		
	
		
		
		
	}
}
	
