package carsoncustodio;

import java.util.ArrayList;
import java.util.Scanner;

public class DogMaker {

	ArrayList<AnimatedDog> dogList;
	private String d; //name
	private String o; //color
	private int g; //age
	private boolean s; //is cool

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DogMaker maker = new DogMaker();
		
		System.out.println("would you like to add a dog? (y/n)");
		if(in.nextLine().equals("y")) {
			maker.addDog();
			System.out.println("Add another, save or quit?");
			if(in.nextLine().equals("add")) {
				maker.addDog();
			}else if(in.nextLine().equals("save")) {
				System.out.println("saved");
			}else {
				System.out.println("ok goodbye");
			}
		}else {
			System.out.println("ok goodbye");
		}
	}

	public DogMaker() {
		dogList = new ArrayList<AnimatedDog>();
		dogList.add(new AnimatedDog("dog", "red", 1, true));
		dogList.add(new AnimatedDog("dog1", "brown", 2, false));
		dogList.add(new AnimatedDog("dog2", "white", 78, true));
	}

	public String getCSVContent() {
		String data = "";
		for(AnimatedDog d: dogList) {
			data += d + "\n";
		}
		return data;
	}

	public void addDog() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the dog's name?");
		d = in.nextLine();
		System.out.println("What is color is the dog?");
		o = in.nextLine();
		System.out.println("How old is the dog?");
		g = Integer.parseInt(in.nextLine());
		System.out.println("Is the dog cool?");
		s = Boolean.parseBoolean(in.nextLine());
		dogList.add(new AnimatedDog(d, o, g, s));
	}
}

/* String[] data = line.split(",");
 * dogMaker.add(new AnimatedDog(data[0], data[1], Intefer.parseInt(data[2]), Boolean.parseBoolean(data[3]));
 */