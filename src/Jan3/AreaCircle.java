package Jan3;
import java.util.Scanner;
class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius =radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
}
public class AreaCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		Circle c = new Circle(radius);
		double area =c.getArea();
		System.out.println("Area of the circle: " + area);

	}

}
