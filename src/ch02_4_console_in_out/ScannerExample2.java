package ch02_4_console_in_out;



public class ScannerExample2 {
	public static void main(String[] args) {
		int charC ='A';
		
		if((charC>=65)&&(charC<=90)) {
			System.out.println("대문자군요");
		}
		
		if((charC>=97)&&(charC<=122)) {
			System.out.println("소문자군요");
		}
		
		if(!(charC<48)&& !(charC>57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int v=5;
		
		if((v%2==0)||(v%3==0)) {
			System.out.println("2또는 3의 배수군요");
		}
		
		}
	
	}

