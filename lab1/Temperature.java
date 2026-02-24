package lab1_5pt;

public class Temperature {
	private double val;
	private char scale;

	public Temperature() {
		this(0,'C');
	}
	public Temperature(double val) {
		this(val,'C');
	}
	public Temperature(char scale) {
		this(0,scale);
	}
	public Temperature(double val , char scale) {
		this.val = val;
		this.scale=(scale=='F'||scale =='f')? 'F':'C';
	}
	public double getC() {
		if(scale == 'C') return val;
		return 5 * (val - 32) / 9;
	}
	public double getF() {
		if(scale == 'F') return val;
		return (9 * (val / 5)) + 32;	}

	public void setVal(double val) {
		this.val =val;
	}
	public void setScale(char scale) {
		this.scale =scale;
	}
	public void setBoth(double val, char scale) {
		this.val = val;
		this.scale = scale;
		
	}
	public char getScale() {return scale;}
	public static void main(String[] args) {

	    Temperature t1 = new Temperature();        
	    Temperature t2 = new Temperature(100);     
	    Temperature t3 = new Temperature('F');     
	    Temperature t4 = new Temperature(32, 'F'); 

	    System.out.println("t1 scale: " + t1.getScale());   
	    System.out.println("t2 in F: " + t2.getF());       
	    System.out.println("t3 in C: " + t3.getC());       
	    System.out.println("t4 in C: " + t4.getC());       

	  
	    t1.setBoth(25, 'F');
	    System.out.println("t1 after setBoth in C: " + t1.getC());

	    t2.setVal(0);
	    t2.setScale('F');
	    System.out.println("t2 now in C: " + t2.getC());
	}
}
