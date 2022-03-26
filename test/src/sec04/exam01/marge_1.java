package sec04.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class marge_1 {
	
	static int[] first;
	static int[] result;
	
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	      String strmain = br.readLine();
	      int num = Integer.parseInt(strmain);
	      first = new int[num];
	      result = new int[num];
	          
	      for(int i=0; i<num; i++){
	          String str = br.readLine();
	          first[i]=Integer.parseInt(str);
	      }
	      
	      marge(0,num-1);
	      
	      
	      for(int i=0; i<num; i++) {
	    	  System.out.println(result[i]);
	      }
	}
          
      
      public static void marge(int start, int end) {
    	  if(start<end) {
	    	  int mid = (start+end)/2;
	    	  
	    	  marge(start,mid);
	    	  marge(mid+1,end);
	    	  
	    	  int fpoint = start;
	    	  int spoint = mid+1;
	    	  int idx = fpoint;
	    	  
	    	  while(fpoint<=mid || spoint<=end) {
	    		  if(spoint>end||(fpoint<=mid && first[fpoint]<first[spoint])) {
	    			  result[idx++] = first[fpoint++];
	    		  }
	    		  else {
	    			  result[idx++] = first[spoint++];

	    		  }
	    			  
	    	  }
	    	  for (int i=start;i<=end;i++) { first[i]=result[i]; }

    	  }
  }

}
