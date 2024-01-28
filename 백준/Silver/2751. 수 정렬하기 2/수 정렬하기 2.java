import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb= new StringBuffer();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for (int i:arr) {
			sb.append(i+"\n");
	
		}
		System.out.print(sb);		
}
}