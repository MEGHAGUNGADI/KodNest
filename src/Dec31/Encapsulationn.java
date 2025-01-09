package Dec31;
import java.util.Scanner;
class Student {
	// member data
	int sid;
	String sname;
	int age;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		sid = sc.nextInt();
		System.out.println("Enter name");
		sname = sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
	}
	
	//member function
	void display() {
		System.out.println("sid= " +sid);
		System.out.println("sname= " +sname);
		System.out.println("age= " +age);
		}
}
public class Encapsulationn {

	public static void main(String[] args) {
			Student s = new Student();
			s.input();
			s.display();

	}

}

