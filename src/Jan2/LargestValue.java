package Jan2;
import java.util.Scanner;
public class LargestValue {

	public static void main(String[] args) {
	

		       /* Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();
		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();
		        int largest = (num1 > num2) ? num1 : num2;
		        System.out.println("The largest number is: " + largest);
		        scanner.close();
		    }
		} */
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int a = scanner.nextInt();
		        System.out.print("Enter the second number: ");
		        int b = scanner.nextInt();
		        int largest;
		        if (a > b) {
		            largest = a;
		        } else {
		            largest = b;
		        }
		        System.out.println("The largest number between " + a + " and " + b + " is " + largest);

		        scanner.close();
		    }
		}

		
		
