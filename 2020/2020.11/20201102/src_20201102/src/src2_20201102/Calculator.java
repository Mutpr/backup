package src2_20201102;

public class Calculator {
	static Control control;
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void compute(int i, int j) {
		control.run(i,j);
	}
	
	static interface Control{
		void run(int a, int b);
	}

}

