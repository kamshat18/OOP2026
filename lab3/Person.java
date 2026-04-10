package task_4;

public class Person implements Cloneable{
	protected String name;
	

	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		}
	public String toString() {
		return "Name" + name;
	
	}
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null)
			return false;
		if(getClass()!=o.getClass())
			return false;
					
		Person other = (Person) o;
		return name.equals(other.name);
		
	}
	  public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	
	
}