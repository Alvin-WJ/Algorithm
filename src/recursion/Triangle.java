package recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Triangle {   //�õݹ��ʹ��if-else

	int row;
	int aggregate;;
	
	Triangle(int row){
		this.row = row;
	}

	public static int addition(int row) { //�ݹ�д������ִ�д����෴�Ĺ���
		int totol = 0;
		if(row == 1){           // �����Ǽ��������ۼӣ�һ���Ǵ�1��ʼ�ӡ�
			return 1;  
		}else{
			return addition(row - 1) + row;  //�ڶ���һ�����ڵ�һ���Ļ����ϴ�2��ʼ��
			//return addition(row - 1) * row;  �׳�
		}
	}

}
