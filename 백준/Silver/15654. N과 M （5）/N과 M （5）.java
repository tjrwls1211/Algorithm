import java.io.*;
import java.util.*;


public class Main {
	public static int[] arr;
	public static int[] arr2;
	public static boolean[] visit;
	public static int a,b;
	public static StringBuilder sb =new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        arr=new int[b];
        arr2=new int[a];
        visit=new boolean[a];
        st=new StringTokenizer(br.readLine());
        for (int i=0;i<a;i++) {
        	arr2[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr2);
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
  			  arr[depth]=arr2[i];
  			  dfs(a,b,depth+1);
  			  visit[i]=false;
  		  }
  	  }
  	  
  	  
  	
  }
}
