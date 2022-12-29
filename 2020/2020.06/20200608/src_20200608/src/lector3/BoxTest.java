package lector3;

import lector3.Box.BoxComp;

public class BoxTest {
	public static void main(String[] args) {
		
		Box box1 = new Box(10,50,20);
		Box box2 = new Box(10,30,50);
		
		System.out.println("box1.vol == box2.vol: "+ BoxComp.isSameBox(box1, box2));

	}

}
