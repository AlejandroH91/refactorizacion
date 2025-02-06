package refactorizacion;

public class Employee {
	private int edad;
	private int tiempo_en_empresa;
	private String name;
	
	public Employee(int edad, int tiempo_en_empresa, String name) {
		this.edad= edad;
		this.tiempo_en_empresa= tiempo_en_empresa;
		this.name= name;
	}
	
	
	public void addEmployee(String name, int years) {
        if (numberOfEmployees < 10) {
            employeeNames[numberOfEmployees] = name;
            employeeYears[numberOfEmployees] = years;
            numberOfEmployees++;
            System.out.println(name + " added to the system.");
        } else {
            System.out.println("Cannot add more employees, system is full.");
        }
    }
}
