package src_20200207_Array;

public class ArrayLengthExample {
	public static void main (String args[]) {
		int [] scores = {80, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i]; 
			/*배열의 길이만큼 반복후 sum에 그 값을 전부 더한 값을 저장
			 * for문의 조건식에서 < 연산자를 사용한 이유는 배열의 마지막 인덱스가 1이 적기 때문이다
			*/
		}
		System.out.println("총합: "+sum); //다 더한 값을 출력
		
		double avg = (double) sum / scores.length; //다 더한 값을 배열 길이 만큼 나눔
		System.out.println("평균: "+avg); //평균값을 출력
	}
}
