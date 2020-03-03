package view;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;

public class Button extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Button(String text) {
		this.setText(text);
		setBorder(new LineBorder(Color.BLACK, 1, true));
		setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
	}

}
