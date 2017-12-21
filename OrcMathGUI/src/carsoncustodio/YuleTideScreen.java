package carsoncustodio;

import java.io.File;
import java.util.List;
import javax.swing.JFrame;
import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class YuleTideScreen extends FullFunctionScreen implements FileRequester{
	
	private static final long serialVersionUID = 258186143576427947L;
	private TextArea text;
	private Button imgButton;
	
	public YuleTideScreen(int width, int height) {
		super(width, height);
	}

	public void initAllObjects(List<Visible> viewObjects) {
		text = new TextArea(500, 40, 200, 100, "Happy Yuletide!");
		viewObjects.add(text);
		
		imgButton = new Button(300, 300, 40, 40, "img", new Action() {
			
			@Override
			public void act() {
				YuleTide.card.setScreen(YuleTide.back);;
			}
		});
		viewObjects.add(imgButton);
		
		Graphic img = new Graphic(0, 0, "images/fire.jpg");
		viewObjects.add(img);
		Graphic img2 = new Graphic(0, 0, "images/second.jpg");
		viewObjects.add(img2);
	}

	public void setFile(File f) {
		
	}

	public JFrame getWindow() {
		return null;
	}

}
