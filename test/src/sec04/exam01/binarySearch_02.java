package sec04.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 

public class binarySearch_02 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        StringTokenizer st = new StringTokenizer(str," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int max = 0;
		
		int[] arr = new int[n];
		
		String a = br.readLine();
		StringTokenizer b = new StringTokenizer(a," ");
		
        for(int i = 0; i<arr.length; i++){
        	arr[i] = Integer.parseInt(b.nextToken());
        	if(max<arr[i]) {
        		max = arr[i];
        	}
        }

        int low = 0;
        int mid=0;
       
        while(low<=max) {
        
        	long count = 0;
        	mid = (max + low)/2;
        	
        	for(int i=0;i<arr.length;i++) {
        		if(arr[i]>mid) {
        			count += arr[i]-mid;
        		}
        	}
        	if(count>=k) {
        		low=mid+1;
        	}
        	else{
        		max = mid-1;
        	}
        }
        System.out.println(max);
	}
}
