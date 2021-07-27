package ch02_4_console_in_out;

public class PrintfExample {

	public static void main(String[] args) {
		int V=1234;
		System.out.printf("상품의 가격:%d원\n",V);
		System.out.printf("상품의 가격:%6d원\n",V);
		System.out.printf("상품의 가격:%-6d원\n",V);
		System.out.printf("상품의 가격:%06d원\n",V);
		
		double area =3.14159 *10 *10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.4f", 10, area);
		
		String name = "고인정";
		String job = "주인님";
		//System.out.println(" %s %s\n" ,name,job);
	}

}
