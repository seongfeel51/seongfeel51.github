package sec1;

public class Array3 {

	public static void main(String[] args) {
		String[] names = {"�ƹ�", "�ų�", "�뷡", "����", "����"};
		//5���� 3���� ���� ���� jum[][]
		int[][] jum = {{100,80,90},{100,80,80},{100,70,80},{90,90,80},{70,70,60}};
		int hap = 0;
		float py = 0.0f;
		int[] tot = new int[3];
		float[] avg = new float[3];
		for(int i=0;i<=names.length;i++) {
			System.out.println(names[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.print(jum[i][j]+"\t");
			}
		}
	}

}