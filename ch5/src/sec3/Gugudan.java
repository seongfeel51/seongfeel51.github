package sec3;

public class Gugudan {

	public static void main(String[] args) {
		//구구단 출력 프로그램(이중 for문)
		/*
		 * 2*1=2 3*1=3 ... 9*1=9
		 * 2*2=4 3*2=6 .........
		 * 2*3=6 ...............
		 * ............... 9*9=81
		 */
		for(int i=2; i<10; i++) {
			for(int j=1; j<10;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println("\n");
		}

	}

}
