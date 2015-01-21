import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		int t, cycles, length;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t > 0) {
			length = 1;
			cycles = sc.nextInt();
			if(cycles != 0){
				for(int i = 1; i <= cycles; i++) {
					if(i % 2 != 0)
						length *= 2;
					else
						length += 1;
				}
				System.out.println(length);
			}
			else
				System.out.println("1");
			t--;
		}
		sc.close();
	}
}
