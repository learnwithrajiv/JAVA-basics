import java.util.Scanner;
public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 97, j, count = 0;
		String str = sc.nextLine();
		for (i = 65, j = 97; i < 91 && j < 123; i++, j++){
			if (str.indexOf((char)j) != -1)
				count++;
			else if (str.indexOf((char)i) != -1)
				count++;
		}
		if(count >= 26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

}
