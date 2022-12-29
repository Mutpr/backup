package lector1;

public class AddressTest {
	public static void main(String [] args) {
		Address[] fns = new Address[10];
		int cnt =0;
		
		fns[cnt++] = new UnivAdd("LEE","Computer", "010-333-555");
		fns[cnt++] = new UnivAdd("SEO", "Electronics", "010-222-444");
		fns[cnt++] = new compAdd("YOON", "R&D 1", "02-123-999");
		fns[cnt++] = new compAdd("PARK", "R&D 2", "02-321-777");
		
		for(int i =0; i<cnt; i++) {
			fns[i].showInfo();
			System.out.println();
		}
	}
}
