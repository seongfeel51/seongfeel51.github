package sec1;

import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
	int edps, pl, db;
	Scanner sc = new Scanner(System.in);
	System.out.println("�������� �Է� : ");
	edps = sc.nextInt();
	System.out.println("���α׷������� �Է� : ");
	pl = sc.nextInt();
	System.out.println("�����ͺ��̽����� �Է� : ");
	db = sc.nextInt();
	int tot = (edps + pl + db) / 3;
	System.out.println("����� ������ "+(edps+pl+db)+"���̸�, ����� "+tot+"���Դϴ�.");
	if(tot>=70) {
		System.out.print("�հ� : ");
	} else {
		System.out.print("���հ� : ");
	}
	if(tot>=90) {
		System.out.print("A");
		if(tot>=98) {
			System.out.println("+");
		} else if(tot>=94) {
			System.out.println("0");
		} else if(tot>=90) {
			System.out.println("-");
		}
		
	}else if(tot>=80) {
		System.out.print("B");
		if(tot>=88) {
			System.out.println("+");
		} else if(tot>=84) {
			System.out.println("0");
		} else if(tot>=80) {
			System.out.println("-");
		}
	}else if(tot>=70) {
		System.out.print("C");
		if(tot>=78) {
			System.out.println("+");
		} else if(tot>=74) {
			System.out.println("0");
		} else if(tot>=70) {
			System.out.println("-");
		}
	}else if(tot>=60) {
		System.out.print("D");
		if(tot>=68) {
			System.out.println("+");
		} else if(tot>=64) {
			System.out.println("0");
		} else if(tot>=60) {
			System.out.println("-");
		}
	}else {
		System.out.print("F");
	}
	if(edps>=95 && pl>=95 && db>=95) {
		System.out.println("Ư���л�");
	} else if(edps>=95 || pl>=95 || db>=95) {
		System.out.println("�������л�");
	} else {
		System.out.println("�Ϲ��л�");
	}
	}
}
