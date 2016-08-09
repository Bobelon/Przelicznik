package com.example;

import javax.swing.JComboBox;
import javax.swing.JFrame;

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
			
		setVisible(true);
	}
}
