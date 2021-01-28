package 尚硅谷.java基础.day06_day18.day10.com.atguigu.java;

public class Order {
	
	private int orderPrivate;
	int orderDefault;
	public int orderPublic;
	
	
	private void methodPrivate(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	void methodDefault(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	public void methodPublic(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	
}
