package src1_20200919;

public class Distance {
	private String name;
	private int dist;
	
	public Distance(String n, int d) {
		name = n;
		dist = d;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDist(int dist) {
		this.dist = dist;
	}
	
	public int getDist() {
		return dist;
	}
	
	public String toString() {
		return "name: "+name+"dist: "+dist;
	}
}
