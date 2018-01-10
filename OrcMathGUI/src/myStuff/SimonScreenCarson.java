package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenCarson extends ClickableScreen implements Runnable{

	private static final long serialVersionUID = 1L;
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
		label.setText("");
		nextRound();
	}

	private void nextRound() {
		acceptingInput = false;
		roundNumber++;
		sequence.add(randomMove());
		progress.setRound(roundNumber);
		progress.setSequenceSize(sequence.size());
		changeText("Simon's Turn");
		playSequence();
		label.setText("Your Turn");
		acceptingInput = true;
		sequenceIndex = 0;
	}

	private void playSequence() {
		ButtonInterfaceCarson b = null;
		for(int i=0; i< sequence.size(); i++) {
			if(b != null) {
				b.dim();
			}
			b = sequence.get(i).getButton();
			b.highlight();
			int sleepTime = 50000 / roundNumber;
			try {
				Thread.sleep(sleepTime);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		b.dim();
	}

	private void changeText(String string) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		label.setText("");
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
		return new ProgressRicky(50,350,100,100);
	}

	private void addButtons() {
		int numberOfButtons = 5;
		buttons = new ButtonInterfaceCarson[numberOfButtons];
		Color[] colors = {Color.RED, Color.YELLOW, Color.ORANGE, Color.GREEN, Color.BLUE, Color.PINK};
		for(int i = 0; i < numberOfButtons; i++){
			buttons[i] = getAButton();
			buttons[i].setColor(colors[i]);
			buttons[i].setX(100*i+50);
			buttons[i].setY(100);
			final ButtonInterfaceCarson b = buttons[i];
			b.dim();
			b.setAction(new Action(){
				public void act(){
					if(acceptingInput){
						Thread changeButton = new Thread(new Runnable(){
							public void run(){
								b.highlight();
								try {
									Thread.sleep(800);
								}catch (InterruptedException e) {
									e.printStackTrace();
								}
								b.highlight();
							}
						});
						changeButton.start();
						if(b == sequence.get(sequenceIndex).getButton()){
							sequenceIndex++;
						}
						else{
							progress.gameOver();
							acceptingInput = false;
						}

						if(sequenceIndex == sequence.size()){ 
							Thread nextRound = new Thread(SimonScreenCarson.this); 
							nextRound.start(); 
						}
					}
				}
			});
		}
	}

	private ButtonInterfaceCarson getAButton() {
		return new ButtonRicky(0,0,75,75,"",null);
	}

	private MoveInterfaceCarson randomMove() {
		int bIndex = (int)(Math.random()*buttons.length);
		while(bIndex == lastSelectedButton){
			bIndex = (int)(Math.random()*buttons.length);
		}
		return getMove(bIndex); 
	}

	private MoveInterfaceCarson getMove(int bIndex) {
		return new MoveRicky(null);
	}

}
