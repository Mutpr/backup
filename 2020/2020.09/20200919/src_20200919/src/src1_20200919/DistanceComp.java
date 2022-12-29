package src1_20200919;

public class DistanceComp {
	
	public static Distance longDistance(Distance [] dist) {
		//통학거리가 가장 긴 객체
		Distance max = dist[0];
		for(int i = 0; i<=dist.length-1; i++) {
			if(max.getDist() < dist[i].getDist()) {
				max = dist[i];
			}
		}
		return max;
	}	

	public static Distance shortDistance(Distance[] dist) {
		Distance min = dist[0];
		//통학거리가 가장 짧은 객체
		for(int i = 0; i<=dist.length-1; i++) {
		if(min.getDist() > dist[i].getDist()) {
			min = dist[i];
		}
		}
		return min;
	}
}
