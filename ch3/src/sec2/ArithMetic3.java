package sec2;

public class ArithMetic3 {

	public static void main(String[] args) {
		// NaN�� �˻�
		String indata = "NaN";
		String data1 = "500.4";
		double val = Double.valueOf(indata);	//��ȣ ���� ���� double Ÿ���� �Ǽ��� ����
		double data2 = 500.4;
		data2 += val;	//data2=500.4+NaN
		System.out.println("��� ��� : "+data2);
		
		data2 = 500.4;
		double val2 = Double.valueOf(data1);	//"500.4" -> 500.4
		data2 += val2;
		System.out.println("��� ��� : "+data2);
		
		
	}

}
