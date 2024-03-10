package _4.IntroductionToOOPInheritance;

public class Cat extends Animal{
	
	private int numberOfLives;

	public Cat(String name, int age, int numberOfLives) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.numberOfLives = numberOfLives;
	}

	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}
	
	public void scratch() {
		System.out.println("jap! ia de aici!");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
		System.out.println("prrrrrrrrrr");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
		System.out.println("top top");
	}
}
