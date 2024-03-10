package _1.JavaExercises;
import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		System.out.print("--List<String> colors = new ArrayList<String>()--\n");
		List<String> colors = new ArrayList<String>();
		colors.add("rosu");
		colors.add("albastru");
		colors.add("mov");
		colors.add("roz");
		colors.add("verde");
		System.out.println(colors);
		System.out.println(colors.get(0));
		System.out.println(colors.size());
		System.out.println(colors.indexOf("mov"));
		System.out.println(colors.contains("verde"));
		colors.set(3, "portocaliu");
		System.out.println(colors);
		colors.remove(4);
		colors.remove("portocaliu");
		System.out.println(colors);
		
		for(String color : colors) {
			System.out.println(color);
		}
		
		System.out.println("\n--List<String> cars = new ArrayList<String>()--");
		List<String> cars = new ArrayList<String>();
		cars.add("Audi");
		cars.add("Dacia");
		cars.add("Mazda");
		cars.add("Ferrari");
		cars.add("Opel");
		System.out.println(cars);
		System.out.println(cars.get(0));
		System.out.println(cars.size());
		System.out.println(cars.contains("VW"));
		cars.set(3, "Mercedes");
		System.out.println(cars);
		cars.remove(4);
		System.out.println(cars);
		
		for(String car : cars) {
			System.out.println(car);
		}
		
		System.out.println("\n--List<String> words = new ArrayList<String>()--");
		List<String> words = new ArrayList<String>();
		List<String> newWordsList = new ArrayList<String>();
		words.add("prajitura");
		words.add("nu");
		words.add("bomboana");
		words.add("interzis");
		words.add("suc");
		if(words.size() > 5) {
			System.out.println("list too long");
		}
		for(String word : words) {
			if(word.length() > 5) {
				int i = words.indexOf(word);
				words.set(i, "ups");
				newWordsList.add(word);
			}
			if(word.length() <= 3) {
				int i = words.indexOf(word);
				words.set(i, word + "!");
			}
		}
		System.out.println(words);
		System.out.println(newWordsList);
	}
}
