package carsoncustodio;

import java.util.List;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {
	
	private static final long serialVersionUID = 258186143576427947L;
	private TextField descriptionField;

	public CatalogScreen(int width, int height) {
		super(width, height);
		
	}

	public void initAllObjects(List<Visible> viewObjects) {
		descriptionField = new TextField(40, 40, 200, 30, "text", "description");
		viewObjects.add(descriptionField);
	}

}
