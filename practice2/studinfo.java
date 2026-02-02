package practice2;

public class studinfo {
	private String name;
	private String id;
	private int studyYear;
	public studinfo(String name ,String  id){
		this.name = name;
		this.id = id;
		this.studyYear = 1;
		
	}
	public String getname() {
		return name;
	}
	public String getid() {
		return id;
	}
	public void increment() {
		studyYear++;
	}
	 public int getStudyYear() {   
	        return studyYear;
	    }
	 public static void main(String[] args) {
			studinfo s = new studinfo("Kamshat","24B031679");
			 System.out.println("Name: " + s.getname());
		     System.out.println("ID: " + s.getid());
		     System.out.println("Year: " + s.getStudyYear());

		     s.increment();
		     System.out.println("New Year: " + s.getStudyYear());


		
			
			
		}


	
}
