package Jan2;
import java.util.Scanner;
public class OodEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

	}

}
