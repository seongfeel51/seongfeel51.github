package sec1;

public class ByteEx {

	public static void main(String[] args) {
		//byte Ÿ���� ���� Ȱ��
		byte b1 = -128;
		byte b2 = 127; 		//ǥ�������� ������ ����(-128 ~ 127)
		byte b3 = 0;
		//byte b4 = 0b10011110; //127���� ũ�Ƿ� ǥ�������� ���
		//byte b5 = 0300; 	//192�̹Ƿ� ǥ�������� ���
		//byte b6 = 0x3f4; 	//127���� ŭ
		byte b7 = 0b101101;
		byte b8 = 0132;
		byte b9 = 0x3e;
		System.out.println("b1="+b1);
		System.out.println("b3="+b3);
		System.out.println("b7="+b7);
		System.out.println("b8="+b8);
		System.out.println("b9="+b9);
		System.out.println(0504);
		//���� ��ȯ
		//2���� 101101 -> 10���� 45
		//8���� 132 -> 10���� 90 => 1*64+3*8+2*1=90
		//16���� 3e -> 10���� 62 => 3*16+14*1=62
		
		//100
		//16	1
		// 6	4
		
		//324
		//64	1	
		// 5	4
		
		//2���� -> ��ǻ�Ͱ� �� �� �ֵ��� �Ϸ��� ���� �ڵ�� 2������ �ٲ������ �ϹǷ� �� ���� �����Ϸ���
		//8���� -> ���Ѽ���
		//owner(�����ۼ���) -> cont(�׷��̸�)
		//Administrator
		//Users
		//	r:4	w:2	x:1
		//		7		4		1
		//		������	�׷�		��Ÿ
		//4(100), 2(010), 1(001)
		//653 -> 110, 101, 011 -> 110101011
		System.out.println(0653);
		System.out.println(0b110101011);
		
		//10111110
		//be
		System.out.println(0b10111110);
		System.out.println(0xbe);
		
		//21�� �󸶸� ���ؾ��� 99�� �����°�? -> ����(78)
		// 50
		//-38 + 61 = 99
		// 12
		//50+61=111+1(10�� ����)=>112=>12
	}

}
