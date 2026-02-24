package lab1_5pt;
public class Class {
	private String name;
	private String desc;
	private int cred;
	private String prereq;
	public Class (String name, String desc, int cred, String prereq) {
        this.name = name;
        this.desc= desc;
        this.cred= cred;
        this.prereq= prereq;
    }
	public String getName() {
		return name;
	}
	public String toString() {
        return "Course{name='" + name + "', description='" + desc +
                "', credits=" + cred + ", prerequisite='" + prereq+ "'}";
    }
}
