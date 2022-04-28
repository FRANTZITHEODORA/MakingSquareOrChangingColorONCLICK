import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
	
	//2 йоулпиа то ема ма свглатифеи тетяацымо, то акко ма то целифеи вяыла
	
	//амоицы йаимоуяцио PROJECT, пяосхеты GUI (src - NEW - OTHER - WINDOW BUILDER - Application Window 
	// жтиавмы цяажийа : (BUTTON) btnFont : ЖЭМТО - (BUTTON) btnSquare : ТЕТЯэЦЫМО - (JPANEL) panel
	//дипко йкий се btnFont : panel.setBackground(Color.ORANGE);
	//дипко йкий се btnSquare : panel.setBorder(BorderFactory.createLineBorder(Color.black));

	protected static final Component Border = null;
	private JFrame frame;
	protected JFrame panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(116, 29, 183, 138);
		frame.getContentPane().add(panel);
		
		JButton btnSquare = new JButton("\u03C4\u03B5\u03C4\u03C1\u03AC\u03B3\u03C9\u03BD\u03BF");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBorder(BorderFactory.createLineBorder(Color.black));
			}
		});
		btnSquare.setBounds(24, 194, 89, 23);
		frame.getContentPane().add(btnSquare);
		
		JButton btnFont = new JButton("\u03C6\u03CC\u03BD\u03C4\u03BF");
		btnFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.ORANGE);
			}
		});
		btnFont.setBounds(306, 194, 89, 23);
		frame.getContentPane().add(btnFont);
		
		
}
}
