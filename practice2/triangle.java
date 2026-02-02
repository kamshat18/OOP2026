package practice2;

public class triangle {
	private int width;
	public triangle(int width) {
		this.width =width;
	}
	public String toString() {
		String res = "";
		for( int i = 1 ; i <= width; i++) {
			for( int j = 1; j <= i; j++) {
				res +="[*]";
			}
			res+="\n";
			
		}
		return res;
	}

	public static void main(String[] args) {
			triangle small = new triangle(7);
			System.out.println(small.toString());

		}

	


}

