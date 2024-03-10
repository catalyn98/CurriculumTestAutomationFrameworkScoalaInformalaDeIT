package _5.JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitAnnotations {
	
	@BeforeClass
	public static void beforeAll() {
		System.out.println("Inainte de toate");
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("Dupa toate");
	}
	
	@Before
	public void before() {
		System.out.println("Inainte de fiecare test");
	}
	
	@After
	public void after() {
		System.out.println("Dupa fiecare test");
	}
	
	@Test
	public void test1() {
		System.out.println("Primul test");
		Assert.assertEquals(3, 3);
	}
	
	@Test
	public void test2() {
		System.out.println("Al doilea test");
		Assert.assertEquals(3, 2);
	}
}
