package sec1;

public class Logical1 {

	public static void main(String[] args) {
		//&&, ||, !, &, |, ^
		//32	16	8	4	2	1
		int a = 30;	//11110
		int b = 20;	//10100
		int c = 10;	//1010
		
		System.out.println("a�� b�� AND ���� : "+(a & b));		//��
		System.out.println("a�� b�� OR ���� : "+(a | b));		//��
		System.out.println("a�� b�� XOR ���� : "+(a ^ b));		//���� ������ �� 0
		System.out.println("~a -> ��Ʈ Not"+(~a));			//NOT(Complement) 30 -> -31 				
															//				  29 -> -30
		boolean d = true;
		boolean e = true;
		boolean f = false;
		//&&(AND)������ �Է°��� ��� ���� ���� ����� ��
		//�Է�1		�Է�2		���
		//true		true	true
		//true		false	false
		//false		true	false
		//false		false	false
		System.out.println("&& => AND������ ���1 : "+(d && e));
		System.out.println("&& => AND������ ���2 : "+(d && f));
		System.out.println("&& => AND������ ���3 : "+(f && d));
		System.out.println("&& => AND������ ���4 : "+(f && f));
		//||(OR)���� : ��� �ϳ��� �Է��� ���� ������, ��(true)
		//�Է�1		�Է�2		���
		//true		true	true
		//true		false	true
		//false		true	true
		//false		false	false
		System.out.println("|| => OR������ ���1 : "+(d || e));
		System.out.println("|| => OR������ ���2 : "+(d || f));
		System.out.println("|| => OR������ ���3 : "+(f || d));
		System.out.println("|| => OR������ ���4 : "+(f || f));
		//!(not) : �Էµ� ������ trues�� falss��, false�� true�� �ݴ�� ��ȯ
		//�Է�	���
		//true	false
		//false	true
		System.out.println(d+"! => NOT������ ���"+(!d));
		System.out.println(f+"! => NOT������ ���"+(!f));
	}

}
