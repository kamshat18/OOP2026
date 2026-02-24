package lab1_5pt;

public class Student {
	private String name;
	private int id;
	private int grade;
	public Student(String name, int id) {
		this.name =  name;
		this.id = id;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public String toString() {
    	return "Student {name='"+name +"',id ="+id+",grade=" + grade + "}";
    }
}
