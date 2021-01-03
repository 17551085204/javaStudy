package 尚硅谷.java基础.day01_day05.day03;

/*
��ϰ���������һ����λ������������ӡ��ʾ���ĸ�λ����ʮλ������λ����ֵ��
��ʽ���£�
����xxx��������£�
��λ����
ʮλ����
��λ����

���磺
����153��������£�
��λ����3
ʮλ����5
��λ����1

*/
class AriExer {
	public static void main(String[] args) {
		
		int num = 187;
		
		int bai = num / 100;
		int shi = num % 100 / 10;//int shi = num / 10 % 10;
		int ge = num % 10;
		
		System.out.println("��λΪ��" + bai);
		System.out.println("ʮλΪ��" + shi);
		System.out.println("��λΪ��" + ge);

	}
}
