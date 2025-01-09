package Jan8;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String s ="hello how are you?";
				int c=0;
				for(int i=0;i<s.length();i++) {
					if(s.charAt(i)==' ') {
						c++;
					}
				}
				System.out.println("Count of words: " + (c+1));
				s=s.toLowerCase();
				c=0;
				for(int i=0;i<s.length();i++) {
					char ch=s.charAt(i);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
						c++;
					}
			}
				System.out.println("No of vowels " + c);

				
				// indexOf
				
				String n="Mahathma Karmchand Gandhi"; //M.K.Gandhi
				System.out.print(n.charAt(0)+"."); //M.
				int k=n.indexOf(' ');
				System.out.print(n.charAt(k+1)+"."); //K.
				int l=n.lastIndexOf(' ');
				System.out.print(n.substring(l+1));
				
			}
	}


