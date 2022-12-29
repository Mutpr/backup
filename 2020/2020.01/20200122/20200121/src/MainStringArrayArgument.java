
public class MainStringArrayArgument {
	public static void main(String args[]) {
		/*
		 * (String args[]): java 클래스로 프로그램을 실행하면 
		 * JVM은 길이가 0인 *string 배열을 먼저 생성*하고 
		 * main() 메소드를 호출할때 매개값으로 전달한다.
		 * "java 클래스" 뒤에 공백으로 구분된 문자열 목록을 주고 실행하면 
		 * String 배열이 생성, main() 메소드를 호출할때 매개값으로 전달.
		 * main() 메소드는 string[] args 매개 변수를 통해서 커맨드 라인에서
		 * 입력된 데이터의 수와 입력된 데이터를 알 수 있게 됨.
		 */
		if(args.length != 2) { //입력된 데이터 갯수가 두개가 아닌 경우
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String StrNum1 = args[0]; //첫번째 데이터 얻기
		String StrNum2 = args[1]; //두번째 데이터 얻기
		
		int num1 = Integer.parseInt(StrNum1); //문자열을 정수로 전환
		int num2 = Integer.parseInt(StrNum2); //문자열을 정수로 전환
		
		int result = num1+num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
		//예제를 실행하면 매개값을 주지 않아 길이 0인 String 배열이 매개값으로 전달됨.
	}

}
