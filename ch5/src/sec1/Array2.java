package sec1;

public class Array2 {

	public static void main(String[] args) {
		int[] arr1 = {10,40,20,15,30};
		int[] arr2;
		//arr2 = {40,15,10,30,20};	������ ����
		arr2 = new int[] {40,15,10,30,20};
		
		String[] names = null;
		names = new String[] {"�赿��", "�輺��", "�迹��", "����ȣ", "������"};
		
		float[] arr3 = { 3.14f, 2.84f, 6.24f, 5.18f};
		
		int[] arr4 = new int[5];	//arr4[0]~~arr4[4] �� �ʱ�ȭ�� 0���� ��
		double[] arr5 = new double[5];
		for(int i=0; i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		for(int i=0; i<arr4.length;i++) {
			System.out.println(arr5[i]);
		}
//		�迭�� �ʱ�ȭ�� ���� ������, ������ 0, �Ǽ��� 0.0, ���ڿ��� NULL
	}
}