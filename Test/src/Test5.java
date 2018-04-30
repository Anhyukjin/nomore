
public class Test5 {

	public static void main(String[] args) {

		int r = 0;
		int i;
		
		for (i = 0; r <= 5000; i++){
			r += i;
		}
		System.out.printf("가장큰 합 : %d그 때의 i 값 : %d", r-i, i-1);

		
	}

}
