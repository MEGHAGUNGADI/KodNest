package Jan8;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="hello how are you?";
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				c++;
			}
		}
		System.out.println("Count of words: " + c);

	}

}
