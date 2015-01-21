import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, numSize, res= 0;
		numSize = sc.nextInt();
		while(numSize > 0){
			num = sc.nextInt();
			res ^= num;
			--numSize;
		}
		System.out.println("\n" + res);
	}
}
