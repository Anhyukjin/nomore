
public class Test2 {

	public static void main(String[] args) {

		int i;
		int j;
		
		for(i = 1; i <= 5; i++) {
			for(j = 0; j < 5-i; j++ ) {
				System.out.printf("%c", ' ');
			}
			for(j = 0; j < i; j++) {
				System.out.printf("%c", '*');
			}
			System.out.printf("\n");
		}
		
	}

}
