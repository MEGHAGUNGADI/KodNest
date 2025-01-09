package Jan6;

public class Series {

	public static void main(String[] args) {
			        int n = 10; // number of terms
			        double sum = 0;
			        for (int i = 1; i <= n; i++) {
			            double fact= 1;
			            for(int j=1;j<=i;j++) {
			            	fact=fact*j;
			            } 
			            if (i % 2 != 0) {
			            	
			                sum += fact; 
			            } else {
			                sum -= fact; 
			            }
			        }
			        System.out.println("Sum of the series: " + sum);
	 }
	public static double factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n* factorial(n-1);
		
		
	}
}
/* //1/1!-1/2!+1/3!-1/4!.....1/7!
package jan6;


public class SumSeries {
	public static void main(String[] args) {
		long fact=1;
		double sum=0;
		for(int i=1;i<=7;i++) {
			fact=1;
			for(int j=i;j>=i;j--) {
				fact=fact*j;
			}
			if(i%2==0) {
			    sum = sum-(double)1/fact;
			}
			else {
				sum = sum+(double)1/fact;
			}
		}
			
	   System.out.println("Sum of the given series ="+sum);
	


	}
}
*/


