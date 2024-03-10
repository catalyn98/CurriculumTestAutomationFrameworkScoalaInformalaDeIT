package _2.IntroductionToOOP;

public class Square {
	public int squareSide;
	
//	public void setSide(int side) {
//		squareSide = side;
//	}
	
	public void setSide(int squareSide) {
		this.squareSide = squareSide;
	}
	
	public int getPerimeter() {
		return squareSide * 4;
	}
	
	public int getArea() {
		return squareSide * squareSide;
	}
}
