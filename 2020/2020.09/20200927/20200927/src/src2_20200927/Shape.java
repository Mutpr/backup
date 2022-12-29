package src2_20200927;

public class Shape {
	protected static int row;
	protected static char alpha;
	
	public Shape(int ro, char ap){
		this.row = ro;
		this.alpha = ap;
	}
	
	public int getRow() {
		return row;
	}

	public char getalpha() {
		return alpha;
	}

	public void draw(int x, char ch) {
		x = row;
		ch = alpha;
	}
}
