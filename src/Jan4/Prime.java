package Jan4;
import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int count =0;
		int n = sc.nextInt();
	    for(int i=1;i<=n;i++) {
		if(n%i==0) {
		//System.out.println(i+ );
		count++;
	}
					
}
		if(count==2) {
			System.out.print(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
    }
}



	
