package _4.IntroductionToOOPInheritance;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("Zzzzzzzzzzz");
	}
	
	public void eat() {
		System.out.println("Yummyyy");
	}
	
	public void eat(String foodType) {
		System.out.println(foodType);
	}
	
	public void eat(int howManyType) {
		System.out.println(howManyType);
	}
	
	public void walk() {
		System.out.println("1-2-3! 1-2-3!");
	}
}
