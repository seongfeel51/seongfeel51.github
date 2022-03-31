package sec3;

public class Exercise08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x%y;
		if(Double.isNaN(z)) {		//isNaN는 z가 NaN 값이면 =true NaN값이 아니면 =false
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과 : "+result);
		}
	}

}
//isDouble은 z가 double 타입의 데이터라면 =true 아니면 =false
//isInfinite z가 Infinite라면 =true 아니면 =false
