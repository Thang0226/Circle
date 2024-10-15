public class Circle {
	double radius = 1.0;
	String color = "red";

	public Circle() {
	}

	public Circle(double r) {
		radius = r;
	}

	protected double getRadius() {
		return radius;
	}

	double getArea() {
		double area = Math.PI * radius * radius;
		return Math.round(area * 1000.0) / 1000.0;
	}
}
