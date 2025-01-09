package Jan3;
import java.util.Scanner;
class Character {
	private char ch;
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a character");
		ch = sc.next().charAt(0);
	}
	public void checkCharacter() {
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(ch + " is a vowel ");
		} else {
			System.out.println( ch + " is not a vowel");
		}
	}
}
public class Vowel {
	public static void main(String[] args) {
		Character c = new Character();
		c.checkCharacter();
	}
}

		
		


