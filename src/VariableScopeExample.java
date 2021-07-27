
public class VariableScopeExample {

	public static void main(String[] args) {
	    int v1=15;
		if(true) {
			int v2;
			v2=v1-10;
			int v3=v2+5;
			System.out.println(v3);
		}

	}

}
//범위안에 있는 변수만 시행가능.