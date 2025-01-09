package Jan3;
import java.util.Scanner;
class Triangle {
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base =base;
		this.height=height;
	}
	
	public double getArea() {
		return 0.5*base*height;
	}
}
public class AreaTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of the triangle: ");
		double base = sc.nextDouble();
		System.out.println("Enter the height of the triangle ");
		double height =sc.nextDouble();
		Triangle t = new Triangle(base, height);
		double area = t.getArea();
		System.out.println("Area of the triangle: " + area);
	}
}
