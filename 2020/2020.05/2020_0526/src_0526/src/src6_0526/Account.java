package src6_0526;

public class Account {
	String number;
	int balance;
	
	Account(String number, int balance){
		this.number=number;
		this.balance = balance;
		
		
	}
	void deposit(int money) { //¿‘±›
		balance += money;
		
	}
	
	boolean pay(int money) {//√‚±›
		boolean flag = false;
		if(money<balance) {
			balance -=money;
			flag = true;
		}
		return flag;
	}
	
	public String toString() {
		return "Account [∞Ë¡¬π¯»£ "+number+", ¿‹æ◊:= "+balance+"]";
	}
}
