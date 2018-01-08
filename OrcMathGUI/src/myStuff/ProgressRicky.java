package myStuff;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressRicky extends Component implements ProgressInterfaceCarson {

	private int round;
	private int x;

	public ProgressRicky(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRound(int round) {
		this.round = round;
	}

	@Override
	public void setSequenceSize(int x) {
		this.x = x;
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub
		
	}
}
