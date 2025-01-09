package Jan8;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String reverse="";
		System.out.println("Enter the string");
		String s= sc.nextLine();
		StringBuilder sb =  new StringBuilder(s);
		//System.out.println(sb.reverse());
		
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
	    System.out.println(reverse);

	}

}
