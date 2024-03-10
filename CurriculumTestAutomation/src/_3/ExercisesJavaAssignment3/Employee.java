package _3.ExercisesJavaAssignment3;

public class Employee {
	private String nume;
	private String position;
	private int yearsOfService;
	
    public Employee(String nume, String position, int yearsOfService) {
        this.nume = nume;
        this.position = position;
        this.yearsOfService = yearsOfService;
    }
	
	public String getName() {
		return this.nume;
	}
	
	public void setName(String nume) {
		this.nume = nume;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getYearsOfService() {
		return this.yearsOfService;
	}
	
	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	
	public double getSalary() {
		if("manager".equalsIgnoreCase(position))
			return 1000.00;
		else if
		("tester".equalsIgnoreCase(position))
			return 1200.00;
		else
			return 800.00;
	}
}
