
public class Employee {
	
	private int id;
	private String firstname;
	private String laststname;
	private int age;
	private float salary;
	
	
	
public Employee(int id, String firstname, float salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.salary = salary;
	}



public String getFirstname() {
	return firstname;
}



public void setFirstname(String firstname) {
	this.firstname = firstname;
}



public String getLaststname() {
	return laststname;
}



public void setLaststname(String laststname) {
	this.laststname = laststname;
}



public int getAge() {
	return age;
}



public void setAge(int age) {
	this.age = age;
}



public Employee() {
	super();
}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}


	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	

}
