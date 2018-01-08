package myStuff;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceCarson extends Clickable{

	public void setColor(Color color);

	public void setX(int i);

	public void setY(int i);

	public void setAction(Action action);

	public void highlight();

	public void dim();
	
}
