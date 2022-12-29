package src_20200207_Array;

public class ArrayCopyByForExample {
	public static void main (String args[]) {
		int [] oldIntArray = {1,2,3};
		int [] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; //newIntArray의 값에 oldIntArray의 값을 넣어줌
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i]+","); //newIntArray의 값을 출력해줌
			//복사되는 항목과 복사하는 항목의 수가 같지 않으면 빈만큼 그 배열의 초기값으로 채워짐
		}
	}

}
