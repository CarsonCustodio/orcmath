package carsoncustodio;

import java.io.File;
import java.util.List;
import javax.swing.JFrame;
import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester{
	
	private static final long serialVersionUID = 258186143576427947L;
	private TextArea text;
	private TextField descriptionField;
	private TextField descriptionField1;
	private TextField descriptionField2;
	private TextField descriptionField3;
	private Button addButton;
	private Button saveButton;
	private Button deleteButton;
	private DogMaker catalog;

	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	public void initAllObjects(List<Visible> viewObjects) {
		catalog = new DogMaker();
		descriptionField = new TextField(40, 40, 200, 30, "text", "Name");
		viewObjects.add(descriptionField);
		descriptionField1 = new TextField(250, 40, 200, 30, "text1", "Color");
		viewObjects.add(descriptionField1);
		descriptionField2 = new TextField(40, 100, 200, 30, "text2", "Age");
		descriptionField2.setInputType(TextField.INPUT_TYPE_NUMERIC);
		viewObjects.add(descriptionField2);
		descriptionField3 = new TextField(250, 100, 200, 30, "text3", "IsCool");
		viewObjects.add(descriptionField3);
		
		text = new TextArea(500, 40, 200, 100, "text area text area text area text area text area text area text area");
		viewObjects.add(text);
		
		addButton = new Button(500, 100, 40, 40, "add", new Action() {
			public void act() {
				addClicked();
			}
		});
		viewObjects.add(addButton);
		
		saveButton = new Button(540, 100, 40, 40, "save", new Action() {
			public void act() {
				saveClicked();
			}
		});
		viewObjects.add(saveButton);
		
		deleteButton = new Button(580, 100, 40, 40, "delete", new Action() {
			public void act() {
				deleteClicked();
			}
		});
		viewObjects.add(deleteButton);
		
		FileOpenButton openButton = new FileOpenButton(500, 200, 200, 50, null, this);
		viewObjects.add(openButton);
	}

	protected void deleteClicked() {
		text.setText("delete button clicked");
	}

	public void saveClicked() {
		text.setText("save button clicked");
	}

	public void addClicked() {
		AnimatedDog newDog = new AnimatedDog(descriptionField.toString(), descriptionField1.toString(), Integer.parseInt(descriptionField2.toString()), Boolean.parseBoolean(descriptionField3.toString()));
		text.setText(newDog.toString());
	}

	public void setFile(File f) {
		
	}

	public JFrame getWindow() {
		return null;
	}

}
