package sec04.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 

public class binarySearch_01 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        StringTokenizer st = new StringTokenizer(str," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		long max = 0;
		
		int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
        	arr[i] = Integer.parseInt(br.readLine());
        	if(max<arr[i]) {
        		max = arr[i];
        	}
        }

        long low = 1;
        long mid=0;
       
        while(low<=max) {
        
        	long count = 0;
        	mid = (max + low)/2;
        	
        	for(int i=0;i<arr.length;i++) {
        		count += arr[i]/mid;
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
