package sec1;

public class Ex1 {
	public static void main(String[] args) {
		//���� : �ֱ����ġ �ȿ� �����͸� �ִ� ���� �ϳ��� �����ڰ� �̸��� �ο��Ͽ� �ʿ�� �����͸� ������ �� �ֵ��� 
		//�ϱ� ���� �������� �̸�
		String name;	//���� ����ÿ��� -> �ڷ��� ������;
		//�⺻ �ڷ���(primitive)
		name = "�强��";	//������ �ʱ�ȭ -> ������ = ���ͷ�
		char pass = 'y';		//������ ����� �ʱ�ȭ
		byte data1;		
		boolean data2;	//true false
		short SU1;
		int su1;		//����
		long su2;		
		float su3; 		//�Ҽ� 
		double su4;		
		//�׷��Ƿ� ������? �ϳ��� ���� ������ �� �ִ� �޸� ������ �̸��̴�.
		//�������� ��� ��Ģ
		// - ù ���ڴ� �������� �����ϴ� ���� ��Ģ�̳�, Ư������ �߿��� $(�޷�) �Ǵ� _(������ھ�)�� ������ ���� �ִ�.
		// - ���� ��ҹ��ڴ� ������ ���еǸ�, �������� ���ʻ� �ҹ��ڷ� ����, Ŭ���� �̸��� �빮�ڷ� �����Ѵ�.
		// - �ڹ��� ������ ����� �� ������, �ٸ� ���ڳ� ���ڸ� ȥ���Ͽ� ����ϱ⵵ �Ѵ�.
		// - �������̳� Ŭ�������� ���ʻ� �� �뵵�� ���� �� �� �ְ� ����� �ؾ��Ѵ�.
		// - �������̳� Ŭ������, �޼���� ���� ���� �ܾ �����Ͽ� ������ ���� ������ھ��� �Ǵ� ī������ Ȱ���Ѵ�.
		//(���� �ܾ �̾ ������ ���� �аų� �ǵ��ϱ� �����)
		//	-> JangSeongPil : ī����
		//	-> Jang_go_home : ������ھ���
		//����� : ������(private, public, protected, static, final),
		//�⺻ �ڷ��� ���� Ű����(char, byte, boolean, int, long, float, double)
		//������ ���� Ű����(Char, Byte, Boolean, Integer, Long, Float, Double)
		//Ŭ���� ���� ���� Ű����(class, abstract, inteface, extends, implements, enum)
		//��ü ���� Ű����(new, this ,super, instanceof, null)
		//��ɹ� Ű����(if, else, switch, case, for, while, break, continue)
		//��Ÿ Ű���� : true, false, void, return, try, catch, finally,throw, throws ��
		//���ͷ� : ������ ����Ǵ� ��, ����, ���ڿ�, ����(��,��,��), �Ǽ�(��,��), 2����, 8����, 16����
		String nickname = "�ƹ���";
		char nick1 = 'k';
		byte a = -128; 		//1byte=8bit=> -128 ~ -1, 0, 1 ~ 127
		short c = 32767;	//2byte=16bit=> -32768 ~ 32767
		int b = 250;		//4byte=32bit=> -2,147,483,648 ~ 2,147,483,647
		long d = 450; 		//8byte=64bit
		//�ε��Ҽ����� = �Ǽ�
		//�Ǽ��� ��ȣ��, ������, �����η� ������ ������
		float e = 36.245f; 	//4byte=32bit
		double f =36.245;	//8byte=64bit
		boolean g = true; 	//1bit=1byte
		char h = 'k';		//2byte
		//String i = 256;	-Ÿ�Կ���
		//int j = "wk";		-Ÿ�Կ���
		//���� ũ�� ���� 
		//1024byte(2�� 10��) = 1KB
		//1024KB = 1MB
		//1024MB = 1GB
		//1024GB = 1TB
		//1024TB = 1PB
		//1024PB = 1EB
		//KMGTPE
		int k1 = 0b1101;		//2���� ���ͷ� = 0b
		int k2 = 0123;			//8���� ���ͷ� = 01
		int k3 = 0x123;			//16���� ���ͷ� = 0x
		System.out.println("k1="+k1+" k2="+k2+" k3="+k3);
	}
}
