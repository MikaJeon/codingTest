package sec04.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codingtest326_2 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String strmain = br.readLine();
	    StringTokenizer st = new StringTokenizer(strmain," ");
		int n = Integer.parseInt(st.nextToken());//대회 참가 희망 여학생 수 
		int m = Integer.parseInt(st.nextToken());//대회 참가 희망 남학생 수
		int k = Integer.parseInt(st.nextToken());//인턴십 필요 학생 수
		br.close();
		
		int intern = n%2;//인턴 갈 학생을 담는 변수. 만약 여학생이 홀수면 1명이 담김. 짝수면 0명
		n-=(n%2);//희망 여학생이 홀수면 -1
		
		boolean done =  true;
		
		while(done) {
			if((n/2)>m) {//여학생이 남음
				int a = ((n/2)-m)*2;//남는 여학생 계산
				n-=a;//남는 인원을 대회 출전 희망 인원에서 제외
				intern+=a; //남는 여학생을 인턴으로
			}
			else if((n/2)<m) {//남학생이 남음
				int a = m-(n/2);// 남는 남학생 계산
				m-=a;//남는 남학생을 출전 희망 인원에서 제외
				intern += a;//남는 남학생을 인턴으로
			}
			else if((n/2)==m) {
				if(intern >= k) {//비율도 맞는데 필요 인턴도 만족 시
					System.out.println(m);
					done = false;//끝
				}
				else {//비율은 맞는데 필요 인턴이 0이 아님
					int j = k-intern;
					int need = j/3;
					n = n -(need*2)-(j%3);//출전 가능한 여학생 팀에서 인턴 갈 사람 뺌
					m-=need;//남학생 팀에서도 뺌
					intern += (need*2)+need+(j%3);//빠진 학생들을 인턴으로 보냄.
				}
			}
		}
	}
}
