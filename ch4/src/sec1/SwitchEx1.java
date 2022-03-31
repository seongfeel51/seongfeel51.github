package sec1;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		System.out.println("1입금, 2:출금, 3:조회 0:종료");
		System.out.println("작업할 번호를 입력 [0-3] : ");
		Scanner sc = new Scanner(System.in);
		int mode = sc.nextInt();
		
		switch(mode) {
		case 1:
			System.out.println("입금을 합니다.");
			break;
		case 2:
			System.out.println("출금을 합니다.");
			break;
		case 3:
			System.out.println("잔액을 조회합니다.");
			break;
		default:
			System.out.println("작업을 종료합니다.");
			break;
		}

	}

}
