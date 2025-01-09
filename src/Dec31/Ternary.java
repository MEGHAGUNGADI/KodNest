package Dec31;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage Capgemini;
		/*int a=10;
		int b=20;
		int c=30;
		int d=40;
		
		int result =(a>b)?((c>d)? c:d):((a>b)? a:((b>d)? b:d));
		System.out.println(result);

	}

} */
		
		 int a=10,b=20,l;
         
         if(a>b) {
       	  l=a;
         }else {
       	  l=b;
         }
         System.out.println("Largest of two numbers="+l);
         
        l=(a>b)?a:b;
         System.out.println("Largest of two numbers="+l);
	}
}


