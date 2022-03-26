package sec04.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class marge_2 {
	
	static int[][] first;
	static int[][] result;
	
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	      String strmain = br.readLine();
	      int num = Integer.parseInt(strmain);
	      first = new int[num][2];
	      result = new int[num][2];
	          
	      for(int i=0; i<num; i++){
	          String str = br.readLine();
	          StringTokenizer st = new StringTokenizer(str," ");
	          int x = Integer.parseInt(st.nextToken());
	          int y = Integer.parseInt(st.nextToken());
	          first[i][0]=x;
	          first[i][1]=y;
	      }
	      for(int i=0; i<num; i++) {
	    	  System.out.println(first[i][0]+" "+first[i][1]);
	      }
	      marge(0,num-1);
	      
	      
	      for(int i=0; i<num; i++) {
	    	  System.out.println(first[i][0]+" "+first[i][1]);
	      }
	}
          
      
      public static void marge(int start, int end) {
    	  
    	  if(start<end) {
    		  for(int i=start; i<=end; i++) {
    	    	  System.out.println("start"+start+ " end "+end+ "   "+first[i][0]+" "+first[i][1]);
    	    	  
    	      }System.out.println("============");
	    	  int mid = (start+end)/2;
	    	  
	    	  marge(start,mid);
	    	  marge(mid+1,end);
	    	  
	    	  int fpoint = start;
	    	  int spoint = mid+1;
	    	  int idx = fpoint;
	    	  
	    	  while(fpoint<=mid || spoint<=end) {
	    		  if(spoint>end||(fpoint<=mid && first[fpoint][0]<=first[spoint][0])) { 
	    			  if(spoint>end || first[fpoint][0]<first[spoint][0]) {
	    				  result[idx++] = first[fpoint++];
	    			  }
	    			  else if(first[fpoint][0]==first[spoint][0])
	    			  {
	    				  if(first[fpoint][1]<first[spoint][1]) {
	    					  result[idx++] = first[fpoint++];
	    				  }
	    				  else {
	    					  result[idx++] = first[spoint++];
	    				  }
	    			  }
	    		  }
	    		  else {
	    			  result[idx++] = first[spoint++];
	    		  }
	    	  }
	    	  for (int i=start;i<=end;i++) { 
	    		  first[i]=result[i]; 
	    		 }
	    	  for (int i=start;i<=end;i++) { 
	    		  System.out.println( first[i][0] + " " + first[i][1]);
	    		  
	    		 }System.out.println("------------------------");
	    	  
    	  }
      }
}
