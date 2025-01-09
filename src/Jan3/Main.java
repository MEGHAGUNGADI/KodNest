package Jan3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the mark scored");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks>=90 && marks<=100) {
			System.out.println("Grade A");
		} else if(marks>=60 && marks<=89) {
			System.out.println("Grade B");
		} else if(marks>=40 && marks<=59) {
			System.out.println("Grade C");
		} else if(marks>=0 && marks<=39) {
			System.out.println("Grade B");
		} else  {
			System.out.println("Invalid Marks");
	 } 
			
	}
}


