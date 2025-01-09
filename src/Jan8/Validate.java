package Jan8;
import java.util.Scanner;
public class Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username and password");
		String uname =sc.next();
		String upass =sc.next();
		if(uname.equalsIgnoreCase("edubridge") && upass.equals("edu123")){
			System.out.println("Login successful");
		}else {
			System.out.println("Invalid User ! try again");
		
	}

}
}
