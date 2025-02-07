package refactorizacion;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager  {
	private List<Employee> empleado= new ArrayList();
	
	public void addEmployee(String name, int years) {
        if (empleado.size()< 10) {
            empleado.add(50, null);
            System.out.println("Añadido empleado");
            
        } else {
            System.out.println("No se puede añadir más.");
        }
    }
	public String toString() {
		return "Lista de empleados" + empleado;
	}

	
}
