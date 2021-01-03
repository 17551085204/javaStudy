package 尚硅谷.java基础.day01_day05.day03;

/*
�����֮һ�����������
+ - + - * / % (ǰ)++ (��)++ (ǰ)-- (��)-- +


*/
class AriTest {
	public static void main(String[] args) {
		
		//���ţ�/
		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2;
		System.out.println(result1);//2

		int result2 = num1 / num2 * num2;
		System.out.println(result2);//10

		double result3 = num1 / num2;
		System.out.println(result3);//2.0

		double result4 = num1 / num2 + 0.0;//2.0
		double result5 = num1 / (num2 + 0.0);//2.4
		double result6 = (double)num1 / num2;//2.4
		double result7 = (double)(num1 / num2);//2.0
		System.out.println(result5);
		System.out.println(result6);

		// %:ȡ������
		//����ķ����뱻ģ���ķ�����ͬ
		//�����У�����ʹ��%���ж��ܷ񱻳����������
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);

		int m2 = -12;
		int n2 = 5;
		System.out.println("m2 % n2 = " + m2 % n2);

		int m3 = 12;
		int n3 = -5;
		System.out.println("m3 % n3 = " + m3 % n3);

		int m4 = -12;
		int n4 = -5;
		System.out.println("m4 % n4 = " + m4 % n4);
		
		
		//(ǰ)++ :������1��������
		//(��)++ :�����㣬������1
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ",b1 = " + b1);
		
		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ",b2 = " + b2);
		
		int a3 = 10;
		++a3;//a3++;
		int b3 = a3;
		
		//ע��㣺
		short s1 = 10;
		//s1 = s1 + 1;//����ʧ��
		//s1 = (short)(s1 + 1);//��ȷ��
		s1++;//����1����ı䱾���������������
		System.out.println(s1);

		//���⣺
		byte bb1 =127;
		bb1++;
		System.out.println("bb1 = " + bb1);

		//(ǰ)-- :���Լ�1��������
		//(��)-- :�����㣬���Լ�1
		
		int a4 = 10;
		int b4 = a4--;//int b4 = --a4;
		System.out.println("a4 = " + a4 + ",b4 = " + b4);

	}
}
