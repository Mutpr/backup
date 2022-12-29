package src_20190802;

public class prac0802_1 {
	public static void main(String args[]) {
		
			
			int sum=0;
			
			for(int i=1; i<=100; i++) { //1에서 100까지의 반복문
				if(i%3==0) { //만약 i가 3으로 나눠서 나머지가 0이라면
					sum+=i; //sum에 i의 값을 넣어주고
				}
			} System.out.println("3의 배수의 합: "+sum); //더해진 3의 배수의 합을 집어넣어준다.
		}


	}
