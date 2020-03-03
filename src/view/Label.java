package view;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;


import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;

public class Label extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Label() {
		setHorizontalAlignment(SwingConstants.CENTER);
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		setBackground(new Color(255, 228, 196));
		setHorizontalTextPosition(SwingConstants.CENTER);
		setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		setFont(new Font("Microsoft Sans Serif", Font.BOLD, 30));
	}

}
