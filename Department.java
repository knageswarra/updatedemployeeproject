package employee;

public class Department {
	String deptid;
	String deptname;
	Location loc;
	
    void createDepartment(String deptid,String deptname,Location loc)
    {
    	this.deptid=deptid;
    	this.deptname=deptname;
    	this.loc=loc;
    }
   public String getDetails()
   {
	   return "  \nthese are the details of the department are:"+" department id: "+deptid+ " ,department name:"+deptname + " ,Location is:"+loc.getDetails();
   }
}
