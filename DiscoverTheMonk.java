import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DiscoverTheMonk {
	
	static class FastScanner{
		BufferedReader sc;
		StringTokenizer st;
		
		public FastScanner(InputStream InputStream){
			st = new StringTokenizer("");
			sc = new BufferedReader(new InputStreamReader(InputStream));
		}
		public FastScanner(File f) throws FileNotFoundException{
			st = new StringTokenizer("");
			sc = new BufferedReader (new FileReader(f));
		}
		public int nextInt() throws IOException{
			if(st.hasMoreTokens())
				return Integer.parseInt(st.nextToken());
			else{
				st = new StringTokenizer(sc.readLine());
				return nextInt();
			}
		}


		public long nextLong() throws IOException{
			if(st.hasMoreTokens())
				return Long.parseLong(st.nextToken());
			else{
				st = new StringTokenizer(sc.readLine());
				return nextLong();
			}
		}

		public String readLine() throws IOException{
			return sc.readLine();
		}
		public void close() throws IOException{
			sc.close();
		}
	}
	

		
	static InputStream inputStream = System.in;
	static FastScanner sc = new FastScanner(inputStream); 
	static OutputStream outputStream = System.out;
	static PrintWriter ww = new PrintWriter(new OutputStreamWriter(outputStream));

	
	public static void main(String[] args) throws Exception {
		
		long N = sc.nextInt();
		long Q = sc.nextInt();
		int i=0;
		Set<Integer> st = new HashSet<Integer>();
		while (i < N) {
				st.add(sc.nextInt());
				i++;
		}
		
		while (Q-- > 0) {
			if ( st.contains(sc.nextInt()) )
				ww.println("YES");
			else
				ww.println("NO");
		}	
		sc.close();
		ww.close();
	}

}
