package _2.IntroductionToOOP;

public class Forms {
	
	public static void main(String[] args) {
		System.out.println("--Square square1 = new Square()--");
		Square square1 = new Square();
		square1.setSide(7);
		System.out.println(square1.getPerimeter());
		System.out.println(square1.getArea());
		
		System.out.println("\n--Rectangle rectangle1 = new Rectangle(10, 4)--");
		Rectangle rectangle1 = new Rectangle(10, 4);
		System.out.println(rectangle1.getPerimeter());
		System.out.println(rectangle1.getArea());
		rectangle1.setLength(20);
		System.out.println(rectangle1.getArea());
		System.out.println(rectangle1.getLength());
	}
}
