import java.io.*;
import java.util.*;


public class Main {
	public static int[] arr;
	public static StringBuilder sb =new StringBuilder();
    public static boolean[] visit;
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        arr=new int[b];
        visit=new boolean[a];
        dfs(a,b,0);
        System.out.print(sb);
        
    }   
    public static void dfs(int a,int b,int depth) {
    	  if (depth==b) {
    		for (int cnt:arr) {
    			sb.append(cnt).append(" ");
    		}
    		sb.append("\n");
    		return;
    	  }
    	  
    	  for (int i=0;i<a;i++) {
    		  if(visit[i]==false) {
    			  visit[i]=true;
    			  arr[depth]=i+1;
    			  dfs(a,b,depth+1);
    			  visit[i]=false;
    		  }
    	  }
    	  
    	  
    	
    }
}
