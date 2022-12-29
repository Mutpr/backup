public class ArrayCreateByNewExample {
	public static void main(String args[]) {
		int [] arr1 = new int[3]; //정수형 배열 생성
		for(int i = 0; i<3; i++) {
			System.out.println("arr1["+ i +"] :" + arr1[i] ); //배열에 값을 집어넣지 않았기 때문에 초기값 출력
		}
		
		arr1[0] = 10; //배열 0번째 자리에 숫자를 넣어줌
		arr1[1] = 20; //배열 1번째 자리에 숫자를 넣어줌
		arr1[2] = 30; //배열 2번째 자리에 숫자를 넣어줌
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]); //숫자를 집어넣은 배열 arr1의 값을 3번 출력함
		}
		
		double[] arr2 = new double[3]; //실수형 배열 생성
		for(int i = 0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]); //배열에 값을 집어넣지 않았기 때문에 초기값이 출력됨
		}
		arr2[0] = 0.1; //배열 0번째 자리에 값을 넣어줌
		arr2[1] = 0.2; //배열 1번째 자리에 값을 넣어줌
		arr2[2] = 0.3; //배열 2번째 자리에 값을 넣어줌
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]); //값을 집어넣은 실수형 배열 arr2의 값을 3번 출력함
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
	}

}
