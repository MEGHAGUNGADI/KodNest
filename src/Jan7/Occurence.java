package Jan7;
import java.util.Scanner;
public class Occurence {


public static void main(String[] args) {
int a[]=new int[5];
int key;

Scanner sc=new Scanner(System.in);

System.out.println("Enter array elements");

//input the elements
for(int i=0;i<a.length;i++) { 
a[i]=sc.nextInt(); 
}

System.out.println("Key element");
key = sc.nextInt();
int c=0;
//Linear search
for(int i=0;i<a.length;i++) {
if(key==a[i]) {
c++;
System.out.println(key+" present at positin "+i);

}
}
if(c>0) {
System.out.println(key+" present "+c+" times");
}else {
System.out.println(key+" not present");
}



}


}



