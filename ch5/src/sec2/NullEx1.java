package sec2;

public class NullEx1 {

	public static void main(String[] args) {
		//int a = null; �⺻���� null���� ���� �� ����.
		String b = null;
		int c = 20;
		int d = 20;
		System.out.println("c==d: "+(c==d));
		System.out.println("c==d: "+(c!=d));
		
		int[] e = {10,20,30};	//�������� ==�� !=�� ���� �� ���� : �ּҿ� �ּҸ� ���ϰ� �ǹǷ� ���� �ּҴ� ���� �� ����
		int[] f = {10,20,30};
		System.out.println("e==f : "+(e==f));
		System.out.println("e==f : "+(e!=f));
		
		System.out.println(e.equals(f));	//�������� �񱳴� �� �� �񱳸� equals�� �ؾ���
		
		String g= "kim";
		String h = "kim";
		System.out.println("g==h : "+(g==h));
		System.out.println("g==h : "+(g!=h));
		
		String i = new String("kim");	//new�� Ȱ���ϸ� �������� �ǹǷ� �ּҸ� ��
		String j = new String("kim");
		System.out.println("i==j"+(i==j));
		System.out.println("i==j"+(i!=j));
		System.out.println("i==j : "+i.equals(j));
	}

}