package employee;

public class App {
  public static void main(String args[])
  {
	 
	  Location l=new Location();
	  l.createLocation("LOC123", "Bangalore", 560045, "india");
	  Department d1=new Department();
	  d1.createDepartment("DEPT1","ABC",l);
	  Employee e=new Employee();
	  e.createEmployee("Nageswar",5000,"ABC123",d1);
	  e.getDetails();
	  
  }
}
