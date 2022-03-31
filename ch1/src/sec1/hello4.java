package sec1;

import java.util.Scanner;

public class hello4 {

	public static void main(String[] args) {
		//변수선언
		int kor; //국어점수 저장소
		int mat; //수학점수 저장소
		int eng; //영어점수 저장소
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력 : ");
		kor = sc.nextInt(); //입력한 내용을 정수로 저장
		System.out.println("수학점수 입력 : ");
		mat = sc.nextInt(); //입력한 내용을 정수로 저장
		System.out.println("영어점수 입력 : ");
		eng = sc.nextInt(); //입력한 내용을 정수로 저장
		//총점과 평균점수 도출
		System.out.println("당신의 총점은 "+(kor+mat+eng)+" 점이며, 평균은 "+(kor+mat+eng)/3+"점 입니다.");
		
		
	
		
		
		
		
		
		

	}

}
