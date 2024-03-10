package _3.ExercisesJavaAssignment3;

public class Main {
    public static void main(String[] args) {
    	System.out.println("---Employee employee1 = new Employee(\"Popescu Elena\", \"manager\", 5)---");
        Employee employee1 = new Employee("Popescu Elena", "manager", 5);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Position: " + employee1.getPosition());
        System.out.println("Years of Service: " + employee1.getYearsOfService());
        System.out.println("Salary: " + employee1.getSalary() + " RON");

        System.out.println("\n---Employee employee2 = new Employee(\"Dumitrescu Ioan\", \"tester\", 3)---");
        Employee employee2 = new Employee("Dumitrescu Ioan", "tester", 3);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Position: " + employee2.getPosition());
        System.out.println("Years of Service: " + employee2.getYearsOfService());
        System.out.println("Salary: " + employee2.getSalary() + " RON");
    }
}
