package sec2;

public class AutoCasting1 {

	public static void main(String[] args) {
		byte a = 40;	//1byte 	
		short b = 40;	//2byte
		int c = 40;		//3byte
		long d = 40;	//8byte
		long k = 123456789123456789L;
		
		short s1 = a;	//�ڵ����� byte -> short �ڵ�����ȯ
		int i1 = a;		//�ڵ����� byte -> int �ڵ�����ȯ
		long l1 = a; 	//�ڵ����� byte -> long �ڵ�����ȯ
		
		//byte b2 = b; 	�����÷ο�
		int i2 = b;		//�ڵ����� short -> int �ڵ�����ȯ
		long l2 = b;	//�ڵ����� short -> long �ڵ�����ȯ
		
		//byte b3 = c;	�����÷ο�
		//short s3 = c; �����÷ο�
		long l3 = c;	//�ڵ�����ȯ
		
		//�� ū Ÿ���� �����ҿ� ���� ũ���� �����͸� ������ �� ������,
		//�� �� ���� ũ���� �����ʹ� ū ũ�� Ÿ������ �ڵ����� Ÿ���� ����
		
		float e = 256.278f;		//4byte
		double f = 256.278;		//8byte
		double g = 23456789.234567888789278;
		
		//float e1 = f;		�����÷ο�
		double d1 = e; 		//�ڵ�����ȯ
		
		char c1 = 'G';		//2byte
		byte k1 = 120;		//1byte
		System.out.println("c1="+c1);
		System.out.println("k1="+k1);
		
		//byte k2 = c1;		ũ�Ⱑ �޶� ĳ������ �ȵ�
		//char c2 = k1;		������ �޶� ĳ������ �ȵ�
		int j1 = c1;		//���� ������ �޶� ĳ������ �Ǵ� ����
		System.out.println("G1�� �ƽ�Ű�ڵ��ȣ j1 : "+j1);
		
		double d2 = l1;		//���� -> �Ǽ�(O)
		//long l4 = f;		//�Ǽ� -> ����(X)
		
		float avg = (float) (100+70+80) / 3;	//����ĳ����
		System.out.println("�� : "+avg);
		
		double sub = (float) (100+70+90) / 3;
		System.out.println(sub);
	}

}
