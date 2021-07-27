package ch02_4_console_in_out;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner  =new Scanner(System.in);                           // 스캐너에 대고 ctrl+shift +o 를 누르면 3줄의 import문이 선언된다. ->시스템입력장치를 읽는 구문
		String inputdata;                                                   // 입력할 문자열 선언.
 		
		while(true) {														// 반복문을 만들어줘야 문장을 계속 칠수있다
			inputdata = scanner.nextLine();									// 엔터를 치기전까지 대기하고 엔터를 치기전까지 입력했던 내용을 엔터이후에 출력하라는 문장
			System.out.println("입력된 문자열:\""+inputdata+"\"");
			if(inputdata.equals("q")){                                   //조건문 조건에는 세미콜론을 붙이지 않는다 . 문장 종료조건인데 없으면 반복문이 바로 종료
			break;														 //name.equals() 는 String 문자열형으로 선언된 변수기때문에 사용 int형이면 name==q로 해야함
			
		}
	}
		System.out.println("종료");
	}

}
