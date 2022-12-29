package src1_1_210806;

public class Div extends Calculate{

	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return a/b;
	}

}
