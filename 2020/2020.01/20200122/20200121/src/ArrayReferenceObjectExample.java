public class ArrayReferenceObjectExample {
	public static void main(String[]args) {
		String [] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		//strArray[0]과 strArray[1]은 같은 주소값을 가지고 있음
		strArray[2] = new String("java");
		//strArray[2]는 strArray[0]과 strArray[1]과는 다른 주소값을 가짐
		
		System.out.println(strArray[0] == strArray[1]); //strArray[0]과 strArray[1]이 같은 주소값을 가지나요?
		System.out.println(strArray[0]==strArray[2]); //strArray[0]과 strArray[2]이 같은 주소값을 가지나요?
		System.out.println(strArray[0].equals(strArray[2]));//strArray[0]과 strArray[2]이 같은 내용을 가지고 있나요?
	}
}
