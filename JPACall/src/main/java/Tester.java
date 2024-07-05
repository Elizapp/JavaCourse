import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee;

public class Tester {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee = new Employee();
		employee.setFirstname("Paoul");
		employee.setLastname("thomas");
		employee.setSalary(100.0f);
		employee.setAge(34);
		
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		factory.close();
		System.out.println("Test");
		
	}

}
