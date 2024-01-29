import java.io.*;
import java.util.*;


public class Main {
	public static int[] arr;
	public static int a,b;
	public static StringBuilder sb =new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        arr=new int[b];
        dfs(1,0);
        System.out.print(sb);
        
    }   
    public static void dfs(int start,int depth) {
    	  	
    		if (depth==b) {
	    		for (int cnt:arr) {
	    			sb.append(cnt).append(" ");
	   			}	
	    		sb.append("\n");
	    		return;
    	  }
    		
    		for(int i=start;i<=a;i++) {
    			arr[depth]=i;
    			dfs(i+1,depth+1);
    		}
    	  
    	
    }
}
