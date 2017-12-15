package carsoncustodio;

import java.util.ArrayList;

public class DogMaker {
	
	ArrayList<AnimatedDog> dogList;

	public static void main(String[] args) {
		DogMaker maker = new DogMaker();
		System.out.println(maker.getCSVContent());
	}
	
	public DogMaker() {
		dogList = new ArrayList<AnimatedDog>();
		dogList.add(new AnimatedDog("dog", 1, true));
		dogList.add(new AnimatedDog("dog1", 2, false));
		dogList.add(new AnimatedDog("dog2", 78, true));
	}
	
	public String getCSVContent() {
		String data = "";
		for(AnimatedDog d: dogList) {
			data += d + "\n";
		}
		return data;
	}

}
