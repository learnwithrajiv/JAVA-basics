import java.util.Scanner;
public class AlternateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, temp;
		int t = sc.nextInt(), count;
		while (t > 0) {
			count = 0;
			str = sc.next();
			temp = str;
			while(temp.indexOf("AA") > -1 || temp.indexOf("BB") > -1) {
				if (temp.indexOf("AA") > -1){
					temp = temp.replaceAll("AA","A");
					count = str.length() - temp.length();
				}
				if (temp.indexOf("BB") > -1){
					temp = temp.replaceAll("BB","B");
					count = str.length() - temp.length();
				}
			}
			System.out.println(count);
			t--;
		}
	}
}
