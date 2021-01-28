package 尚硅谷.java基础.day06_day18.day15.com.atguigu.java;

public class SingletonTest {
	public static void main(String[] args) {
		
		Bank bank1 = Bank.instance;
		
//		Bank.instance = null;
		Bank bank2 = Bank.instance;
		
		System.out.println(bank1 == bank2);
		
	}
}

class Bank{
	
	private Bank(){
		
	}
	
	public static final Bank instance = new Bank();
	
}
