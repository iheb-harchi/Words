package controller;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.Collator;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import view.Label;
import view.View;


public class Controller {
	int level;
	View frame;
	Data data = new Data();
	String[] charList = new String[10];
	public int getLevel() {
		return level;
	}
public Controller(int level) {
	this.level= level;
frame = new View();

	initialisePanel();
	addActions();
	frame.setVisible(true);
}

private void initialisePanel() {

	System.err.println(level);
	Frage frage = Data.fragenList[level];
	frame.getLblScore().setText((level+1)+"");
	fillLblAnswer( frage );
	fillAnswerLbl(frage.getAnswer().length());
	fillCharList(frage);
	fillBtn(frage);

	
}


private void addActions() {
	
	frame.getBtnNext().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			level++;
			initialisePanel();
			frame.getBtnNext().setEnabled(false);
			
		}
	});
	
	frame.getNewgame().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			level=0;
			initialisePanel();
			
		}
	});
	
	
}

private void fillLblAnswer(Frage frage ) {
	
	frame.getLblFrage().setText(frage.getText());
}
private void fillBtn(Frage frage) {
	frame.getPnlChoice().removeAll();
		for (int i = 0; i < charList.length; i++) {
			Button btn = new Button(charList[i]);
			btn.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 30));
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for (Component com : frame.getPnlAnswer().getComponents()) {
						if(((Label)com).getText().equals("")) {
							((Label) com).setText(e.getActionCommand());
							btn.setEnabled(false);
							break;
						}
					}
					if(isAllFull()) {
					if(isRight(frage)) {
						frame.getPnlAnswer().setBackground(Color.green);
						frame.getPnlChoice().setEnabled(false);
						frame.getPnlAnswer().setEnabled(false);
						frame.getBtnNext().setEnabled(true);
						frame.repaint();
					}else {
						frame.getPnlAnswer().setBackground(Color.red);
					}
					
				}
				}

				private boolean isAllFull() {
					for (Component com : frame.getPnlAnswer().getComponents()) {
						if(((Label)com).getText().equals("")) {
							return false;
						}
						}
					return true;
					
				}

				private boolean isRight(Frage frage) {
				StringBuilder sb = new StringBuilder();
					for (Component com : frame.getPnlAnswer().getComponents()) {
						sb.append(((Label) com).getText());
						}
					String labelString  = Normalizer.normalize(sb.toString(), Normalizer.Form.NFKD);
					String answer  = Normalizer.normalize(frage.getAnswer(), Normalizer.Form.NFKD);
		
		return labelString.equals(answer);
				}
			});
			frame.getPnlChoice().add(btn);
		}
}

private void fillCharList(Frage frage) {
	String ant = frage.getAnswer();
	List<String> charArrayLIst = new ArrayList<>();
	for (int i = 0; i < ant.length(); i++) {
		charArrayLIst.add( ant.charAt(i) +"");
	}
	
	for (int i = 0; i < (10-ant.length()); i++) {
		Random rand = new Random();
		int randomIndex = rand.nextInt(Data.alphabet.length);
		charArrayLIst.add(Data.alphabet[randomIndex]);
		
	}
	Collections.shuffle(charArrayLIst);
	for (int i = 0; i < charArrayLIst.size(); i++) {
		charList[i]=charArrayLIst.get(i);
	}
	
}

private void fillAnswerLbl(int length) {
	frame.getPnlAnswer().removeAll();
	frame.getPnlAnswer().setBackground(new Color(255, 250, 205));
	for (int i = 0; i < length; i++) {
		Label label = new Label();
		
		frame.getPnlAnswer().add(label);
		
		label.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				for (Component com : frame.getPnlChoice().getComponents()) {
					if(!((Button) com).isEnabled() && ((Button) com).getActionCommand().equals(label.getText())) {
						((Button) com).setEnabled(true);
						label.setText("");
						break;
					}
					
					
				}
				frame.getPnlAnswer().setBackground(new Color(255, 250, 205));
				
			}
		});
	}
	
}


	
}
