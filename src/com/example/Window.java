package com.example;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	// Wspó³rzêdne po³o¿enia okna
		private int windowX = 0;
		private int windowY = 0;
		private int windowWidth = 500;
		private int windowHeight = 300;

	// Dodatkowe parametry okna
		private String windowName = "Przelicznik";
	
	public Window() {
		setBounds(windowX, windowY, windowWidth, windowHeight);
		setTitle(windowName);
		setLayout(null);
		setVisible(true);
	}
}
