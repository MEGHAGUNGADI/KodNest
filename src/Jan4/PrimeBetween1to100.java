package Jan4;

public class PrimeBetween1to100 {

    public static void main(String[] args) {
        /* for (int num = 2; num <= 100; num++) { // Start from 2 as 1 is not prime
            boolean isPrime = true; 
            for (int i = 2; i <= Math.sqrt(num); i++) { // Only check divisibility up to the square root
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
} */
        for (int num = 2; num <= 100; num++) { 
            boolean isPrime = true; 
            for (int i = 2; i <= Math.sqrt(num); i++) { 
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}