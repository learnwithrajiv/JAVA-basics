import java.util.Scanner;

public class MaxXOR {

    static int maxXor(int i, int j) {
        return (i^j);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l, r, max = 0, xor;
        l = in.nextInt();
        r = in.nextInt();
        for(int i = l; i <= r; i++)
        	for(int j = i; j <= r; j++){
        		xor = maxXor(i, j);
        		if(xor > max)
        			max = xor;
        	}
        System.out.println(max);
    }
}
