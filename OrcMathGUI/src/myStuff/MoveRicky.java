package myStuff;

public class MoveRicky implements MoveInterfaceCarson {

	private ButtonInterfaceCarson button;

	public MoveRicky(ButtonInterfaceCarson button) {
		this.button = button;
	}

	public ButtonInterfaceCarson getButton() {
		return button;
	}

}