
public class ArrayLengthExample {
	public static void main(String args[]) { 
		/**
		 * 자바 클래스로 프로그램을 실행하면 jvm은 길이가 0인 String 배열을 먼저 생성
		 * 메인 메소드를 호출할쨰 매개값으로 전달한다.
		 * 
		 */
		int [] scores = {83, 90, 87};
		int sum = 0;
		
		for(int i = 0; i<scores.length; i++) {
			sum+=scores[i];
		}
		
		System.out.println("총합: "+ sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("평균: "+avg);
	}

}
