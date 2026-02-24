package lab1_5pt;

public class Data {
	private double sum;
	private double maximum;
	private int count;
	
	public Data() {
		this.sum=0;
		this.count=0;
		this.maximum = -Double.MAX_VALUE;
	}
	public void add(double value) {
		sum+=value;
		if(count==0 ||value>maximum) {
			maximum =value;
		}
		count++;
	}
	public double getAvg() {
		if(count==0) return 0;
		return sum/count;
	}
	public double getMax() {
		if(count==0) return 0;
		return maximum;
	}
	
	}

