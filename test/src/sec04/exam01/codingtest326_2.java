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
		int n = Integer.parseInt(st.nextToken());//��ȸ ���� ��� ���л� �� 
		int m = Integer.parseInt(st.nextToken());//��ȸ ���� ��� ���л� ��
		int k = Integer.parseInt(st.nextToken());//���Ͻ� �ʿ� �л� ��
		br.close();
		
		int intern = n%2;//���� �� �л��� ��� ����. ���� ���л��� Ȧ���� 1���� ���. ¦���� 0��
		n-=(n%2);//��� ���л��� Ȧ���� -1
		
		boolean done =  true;
		
		while(done) {
			if((n/2)>m) {//���л��� ����
				int a = ((n/2)-m)*2;//���� ���л� ���
				n-=a;//���� �ο��� ��ȸ ���� ��� �ο����� ����
				intern+=a; //���� ���л��� ��������
			}
			else if((n/2)<m) {//���л��� ����
				int a = m-(n/2);// ���� ���л� ���
				m-=a;//���� ���л��� ���� ��� �ο����� ����
				intern += a;//���� ���л��� ��������
			}
			else if((n/2)==m) {
				if(intern >= k) {//������ �´µ� �ʿ� ���ϵ� ���� ��
					System.out.println(m);
					done = false;//��
				}
				else {//������ �´µ� �ʿ� ������ 0�� �ƴ�
					int j = k-intern;
					int need = j/3;
					n = n -(need*2)-(j%3);//���� ������ ���л� ������ ���� �� ��� ��
					m-=need;//���л� �������� ��
					intern += (need*2)+need+(j%3);//���� �л����� �������� ����.
				}
			}
		}
	}
}
