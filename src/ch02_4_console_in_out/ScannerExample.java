package ch02_4_console_in_out;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner  =new Scanner(System.in);                           // ��ĳ�ʿ� ��� ctrl+shift +o �� ������ 3���� import���� ����ȴ�. ->�ý����Է���ġ�� �д� ����
		String inputdata;                                                   // �Է��� ���ڿ� ����.
 		
		while(true) {														// �ݺ����� �������� ������ ��� ĥ���ִ�
			inputdata = scanner.nextLine();									// ���͸� ġ�������� ����ϰ� ���͸� ġ�������� �Է��ߴ� ������ �������Ŀ� ����϶�� ����
			System.out.println("�Էµ� ���ڿ�:\""+inputdata+"\"");
			if(inputdata.equals("q")){                                   //���ǹ� ���ǿ��� �����ݷ��� ������ �ʴ´� . ���� ���������ε� ������ �ݺ����� �ٷ� ����
			break;														 //name.equals() �� String ���ڿ������� ����� �����⶧���� ��� int���̸� name==q�� �ؾ���
			
		}
	}
		System.out.println("����");
	}

}
