package src1_20200919;

public class DistanceComp {
	
	public static Distance longDistance(Distance [] dist) {
		//���аŸ��� ���� �� ��ü
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
		//���аŸ��� ���� ª�� ��ü
		for(int i = 0; i<=dist.length-1; i++) {
		if(min.getDist() > dist[i].getDist()) {
			min = dist[i];
		}
		}
		return min;
	}
}
