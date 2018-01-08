package myStuff;

import java.awt.Color;

import guiTeacher.components.Action;

public interface ButtonInterfaceCarson{

	public void setColor(Color color);

	public void setX(int i);

	public void setY(int i);

	public void setAction(Action action);

	public void highlight();

	public void dim();
	
}
