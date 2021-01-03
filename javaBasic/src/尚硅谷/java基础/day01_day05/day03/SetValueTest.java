package 尚硅谷.java基础.day01_day05.day03;

/*
�����֮������ֵ�����
=  +=  -=  *=  /=  %= 


*/
class SetValueTest {
	public static void main(String[] args) {
		//��ֵ���ţ�=
		int i1 = 10;
		int j1 = 10;

		int i2,j2;
		//������ֵ
		i2 = j2 = 10;

		int i3 = 10,j3 = 20;
		
		//*********************
		int num1 = 10;
		num1 += 2;//num1 = num1 + 2;
		System.out.println(num1);//12

		int num2 = 12;
		num2 %= 5;//num2 = num2 % 5;
		System.out.println(num2);

		short s1 = 10;
		//s1 = s1 + 2;//����ʧ��
		s1 += 2;//���ۣ�����ı�����������������
		System.out.println(s1);

		//�����У����ϣ������ʵ��+2�Ĳ������м��ַ�����(ǰ�᣺int num = 10;)
		//��ʽһ��num = num + 2;
		//��ʽ����num += 2; (�Ƽ�)
		
		//�����У����ϣ������ʵ��+1�Ĳ������м��ַ�����(ǰ�᣺int num = 10;)
		//��ʽһ��num = num + 1;
		//��ʽ����num += 1; 
		//��ʽ����num++; (�Ƽ�)
		
		//��ϰ1
		int i = 1;
		i *= 0.1;
		System.out.println(i);//0
		i++;
		System.out.println(i);//1

		//��ϰ2
		int m = 2;
		int n = 3;
		n *= m++; //n = n * m++;	
		System.out.println("m=" + m);//3
		System.out.println("n=" + n);//6
		
		//��ϰ3
		int n1 = 10;
		n1 += (n1++) + (++n1);//n1 = n1 + (n1++) + (++n1);
		System.out.println(n1);//32

	}
}
