package 尚硅谷.java基础.day01_day05.day03;

/*
�����֮�����Ƚ������
==  !=  >  <  >= <=  instanceof

���ۣ�
1.�Ƚ�������Ľ����boolean����
2.���� ==  ��  = 
*/
class CompareTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;

		System.out.println(i == j);//false
		System.out.println(i = j);//20

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b2 == b1);//false
		System.out.println(b2 = b1);//true
	}
}
