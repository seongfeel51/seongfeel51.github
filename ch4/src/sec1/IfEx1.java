package sec1;
//��� : ���α׷��ֿ��� ���α׷��� �帧�� �����ϴ� ��
//���Ǻб⹮ : ���ǿ� ���� ���೻���� �޶����� �ϴ� ��
//if : if, if/else, if/elseif/else
//switch : switch/case
//�ݺ��� : ���α׷��ֻ� ���� ���๮���� ���� �� �����ϰ� �ϴ� ��
//for, while, do~while
//��Ÿ ���
//break, continue
public class IfEx1 {
	public static void main(String[] args) {
		int kor = 80;
		int eng = 90;
		int mat = 100;
		String name = "�强��";
		int tot = kor +eng + mat;
		String pass = "���հ�";
		//if(���ǽ�) {���๮}
		if(tot>=200) {
			pass = "�հ�";
		}
		//if (tot>=200) pass "�հ�"; - �� �ٷ� if�� ���
		//pass = (tot>=200) ? "�հ�" : "���հ�"; - ���� ������
		System.out.println("�հݿ��� : "+pass);
		//if(���ǽ�) {�����๮��;} else {�������๮��;}
		if(kor>=90 || eng>=90 || mat>=90) {
			System.out.println("��������");
		} else {
			System.out.println("���ƴ�");
		}
		if(kor>=90 && eng>=90 && mat>=90) {
			System.out.println("���л�");
		} else {
			System.out.println("�Ϲ��л�");
		}
		System.out.println("���� : ");
		if (tot>=270) {
			System.out.println("A");
		} else if(tot>=240) { //269~240
			System.out.println("B");
		} else if(tot>=210) { //239~210
			System.out.println("C");
		} else if (tot>=180) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		System.out.println("\n");
		if(tot>=270) {
			System.out.println("A");
			if(tot>=290) {
				System.out.println("+");
			} else if (tot>=280) {
				System.out.println("0");
			} else {
				System.out.println("-");
			}
		}
	}

}
