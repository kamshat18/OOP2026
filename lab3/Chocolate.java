package task_5;

public class Chocolate implements Comparable<Chocolate>{
	private double weight;
	private String name;
	public Chocolate(double weight , String name) {
		this.weight = weight;
		this.name = name;
	}
	public String toString() {
		 return name + " weight=" + weight;
	}
	public int compareTo(Chocolate other) {
		if(weight>other.weight)
			return 1;
		if(weight < other.weight)
			return -1;
		return 0;
	}

}
