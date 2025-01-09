package Jan2;

import java.util.Scanner;


class EvenOdd{
	private int num;
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		num = scanner.nextInt();
	}
	public void checkNumber() {
		if(num%2 == 0) {
			System.out.println(num+" is an even number");
		}else {
			System.out.println(num+" is an odd number");
		}
	}
}


class EvenOddMain {
	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd();
		evenOdd.inputData();
		evenOdd.checkNumber();
		
	}
}