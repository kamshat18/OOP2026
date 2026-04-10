package part_C;

public class employee extends Person{

	 private String employeeId;

	    public employee(String n,int a,String id){
	        super(n,a);
	        employeeId = id;
	    }

	    @Override
	    public boolean equals(Object o){

	        if(!super.equals(o)) return false;

	        employee e = (employee)o;

	        return employeeId.equals(e.employeeId);
	    }

	    @Override
	    public int hashCode(){
	        return super.hashCode() + employeeId.hashCode();
	    }
}
