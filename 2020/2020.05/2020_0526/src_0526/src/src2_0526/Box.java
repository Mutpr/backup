package src2_0526;

public class Box {
	//핃드구성 : 가로(int), 세로(int), 높이(int)
    //생성자 : 매개변수로 받은 값(가로, 세로, 높이)을  필드로 초기화
    //volume() 메소드 : 부피를 계산하여 출력, 매개변수와 반환 값 없음
	int garo;
	int sero;
	int height;
	
	void volume(){
		System.out.println(garo*sero*height);
	}
}
