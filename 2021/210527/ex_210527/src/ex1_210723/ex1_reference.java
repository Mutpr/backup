package ex1_210723;

public class ex1_reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "honghyerin";
		String strVar2 = "honghyerin";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1, strVar2 reference is same");
		}else{
			System.out.println("strVar1, strVar2 reference is not same");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1, strVar2 has same string");
			
		}
		
		String strVar3 = new String("Ω≈πŒ√∂");
		String strVar4 = new String("Ω≈πŒ√∂");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3, strVar4 reference is same");
		}else {
			System.out.println("strVar3, strVar4 reference is not same");
		} if(strVar3.equals(strVar4)) {
			System.out.println("strVar3, strVar4 has same string");
		}

	}

}
