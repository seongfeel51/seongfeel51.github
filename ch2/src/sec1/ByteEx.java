package sec1;

public class ByteEx {

	public static void main(String[] args) {
		//byte 타입의 변수 활용
		byte b1 = -128;
		byte b2 = 127; 		//표현범위에 속하지 않음(-128 ~ 127)
		byte b3 = 0;
		//byte b4 = 0b10011110; //127보다 크므로 표현범위를 벗어남
		//byte b5 = 0300; 	//192이므로 표현범위를 벗어남
		//byte b6 = 0x3f4; 	//127보다 큼
		byte b7 = 0b101101;
		byte b8 = 0132;
		byte b9 = 0x3e;
		System.out.println("b1="+b1);
		System.out.println("b3="+b3);
		System.out.println("b7="+b7);
		System.out.println("b8="+b8);
		System.out.println("b9="+b9);
		System.out.println(0504);
		//진법 변환
		//2진수 101101 -> 10진수 45
		//8진수 132 -> 10진수 90 => 1*64+3*8+2*1=90
		//16진수 3e -> 10진수 62 => 3*16+14*1=62
		
		//100
		//16	1
		// 6	4
		
		//324
		//64	1	
		// 5	4
		
		//2진수 -> 컴퓨터가 알 수 있도록 하려면 기계어 코드는 2진수로 바뀌어져야 하므로 그 것을 검토하려면
		//8진수 -> 권한설정
		//owner(파일작성자) -> cont(그룹이름)
		//Administrator
		//Users
		//	r:4	w:2	x:1
		//		7		4		1
		//		소유자	그룹		기타
		//4(100), 2(010), 1(001)
		//653 -> 110, 101, 011 -> 110101011
		System.out.println(0653);
		System.out.println(0b110101011);
		
		//10111110
		//be
		System.out.println(0b10111110);
		System.out.println(0xbe);
		
		//21에 얼마를 더해야지 99가 나오는가? -> 보수(78)
		// 50
		//-38 + 61 = 99
		// 12
		//50+61=111+1(10의 보수)=>112=>12
	}

}
