package sec1;

import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
	int edps, pl, db;
	Scanner sc = new Scanner(System.in);
	System.out.println("전산점수 입력 : ");
	edps = sc.nextInt();
	System.out.println("프로그래밍점수 입력 : ");
	pl = sc.nextInt();
	System.out.println("데이터베이스점수 입력 : ");
	db = sc.nextInt();
	int tot = (edps + pl + db) / 3;
	System.out.println("당신의 총점은 "+(edps+pl+db)+"점이며, 평균은 "+tot+"점입니다.");
	if(tot>=70) {
		System.out.print("합격 : ");
	} else {
		System.out.print("불합격 : ");
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
		System.out.println("특장학생");
	} else if(edps>=95 || pl>=95 || db>=95) {
		System.out.println("과목장학생");
	} else {
		System.out.println("일반학생");
	}
	}
}
