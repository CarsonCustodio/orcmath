package carsoncustodio;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class Playground extends Component {

	public Playground(int x, int y, int w, int h) {
		super(x, y, w, h);
		
	}
	
	public Playground() {
		super(40, 40, 100, 100);
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.green);
		g.drawRect(0, 0, getWidth(), getHeight());
		
	}

}
