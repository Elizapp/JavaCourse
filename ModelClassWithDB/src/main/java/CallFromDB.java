import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CallFromDB {
	
	public static void main(String[] args) {
	try
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//  This line is used to create connection with any DB
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
		Statement statement = connection.createStatement();
		List<Employee>  list=new ArrayList<Employee>();
		ResultSet rs=statement.executeQuery("select * from employee");
		while(rs.next())
		{
			Employee employee=new Employee();
			employee.setId(rs.getInt(1));
			employee.setFirstname(rs.getString(2));
			employee.setSalary(rs.getFloat(5));
			list.add(employee);
		}
		
		float highSal  = 0.0f, fetchsal = 0.0f;
		int hid = 0;
		String namePer = null;
		
		for(Employee e:list)
		{
			if(e.getSalary()> highSal) {
				highSal = e.getSalary();
				hid = e.getId();
				namePer = e.getFirstname();
				
				
			}
		}
		System.out.println(hid + " " + highSal + " " + namePer);
		fetchsal = (highSal * 0.5f) + highSal;
		statement.executeUpdate("UPDATE employee set `salary`= "+ fetchsal +" where `id`="+ hid +"");
		
	}
	catch (Exception e) {
		System.out.println(e);
	}
	}
}
