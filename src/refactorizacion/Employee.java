package refactorizacion;

public class Employee {
	
	private int tiempo_en_empresa;
	private String name;
	
	public Employee(String name, int tiempo_en_empresa) {
		this.tiempo_en_empresa= tiempo_en_empresa;
		this.name= name;	
}

	public String toString() {
		return "[Name=" + name +", tiempo en la empresa" + tiempo_en_empresa +"]";
	}
}
