package Jan2;




import java.util.Scanner;


public class Count {


	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		
		if(num==0) {
			System.out.println("Input number is zero");
		}
		if(num>0) {
			System.out.println(num+" is positive");
		}
		if(num<0) {
			System.out.println(num+" is negative");
		}
	}


}
