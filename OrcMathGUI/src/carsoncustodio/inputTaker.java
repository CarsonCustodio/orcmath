package carsoncustodio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class inputTaker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What would you like to input");
		try{    
			FileWriter fw = new FileWriter("input.txt");    
			fw.write(in.nextLine());    
			fw.close();    
			System.out.println("Success! File \""+"input.txt"+"\" saved!");
		}catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}
}
