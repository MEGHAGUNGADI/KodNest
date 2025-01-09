package Jan3;
class Square {
	private double side;
	public Square(double side) {
		this.side= side;	}

public double getArea() {
	return side *side;
}
}

public class Area {

	public static void main(String[] args) {
	Square s = new Square(5.0);
	double area=s.getArea();
	System.out.println("Area of the square: " + area);
	}

}
