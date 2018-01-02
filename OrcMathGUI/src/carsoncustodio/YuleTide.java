package carsoncustodio;

import guiTeacher.GUIApplication;

public class YuleTide extends GUIApplication{
	
	private static final long serialVersionUID = 1L;
	public static YuleTide card;
	public static YuleTideScreen front;
	public static YuleTideScreen back;
	
	public static void main(String[] args) {
		card = new YuleTide(800, 550);
		Thread go = new Thread(card);
		go.start();
	}

	public YuleTide(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public void initScreen() {
		front = new YuleTideScreen(getWidth(), getHeight());
		setScreen(front);
	}
	
}