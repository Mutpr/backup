package src4;

public class Info {
	String id;
	int pass;
	int b [] = new int [4];
	
	public void disPlay() {
		for(int i = 0; i<4; i++) {
		b[i] = (int)(Math.random()*10);
		pass = (b[0]*1000)+(b[1]*100)+(b[2]*10)+(b[3]);
	}
		System.out.println("id: "+id+"\t"+"password: "+pass);
	}
}
