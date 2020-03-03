package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import controller.Data;


import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Rectangle;
import java.awt.Component;
import java.awt.Dimension;

public class View extends JFrame {

	public JPanel getContentPane() {
		return contentPane;
	}

	

public JLabel getLblScore() {
	return lblScore;
}
	public JLabel getLblTitle() {
		return lblTitle;
	}

	public JButton getBtnNext() {
		return btnNext;
	}

	public JLabel getLblFrage() {
		return lblFrage;
	}

	public JPanel getPnlAnswer() {
		return pnlAnswer;
	}

	public JPanel getPnlChoice() {
		return pnlChoice;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitle;
	private JButton btnNext;
	private JLabel lblFrage;
	private JPanel pnlAnswer;
	private JPanel pnlChoice;
	private JLabel lblScore;
	private JMenuItem newgame;
	public JMenuItem getNewgame() {
		return newgame;
	}

	private JMenu mnNewMenu;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
					frame.setSize(1050,550);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setTitle("Words");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 513);
		setSize(1050,600);
		setResizable(false);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		 mnNewMenu = new JMenu("Game");
		 mnNewMenu.setForeground(new Color(0, 0, 255));
		 mnNewMenu.setFont(new Font("Microsoft Sans Serif", Font.ITALIC, 15));
		menuBar.add(mnNewMenu);
		
		 newgame = new JMenuItem("new game");
		 newgame.setForeground(new Color(0, 0, 255));
		 newgame.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		newgame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnNewMenu.add(newgame);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("exit");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		mntmNewMenuItem_1.setForeground(new Color(0, 0, 255));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Information");
		mnNewMenu_1.setFont(new Font("Microsoft Sans Serif", Font.ITALIC, 15));
		mnNewMenu_1.setForeground(new Color(0, 0, 255));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("contact");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		mntmNewMenuItem_2.setForeground(new Color(0, 0, 255));
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		contentPane = new JpanelImage("homeww.jpg");
		contentPane.setFont(new Font("Algerian", Font.ITALIC, 30));
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("max(93dlu;default)"),
				ColumnSpec.decode("max(343dlu;default):grow"),
				ColumnSpec.decode("max(77dlu;pref):grow"),},
			new RowSpec[] {
				RowSpec.decode("max(39dlu;default)"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(93dlu;default)"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("top:max(46dlu;default)"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(71dlu;default):grow"),}));
		 
		 lblScore = new JLabel("");
		 lblScore.setForeground(new Color(0, 0, 205));
		 lblScore.setHorizontalTextPosition(SwingConstants.CENTER);
		 lblScore.setBackground(new Color(51, 204, 255));
		 lblScore.setBounds(new Rectangle(4, 4, 4, 4));
		 lblScore.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		 lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		 lblScore.setFont(new Font("Algerian", Font.ITALIC, 60));
		 contentPane.add(lblScore, "1, 1, default, fill");
		
		 lblTitle = new JLabel("WORDS");
		lblTitle.setForeground(new Color(0, 0, 205));
		lblTitle.setBounds(new Rectangle(4, 4, 4, 4));
		lblTitle.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(51, 204, 255)));
		lblTitle.setBackground(new Color(51, 204, 255));
		lblTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Algerian", Font.ITALIC, 60));
		contentPane.add(lblTitle, "2, 1");
		
		 btnNext = new JButton("");
		 btnNext.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 206, 209)));
		 btnNext.setEnabled(false);
		btnNext.setIcon(new ImageIcon("C:\\Users\\ihebh\\Downloads\\nextNn.png"));
		contentPane.add(btnNext, "3, 1");
		
		 lblFrage = new JLabel();
		 lblFrage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrage.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFrage.setBackground(new Color(107, 142, 35));
		lblFrage.setFont(new Font("Microsoft Sans Serif", Font.ITALIC, 25));
		lblFrage.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );
		contentPane.add(lblFrage, "2, 2, 1, 2, fill, top");
		
		 pnlAnswer = new JPanel();
		 pnlAnswer.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		pnlAnswer.setBackground(new Color(255, 250, 205));
		pnlAnswer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		contentPane.add(pnlAnswer, "2, 5, fill, fill");
		pnlAnswer.setLayout(new GridLayout(1,10));
		
		 pnlChoice = new JPanel();
		pnlChoice.setBackground(new Color(240, 248, 255));
		pnlChoice.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		contentPane.add(pnlChoice, "2, 7, fill, fill");
		pnlChoice.setLayout(new GridLayout(2,5));
	}

}
