package carsoncustodio;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button {

	private String string1 = "a";
	private String string2 = "b";
	private Color color;
	
	public CustomButton(int x, int y, int w, int h, String text, Action action) {
		super(x, y, 200, 200, "", null);
	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		g.setColor(Color.black);
		g.drawString(string1, 25, 25);
		g.drawString(string2, 50, 25); 
		g.drawOval(100, 100, 100, 100);
	}
	
	void updateString1(String string) {
		
	}

	void updateString2(String string) {
		
	}

	void setIconColor(Color color) {
		
	}

}
