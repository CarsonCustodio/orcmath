package carsoncustodio;

import java.io.File;
import java.util.List;
import javax.swing.JFrame;

import guiTeacher.GUIApplication;
import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class YuleTide extends GUIApplication{
	
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