package sec3;

public class Exercise08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x%y;
		if(Double.isNaN(z)) {		//isNaN�� z�� NaN ���̸� =true NaN���� �ƴϸ� =false
			System.out.println("0.0���� ���� �� �����ϴ�.");
		} else {
			double result = z + 10;
			System.out.println("��� : "+result);
		}
	}

}
//isDouble�� z�� double Ÿ���� �����Ͷ�� =true �ƴϸ� =false
//isInfinite z�� Infinite��� =true �ƴϸ� =false
