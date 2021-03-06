package sec2;

public class NullEx1 {

	public static void main(String[] args) {
		//int a = null; 기본형은 null값을 가질 수 없다.
		String b = null;
		int c = 20;
		int d = 20;
		System.out.println("c==d: "+(c==d));
		System.out.println("c==d: "+(c!=d));
		
		int[] e = {10,20,30};	//참조형은 ==나 !=로 비교할 수 없음 : 주소와 주소를 비교하게 되므로 절대 주소는 같을 수 없다
		int[] f = {10,20,30};
		System.out.println("e==f : "+(e==f));
		System.out.println("e==f : "+(e!=f));
		
		System.out.println(e.equals(f));	//참조형은 비교는 각 각 비교를 equals로 해야함
		
		String g= "kim";
		String h = "kim";
		System.out.println("g==h : "+(g==h));
		System.out.println("g==h : "+(g!=h));
		
		String i = new String("kim");	//new를 활용하면 참조형이 되므로 주소를 비교
		String j = new String("kim");
		System.out.println("i==j"+(i==j));
		System.out.println("i==j"+(i!=j));
		System.out.println("i==j : "+i.equals(j));
	}

}
