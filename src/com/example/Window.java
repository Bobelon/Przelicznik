package com.example;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	// Wspó³rzêdne po³o¿enia okna
		private int windowX = 0;
		private int windowY = 0;
		private int windowWidth = 500;
		private int windowHeight = 300;

	// Dodatkowe parametry okna
		private String windowName = "Przelicznik";
		
	// Elementy okna
		private JComboBox<String> list;
			private int listX = 10;
			private int listY = 10;
			private int listWidth = 400;
			private int listHeight = 20;
			
		private JTextField textField;
			private int textFieldX = 10;
			private int textFieldY = 40;
			private int textFieldWidth = 400;
			private int textFieldHeight = 20;
			private String textFieldText = "Podaj wspó³rzêdne";
			
		private JLabel label;
			private int labelX = 10;
			private int labelY = 70;
			private int labelWidth = 400;
			private int labelHeight = 20;
			private String labelText = "Wynik";
			
		private JButton countButton;
			private int countButtonX = 10;
			private int countButtonY = 100;
			private int countButtonWidth = 400;
			private int countButtonHeight = 20;
			private String countButtonText = "Przelicz";
	
	public Window() {
		// Ustawianie parametrów okna
			setBounds(windowX, windowY, windowWidth, windowHeight);
			setTitle(windowName);
			setLayout(null);
			
		// Dodanie listy
			list = new JComboBox<String>();
			list.addItem("Tryb 1");
			list.addItem("Tryb 2");
			list.setBounds(listX, listY, listWidth, listHeight);
			add(list);
			
		// Dodanie pola do wpisywania liczby
			textField = new JTextField();
			textField.setBounds(textFieldX, textFieldY, textFieldWidth, textFieldHeight);
			textField.setText(textFieldText);
			add(textField);
			
		// Dodanie pola wyœwietlaj¹cego wynik
			label = new JLabel();
			label.setBounds(labelX, labelY, labelWidth, labelHeight);
			label.setText(labelText);
			add(label);
			
		// Dodanie przycisku przeliczania
			countButton = new JButton();
			countButton.setBounds(countButtonX, countButtonY, countButtonWidth, countButtonHeight);
			countButton.setText(countButtonText);
			//countButton.addActionListener(null);
			add(countButton);
			
		setVisible(true);
	}
}
