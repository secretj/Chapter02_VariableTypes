package ch02_4_console_in_out;

public class PrintfExample {

	public static void main(String[] args) {
		int V=1234;
		System.out.printf("��ǰ�� ����:%d��\n",V);
		System.out.printf("��ǰ�� ����:%6d��\n",V);
		System.out.printf("��ǰ�� ����:%-6d��\n",V);
		System.out.printf("��ǰ�� ����:%06d��\n",V);
		
		double area =3.14159 *10 *10;
		System.out.printf("�������� %d�� ���� ����: %10.4f", 10, area);
		
		String name = "������";
		String job = "���δ�";
		//System.out.println(" %s %s\n" ,name,job);
	}

}
