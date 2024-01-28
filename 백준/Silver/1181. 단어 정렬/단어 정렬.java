import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] arr = new String[a];
        for (int i = 0; i < a ; i++) {
            arr[i] = br.readLine();
        }
        
        Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
			
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
			
				else {
					return s1.length() - s2.length();
				}
			}
			});
        
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]+"\n");
        for (int i = 1; i < a; i++) {
            if (!arr[i-1].equals(arr[i])) {
            	sb.append(arr[i]+"\n");
            }
        }
        System.out.print(sb);
    }
}
