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
				int n = Integer.parseInt(st.nextToken());//�� ������ ������ �ִ°�
				int k = Integer.parseInt(st.nextToken());//�ʿ� �ݾ��� ���ΰ�
		        
		        int[] coin = new int[n];//���� ������ ���� �迭
		        int result = 0;//�ʿ� ���� ������ ���� ����
		        
		        for(int a=0; a<n; a++){
		            coin[a]=Integer.parseInt(br.readLine());
		        }
		        
		        for(int a=n-1; a>=0; a--){//�ʿ� ���� ������ ���� ���� for��
		            int count = k/coin[a];//���� ��� ����� �� �ִ���
		            if(count<1){//����� �� �ִ°� ������
		                continue;//�̹� �� �н�
		            }
		            else{//����� �� �ִ°� ������
		                result = result + count;//�ʿ� ���� ������ ���ϱ�
		                if(k%coin[a]==0){//�ʿ� �ݾ��� �������� ��� ��ü �����ϸ�
		                	System.out.println(result);
		                    break;//��!
		                }
		                else{//��ü �Ұ����ϸ�
		                    k-=(count*coin[a]);//�������� ����� �ݾ׸�ŭ �ʿ� �ݾ׿��� ����
		                }
		            }
		       }
		 }
	}