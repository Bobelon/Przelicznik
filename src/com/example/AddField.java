package com.example;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Klasa tworzy przyciski i pola dla klasy Window, oraz oblicza ich po³o¿enie na podstawie rozmiarów okna
 */

public class AddField {
	
	// Odleg³oœæ elementu od krawêdzi okna
		private int marginLeftRight;
		private int marginTopBottom;
		
	// Wysokoœæ i szerokoœæ okna
		private int windowWidth;
		private int windowHeight;
		
	// Wysokoœæ i szerokoœæ elementów
		private int elementWidth;
		private int elementHeight;
		
	// Odleg³oœæ miêdzy elementami
		private int spaceHeight;
	
	// Numer linii
		private int numberOfLines;
		private int number;
		
	// Czcionka
		private Font font;	
		
	
	public AddField(int windowWidth, int windowHeight, int numberOfLines, int marginLeftRight, int marginTopBotton, int spaceHeight) {
		this.windowWidth = windowWidth;
		this.windowHeight = windowHeight;
		this.numberOfLines = numberOfLines;
		this.marginLeftRight = marginLeftRight; // Musi byæ podane w procentach
		this.marginTopBottom = marginTopBotton; // Musi byæ podane w procentach
		this.spaceHeight = spaceHeight; // Musi byæ podane w procentach
		countParameters();
	}
	
		
	public void countParameters() {
		marginLeftRight *= (int) (windowWidth / 100);
		marginTopBottom *= (int) (windowHeight / 100);
		spaceHeight *= (int) (windowHeight / 100);
		elementWidth = windowWidth - (2 * marginLeftRight);
		elementHeight = (int) ((windowHeight - (2 * marginTopBottom) - (spaceHeight * numberOfLines)) / numberOfLines);
		font = new Font(Font.SANS_SERIF, Font.PLAIN, (int) (elementHeight * .5));
	}
	
	public JLabel createJLabel(String text) {
		JLabel label = new JLabel();
		
		// Dane pomocnicze
			int x = marginLeftRight;
			int y = marginTopBottom + (elementHeight + spaceHeight) * number;
			int width = elementWidth;
			int height = elementHeight;
				
		label.setBounds(x, y, width, height);
		label.setText(text);
		label.setFont(font);
				
		// Przejœcie do nastêpnej linii
			number++;
		
		return label;
	}
	
	public JLabel createJLabel(String text, int width, int x, boolean newLine) {
		JLabel label = new JLabel();
		
		// Dane pomocnicze
			x += marginLeftRight;
			int y = marginTopBottom + (elementHeight + spaceHeight) * number;
			int height = elementHeight;
				
		label.setBounds(x, y, width, height);
		label.setText(text);
		label.setFont(font);
		
		if(newLine) {
			number++;
		}
		
		return label;
	}
	
	public JButton createJButton(String text) {
		JButton button = new JButton();	
		
		// Dane pomocnicze
			int x = marginLeftRight;
			int y = marginTopBottom + (elementHeight + spaceHeight) * number;
			int width = elementWidth;
			int height = elementHeight;
		
		button.setBounds(x, y, width, height);
		button.setText(text);
		button.setFont(font);
		
		// Przejœcie do nastêpnej linii
			number++;
		
		return button;		
	}
	
	public JTextField createJTextField() {
		JTextField textField = new JTextField();
		
		// Dane pomocnicze
			int x = marginLeftRight;
			int y = marginTopBottom + (elementHeight + spaceHeight) * number;
			int width = elementWidth;
			int height = elementHeight;
				
		textField.setBounds(x, y, width, height);
		textField.setFont(font);
				
		// Przejœcie do nastêpnej linii
			number++;
		
		return textField;
	}
	
	public JTextField createJTextField(int width, int x, boolean newLine) {
		JTextField textField = new JTextField();
		
		// Dane pomocnicze
			x += marginLeftRight;
			int y = marginTopBottom + (elementHeight + spaceHeight) * number;
			int height = elementHeight;
				
		textField.setBounds(x, y, width, height);
		textField.setFont(font);
		
		if(newLine) {
			number++;
		}
		
		return textField;
	}
	
	public JComboBox createJComboBox() {
		JComboBox comboBox = new JComboBox();
		
		// Dane pomocnicze
			int x = marginLeftRight;
			int y = marginTopBottom + (elementHeight + spaceHeight) * number;
			int width = elementWidth;
			int height = elementHeight;
				
		comboBox.setBounds(x, y, width, height);
		comboBox.setFont(font);
				
		// Przejœcie do nastêpnej linii
			number++;
		
		return comboBox;
	}
	
	public void nextLine() {
		number++;
	}
	 
	public int getElementWidth() {
		return elementWidth;
	}
}
