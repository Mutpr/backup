package lector3;

public class Box {
	private int width, length, height;
	private int vol;
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
		vol = width*length*height;
	}
	
	public int getVol() {
		return vol;
	}
	
	static class BoxComp{
		public static boolean isSameBox(Box b_1, Box b_2){
			if(b_1.getVol()==b_2.getVol())
				return true;
			else
				return false;
		}
	}
}
