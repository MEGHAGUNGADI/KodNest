package Jan8;

public class Strings {

    public static void main(String[] args) {
        String s1 = "This is a test";
        String s2 = "This can be a TEST"; 
        int start = 10; 
        int start1 = 14;
        int numChars = 4;

        // Corrected regionMatches call 
        System.out.println(s1.regionMatches(start, s2, start1, numChars)); 

        int pos = 10;
        int pos1 = 14;

        // Corrected regionMatches call with case-insensitive comparison
        System.out.println(s1.regionMatches(true, pos, s2, pos1, numChars)); 
    }
}
