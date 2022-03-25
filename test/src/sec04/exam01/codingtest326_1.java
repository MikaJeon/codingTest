package sec04.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class codingtest326_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		        
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        
		        String strmain = br.readLine();
		        StringTokenizer st = new StringTokenizer(strmain," ");
				int n = Integer.parseInt(st.nextToken());//몇 종류의 동전이 있는가
				int k = Integer.parseInt(st.nextToken());//필요 금액은 얼마인가
		        
		        int[] coin = new int[n];//동전 종류를 받을 배열
		        int result = 0;//필요 동전 갯수를 받을 변수
		        
		        for(int a=0; a<n; a++){
		            coin[a]=Integer.parseInt(br.readLine());
		        }
		        
		        for(int a=n-1; a>=0; a--){//필요 동전 갯수를 세기 위한 for문
		            int count = k/coin[a];//동전 몇개를 사용할 수 있는지
		            if(count<1){//사용할 수 있는게 없으면
		                continue;//이번 턴 패스
		            }
		            else{//사용할 수 있는게 있으면
		                result = result + count;//필요 동전 변수에 더하기
		                if(k%coin[a]==0){//필요 금액을 동전으로 모두 대체 가능하면
		                	System.out.println(result);
		                    break;//끝!
		                }
		                else{//대체 불가능하면
		                    k-=(count*coin[a]);//동전으로 충당한 금액만큼 필요 금액에서 제외
		                }
		            }
		       }
		 }
	}