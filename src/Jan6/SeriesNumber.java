package Jan6;

public class SeriesNumber {

	public static void main(String[] args) {
			        int n = 7; 
			        double sum = 0.0;
			        for (int i = 1; i <= n; i++) {
			            double term = 1.0/i;
			            if (i % 2 != 0) {
			                sum += term;  //odd
			            } else {
			                sum -= term; // subtract
			            }
			        }

			        System.out.println("Sum of the series: " + sum);
			    }
	}
			

	


