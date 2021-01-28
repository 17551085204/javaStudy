package 尚硅谷.java基础.day01_day05.day05;

import java.util.ArrayList;

/*
100以内的所有质数的输出。
质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除。

最小的质数是：2
*/
class PrimeNumberTest {
	public static void main(String[] args) {

		boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值

		for(int i = 2;i <= 100;i++){//遍历100以内的自然数


			for(int j = 2;j < i;j++){//j:被i去除

				if(i % j == 0){ //i被j除尽
					isFlag = false;
				}

			}
			//
			if(isFlag == true){
				System.out.println(i);
			}
			//重置isFlag
			isFlag = true;

		}

		System.out.println("----------------------");
		final ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		final ArrayList<Integer> integerArrayList1 = new ArrayList<Integer>();
		for (int i =2; i <= 100; i++) {
			if(isPrime(i)){
//				System.out.print(i+" ");
				integerArrayList.add(i);
			}
		}

		System.out.println(integerArrayList);
		for (int i = 1; i < integerArrayList.size(); i++) {
			integerArrayList1.add(integerArrayList.get(i)-integerArrayList.get(i-1));
		}
		System.out.println(integerArrayList1);


	}

	public static  boolean isPrime(int n){
		boolean flag=true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0){
				flag=false;
				break;
			}
		}
		return flag;

	}

}
