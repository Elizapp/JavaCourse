package entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Display {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		Query query = (Query) manager.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		
		for(Employee e:list) {
			System.out.println(e.getFirstname()+" "+e.getAge());
		}
		manager.getTransaction().begin();
		//Employee employee manager.
		
		
	}

}
