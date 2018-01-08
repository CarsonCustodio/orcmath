package myStuff;

import guiPlayer.CustomScreen;
import guiTeacher.GUIApplication;

public class SimonGameCarson extends GUIApplication{
	
	public static void main(String[] args) {
		SimonGameCarson r = new SimonGameCarson(800, 500);
		Thread runner = new Thread(r);
		runner.start();
	}

	public SimonGameCarson(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public void initScreen() {
		CustomScreen screen = new CustomScreen(getWidth(), getHeight());
		setScreen(screen);
	}
}
