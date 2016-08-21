package com.example;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Klasa tworzy przyciski i pola dla klasy Window, oraz oblicza ich po�o�enie na podstawie rozmiar�w okna
 */

public class AddField {
	
	// Odleg�o�� elementu od kraw�dzi okna (w procentach)
		private int marginLeftRight;
		private int marginTopBottom;
		
	// Wysoko�� i szeroko�� okna
		private int windowWidth;
		private int windowHeight;
		
	// Wysoko�� i szeroko�� element�w
		private int elementWidth;
		private int elementHeight;
		
	// Odleg�o�� mi�dzy elementami
		private int spaceHeight;
	
	// Numer elementu w pionie
		private int number;
		
	// Czcionka
		private Font font;	
	
		
	// KONSTRUKTORY		
		public AddField(int windowWidth, int windowHeight) {
			this.windowWidth = windowWidth;
			this.windowHeight = windowHeight;
			font = new Font(Font.SANS_SERIF, Font.PLAIN, 10);
		}
		
		public AddField(int windowWidth, int windowHeight, int margin) {
			this(windowWidth, windowHeight);
			this.marginLeftRight = margin;
		}
		
		public AddField(int windowWidth, int windowHeight, Font font) {
			this(windowWidth, windowHeight);
			this.font = font;
		}
		
		public AddField(int windowWidth, int windowHeight, int margin, Font font) {
			this(windowWidth, windowHeight, margin);
			this.font = font;
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
				
		// Przej�cie do nast�pnej linii
			number++;
		
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
		
		// Przej�cie do nast�pnej linii
			number++;
		
		return button;		
	}
	
	public JTextField createJTextField(String text) {
		JTextField textField = new JTextField();
		
		// Dane pomocnicze
			int x = marginLeftRight;
			int y = marginTopBottom + (elementHeight + spaceHeight) * number;
			int width = elementWidth;
			int height = elementHeight;
				
		textField.setBounds(x, y, width, height);
		textField.setText(text);
		textField.setFont(font);
				
		// Przej�cie do nast�pnej linii
			number++;
		
		return textField;
	}
}
