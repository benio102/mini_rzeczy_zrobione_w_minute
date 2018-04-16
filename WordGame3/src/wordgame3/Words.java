package wordgame3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Words {
	private String word;
	
	Words(){
			
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public String return_polishWord() throws FileNotFoundException {
		String word="";
		Random rand = new Random();
		Scanner scanner = new Scanner(new FileReader("D:\\polish.txt"));
		
		for(int i=0;i<=rand.nextInt(get_polishLenght());i++) {
		word = scanner.nextLine();
		}
		scanner.close();
		return word;
	}
	
	public int get_polishLenght() throws FileNotFoundException {
		int length=0;
		Scanner scanner = new Scanner(new FileReader("D:\\polish.txt"));
		
		while(!scanner.nextLine().equals("END DNE")) {
			length++;
		}
		scanner.close();
		return length;	
	}
	
	
}
