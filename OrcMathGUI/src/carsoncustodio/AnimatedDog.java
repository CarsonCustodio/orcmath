package carsoncustodio;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class AnimatedDog extends AnimatedComponent {
	
	String name;
	String color;
	int value;
	boolean isCool;

	public AnimatedDog(String name, String color, int value, boolean isCool) {
		super(200, 200, 180, 116);
		this.name = name;
		this.color = color;
		this.value = value;
		this.isCool = isCool;
		addSequence("resources/dog.png", 150, 0, 116, 90, 58, 4);
		Thread animation = new Thread(this);
		animation.start();
		update();
	}

	public void update(Graphics2D g) {
		super.update(g);
	}
	
	public String toString() {
		return name + "," + value +"," + isCool;
	}

}
