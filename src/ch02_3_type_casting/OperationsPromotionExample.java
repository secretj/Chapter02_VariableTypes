package ch02_3_type_casting;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte bytev1=10;
		byte bytev2=20;
		int intv1=bytev1+bytev2;
		System.out.println(intv1);
		
		char charv1 = '°¡';
		char charv2 = 1;
		int intv2=charv1+charv2;
		System.out.println(intv2);
		
		int intv3=10;
		int intv4=intv3/4;
		System.out.println(intv4);
		
		int intv5=10;
		double doublev1=(double)intv5/4;
		System.out.println(doublev1);
		
		int x=1;
		int y=2;
		double result = (double)x/y;
		System.out.println(result);

	}

}
