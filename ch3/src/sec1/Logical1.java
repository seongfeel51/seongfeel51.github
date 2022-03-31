package sec1;

public class Logical1 {

	public static void main(String[] args) {
		//&&, ||, !, &, |, ^
		//32	16	8	4	2	1
		int a = 30;	//11110
		int b = 20;	//10100
		int c = 10;	//1010
		
		System.out.println("a와 b의 AND 연산 : "+(a & b));		//합
		System.out.println("a와 b의 OR 연산 : "+(a | b));		//곱
		System.out.println("a와 b의 XOR 연산 : "+(a ^ b));		//같은 숫자일 때 0
		System.out.println("~a -> 비트 Not"+(~a));			//NOT(Complement) 30 -> -31 				
															//				  29 -> -30
		boolean d = true;
		boolean e = true;
		boolean f = false;
		//&&(AND)연산은 입력값이 모두 참일 때만 결과가 참
		//입력1		입력2		출력
		//true		true	true
		//true		false	false
		//false		true	false
		//false		false	false
		System.out.println("&& => AND연산의 결과1 : "+(d && e));
		System.out.println("&& => AND연산의 결과2 : "+(d && f));
		System.out.println("&& => AND연산의 결과3 : "+(f && d));
		System.out.println("&& => AND연산의 결과4 : "+(f && f));
		//||(OR)연산 : 어느 하나라도 입력이 참이 있으면, 참(true)
		//입력1		입력2		출력
		//true		true	true
		//true		false	true
		//false		true	true
		//false		false	false
		System.out.println("|| => OR연산의 결과1 : "+(d || e));
		System.out.println("|| => OR연산의 결과2 : "+(d || f));
		System.out.println("|| => OR연산의 결과3 : "+(f || d));
		System.out.println("|| => OR연산의 결과4 : "+(f || f));
		//!(not) : 입력된 논리값을 trues는 falss로, false는 true로 반대로 반환
		//입력	출력
		//true	false
		//false	true
		System.out.println(d+"! => NOT연산의 결과"+(!d));
		System.out.println(f+"! => NOT연산의 결과"+(!f));
	}

}
