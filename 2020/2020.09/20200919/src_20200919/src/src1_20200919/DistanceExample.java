package src1_20200919;

import java.util.*;
public class DistanceExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 길이를 입력해주세요.>");
		Distance [] distance = new Distance[scan.nextInt()];
		String name;
		int dist;
		
		for(int i=0; i<distance.length; i++) {
			System.out.println((i+1)+"> 이름, 통학거리를 입력하세요.");
			
			name = scan.nextLine(); 
			dist = scan.nextInt();
			 
			distance[i] = new Distance(name,dist);
			
		}for(int i = 0; i<distance.length; i++) {
				name=distance[i].getName();
				dist=distance[i].getDist();
				distance[i].toString();
			}
		
		try {
			int number = scan.nextInt();
			System.out.println(number);
		} catch (Exception e) {
			System.out.println("정수만 입력하셔야합니다");
		}
			
				}

}
