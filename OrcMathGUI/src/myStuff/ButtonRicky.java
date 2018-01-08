package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonRicky extends Button implements ButtonInterfaceCarson {
	
	private Color color;
	private boolean isOn;

	public ButtonRicky(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text, color, action);
		// TODO Auto-generated constructor stub
	}

	public ButtonRicky(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		// TODO Auto-generated constructor stub
	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		if(hover) {
			highlight();
			g.drawOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
			g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		}
		else {
			dim();
			g.drawOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
			g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		}
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
		update();
	}

	@Override
	public void highlight() {
		if(isOn) {
			this.color = color.brighter();
			update();
		}
	}

	@Override
	public void dim() {
		if(isOn) {
			this.color = color.darker();
			update();
		}
	}
}
