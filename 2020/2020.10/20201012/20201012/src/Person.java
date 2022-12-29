
@FunctionalInterface
interface Vehicle{
	void run(int num);
}

public abstract class Person {
	String dept;
	Person(String dept){
		this.dept = dept;
	}
	void work() {
		System.out.println("출근합니다.");
	}
}
