package ch02_4_console_in_out;



public class ScannerExample2 {
	public static void main(String[] args) {
		int charC ='A';
		
		if((charC>=65)&&(charC<=90)) {
			System.out.println("�빮�ڱ���");
		}
		
		if((charC>=97)&&(charC<=122)) {
			System.out.println("�ҹ��ڱ���");
		}
		
		if(!(charC<48)&& !(charC>57)) {
			System.out.println("0~9 ���ڱ���");
		}
		
		int v=5;
		
		if((v%2==0)||(v%3==0)) {
			System.out.println("2�Ǵ� 3�� �������");
		}
		
		}
	
	}

