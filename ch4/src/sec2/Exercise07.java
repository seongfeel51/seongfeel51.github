package sec2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		int code, money;
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------");
			System.out.println("����>");
			code = sc.nextInt();
			switch(code) {
				case 1:
					System.out.println("�Աݾ� : ");
					money = sc.nextInt();
					if(money>0) {
						balance += money;
						System.out.println(money+"�Ա� ó���Ǿ����ϴ�.");
					} else {
						System.out.println(money+"�� �Ա��� �Ұ����մϴ�.");
					}
					break;
				case 2:
					System.out.println("��ݾ� : ");
					money = sc.nextInt();
					if(money>0) {
						System.out.println("��ݿ������ �ܰ����� �� Ů�ϴ�");
					} else {
						balance -= money;
						System.out.println(money+"�� �Ա��� �Ұ����մϴ�.");
					}
					break;
				case 3:
					System.out.println();
					break;
				case 4:
					break;
				
			}
		}
		System.out.println("���α׷� ����");
	}

}