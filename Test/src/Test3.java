
public class Test3 {

	public static void main(String[] args) {

	int i;
	int c1 = 0;
	int c2 = 0;
	int c3 = 0;
	int c4 = 0;
	int c5 = 0;
	int c6 = 0;
	int random;
	
	System.out.println("===== 50�� ������ �� ���� �ֻ��� �� ��� =====");
	for(i = 1; i <= 50; i++) {
		random = (int)(Math.random() * 6 + 1);
		switch(random) {
		case 1:
			c1++;
			break;
		case 2:
			c2++;
			break;
		case 3:
			c3++;
			break;
		case 4:
			c4++;
			break;
		case 5:
			c5++;
			break;
		case 6:
			c6++;
			break;
		}
		System.out.printf("%3d", random);
		if(i%10 == 0) {
			System.out.printf("\n");
		}
	}
	System.out.printf("\n");
	
	System.out.printf("�ֻ��� �� 1�� ���� Ƚ�� : %d\n", c1);
	System.out.printf("�ֻ��� �� 2�� ���� Ƚ�� : %d\n", c2);
	System.out.printf("�ֻ��� �� 3�� ���� Ƚ�� : %d\n", c3);
	System.out.printf("�ֻ��� �� 4�� ���� Ƚ�� : %d\n", c4);
	System.out.printf("�ֻ��� �� 5�� ���� Ƚ�� : %d\n", c5);
	System.out.printf("�ֻ��� �� 6�� ���� Ƚ�� : %d\n", c6);
		
	}

}
