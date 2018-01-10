package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameCarson extends GUIApplication{
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		SimonGameCarson r = new SimonGameCarson(800, 550);
		Thread runner = new Thread(r);
		runner.start();
	}

	public SimonGameCarson(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public void initScreen() {
		SimonScreenCarson screen = new SimonScreenCarson(getWidth(), getHeight());
		setScreen(screen);
	}
}
