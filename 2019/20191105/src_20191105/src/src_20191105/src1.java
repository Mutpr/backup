package src_20191105;

public class src1 {
	public static void main(String args[]) {
		String strVar1 = "신민철"; //같은 string 객체에 strVar1 문자열 생성
		String strVar2 = "신민철"; //같은 string 객체에 strVar2 문자열 생성
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 과 strVar2 는 참조가 같음"); 
		} else {
			System.out.println("StrVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("StrVar1 과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3 와 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3 와 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3 와 strVar4는 문자열이 같음");
		}
	}

}
