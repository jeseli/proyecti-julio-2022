package mx.com.proyecti;

import java.util.Date;

import mx.com.proyecti.entity.Employee;

public class EmployeeManagerImpl {

	public static void main(String[] args) {
		EmployeeManager  manager= new EmployeeManager();
//		Long id = manager.addEmployee("Victor", "Calderon", new Date(), 8000.0, "555555555", "vhcalderon@gmail.com");
//		System.out.println("El id generado es " + id);
		
		Employee emp = manager.getEmployee(1L);//tipo long poner una Lal final
		System.out.println("El nombre del empleado es: " + emp.getFirstName()+ " " + emp.getLastName());

	}

}
