package sec2;

public class Exercise03 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for(i=0; i<=100; i+=3) {
			sum += i;
		}
		System.out.println("3의 배수의 합: "+sum);
	}
}
