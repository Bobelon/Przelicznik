package com.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			private String mode = "DMS";
			
		private JTextField dmsDegrees;
			private int dmsDegreesX = 10;
			private int dmsDegreesY = 40;
			private int dmsDegreesWidth = 40;
			private int dmsDegreesHeight = 20;
			
		private JLabel dmsDegreeCharacter;
			private int dmsDegreeCharacterX = 50;
			private int dmsDegreeCharacterY = 40;
			private int dmsDegreeCharacterWidth = 10;
			private int dmsDegreeCharacterHeight = 20;
			private String dmsDegreeCharacterText = "*";		

		private JTextField dmsMinutes;
			private int dmsMinutesX = 60;
			private int dmsMinutesY = 40;
			private int dmsMinutesWidth = 40;
			private int dmsMinutesHeight = 20;
			
		private JLabel dmsMinutesCharacter;
			private int dmsMinutesCharacterX = 100;
			private int dmsMinutesCharacterY = 40;
			private int dmsMinutesCharacterWidth = 10;
			private int dmsMinutesCharacterHeight = 20;
			private String dmsMinutesCharacterText = "'";	

		private JTextField dmsSeconds;
			private int dmsSecondsX = 110;
			private int dmsSecondsY = 40;
			private int dmsSecondsWidth = 40;
			private int dmsSecondsHeight = 20;
				
		private JLabel dmsSecondsCharacter;
			private int dmsSecondsCharacterX = 150;
			private int dmsSecondsCharacterY = 40;
			private int dmsSecondsCharacterWidth = 10;
			private int dmsSecondsCharacterHeight = 20;
			private String dmsSecondsCharacterText = "\"";
			
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

	// Listenery
		private ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch(list.getSelectedIndex()) {
					case 0:
						mode = "DMS";
						label.setText(mode);
						dmsSeconds.setEnabled(true);
						dmsSecondsCharacter.setEnabled(true);
						dmsSeconds.setVisible(true);
						dmsSecondsCharacter.setVisible(true);
					break;
					case 1:
						mode = "DM";
						label.setText(mode);
						dmsSeconds.setEnabled(false);
						dmsSecondsCharacter.setEnabled(false);
						dmsSeconds.setVisible(false);
						dmsSecondsCharacter.setVisible(false);
					break;
				}
			}			
		};
	
	public Window() {
		// Ustawianie parametrów okna
			setBounds(windowX, windowY, windowWidth, windowHeight);
			setTitle(windowName);
			setLayout(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		// Dodanie listy
			list = new JComboBox<String>();
			list.addItem("DMS (stopnie : minuty : sekundy");
			list.addItem("DM (stopnie : minuty)");
			list.setBounds(listX, listY, listWidth, listHeight);
			list.addActionListener(actionListener);
			add(list);
			
		// Dodanie pola do wpisywania liczby			
			dmsDegrees = new JTextField();
			dmsDegrees.setBounds(dmsDegreesX, dmsDegreesY, dmsDegreesWidth, dmsDegreesHeight);
			add(dmsDegrees);
	
			dmsDegreeCharacter = new JLabel(dmsDegreeCharacterText);
			dmsDegreeCharacter.setBounds(dmsDegreeCharacterX, dmsDegreeCharacterY, dmsDegreeCharacterWidth, dmsDegreeCharacterHeight);
			add(dmsDegreeCharacter);
			
			dmsMinutes = new JTextField();
			dmsMinutes.setBounds(dmsMinutesX, dmsMinutesY, dmsMinutesWidth, dmsMinutesHeight);
			add(dmsMinutes);
			
			dmsMinutesCharacter = new JLabel(dmsMinutesCharacterText);
			dmsMinutesCharacter.setBounds(dmsMinutesCharacterX, dmsMinutesCharacterY, dmsMinutesCharacterWidth, dmsMinutesCharacterHeight);
			add(dmsMinutesCharacter);
				
			if ("DMS".equals(mode)) {	
				dmsSeconds = new JTextField();
				dmsSeconds.setBounds(dmsSecondsX, dmsSecondsY, dmsSecondsWidth, dmsSecondsHeight);
				add(dmsSeconds);
				
				dmsSecondsCharacter = new JLabel(dmsSecondsCharacterText);
				dmsSecondsCharacter.setBounds(dmsSecondsCharacterX, dmsSecondsCharacterY, dmsSecondsCharacterWidth, dmsSecondsCharacterHeight);
				add(dmsSecondsCharacter);				
			}
			
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
