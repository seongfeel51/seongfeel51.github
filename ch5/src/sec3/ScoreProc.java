package sec3;

public class ScoreProc {

	public static void main(String[] args) {
		//2����
		String[] names = {"������", "�赿��", "�輺��", "���±�", "�ű�ȣ"};
		int[][] scores = {{30,75,100},{95,90,65},{80,85,95},{85,80,85},{70,90,80}};
		int[] tot = {0,0,0};					//��������
		float[] avg = {0.0f, 0.0f, 0.0f};	//�������
		int total = 0;						//
		float average = 0.0f;
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+"\t");
			for(int j=0; j<3; j++) {
				System.out.print(scores[i][j]+"\t");
				tot[j]+=scores[i][j];
			}
			System.out.print("\n");
		}
		for(int j =0;j<3;j++) {
			avg[j] = (float)tot[j] / names.length;
		}
		average = (float) total / names.length / 3;
		System.out.println("���� ����"+"\t");
	}

}