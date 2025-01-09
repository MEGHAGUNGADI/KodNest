package Jan2;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a Number");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Positive Number");
		} else if(a==0){
			
			System.out.println("Zero");
		} else {
			System.out.println("Negative Number");
		}
	}

}
