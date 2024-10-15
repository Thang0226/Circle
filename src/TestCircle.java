public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(7.0);

		System.out.println("Circle 1 information: ");
		System.out.println("\tRadius: " + c1.getRadius() + "\tArea: " + c1.getArea());
		System.out.println("Circle 2 information: ");
		System.out.println("\tRadius: " + c2.getRadius() + "\tArea: " + c2.getArea());
	}
}