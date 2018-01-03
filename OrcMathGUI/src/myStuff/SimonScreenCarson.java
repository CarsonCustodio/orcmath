package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenCarson extends ClickableScreen implements Runnable{

	TextLabel label;
	ButtonInterfaceCarson[] buttons;
	ProgressInterfaceCarson progress;
	ArrayList<MoveInterfaceCarson> sequence;
	int roundNumber;
	boolean acceptingInput;
	int sequenceIndex;
	int lastSelectedButton;


	public SimonScreenCarson(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	public void run() {

	}

	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceCarson b: buttons){ 
			viewObjects.add(b); 
		}
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceCarson>();
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	private ProgressInterfaceCarson getProgress() {
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 6;
		buttons = new ButtonInterfaceCarson[numberOfButtons];
		Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, new Color(130, 10, 200)};
		
		for(int i = 0; i < numberOfButtons; i ++) {
			ButtonInterfaceCarson b = getAButton();
			buttons[i] = b;
			b.setColor(colors[i]);
			b.setX(i*50);
			b.setY(100);
			b.setAction(new Action() {
				public void act() {
					if(acceptingInput) {
						Thread blink = new Thread(new Runnable() {
							public void run() {
								b.highlight();
								final ButtonInterfaceCarson b = getAButton();
							}
						});
						
					}
				}
			});
		}
		
	}

	private ButtonInterfaceCarson getAButton() {
		return null;
	}

	private MoveInterfaceCarson randomMove() {
		int bIndex = (int)(Math.random()*buttons.length);
		while(bIndex == lastSelectedButton){
			bIndex = (int)(Math.random()*buttons.length);
		}
		return getMove(bIndex); 
	}

	private MoveInterfaceCarson getMove(int bIndex) {
		return null;
	}

}
