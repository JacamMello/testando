package aplicattion;

public class BoxingUnboxingAndWrapperClass {
	public static void main(String[] args) {
		
		int x = 20;
		
		System.out.println(x);
									
		Integer obj = x;			//BOXING
		
		System.out.println(obj);
		
		int y =  obj;		//UNBOXING
		
		System.out.println(y);
		
		Integer n = 10;
		System.out.println(n);
		n += 10;
		System.out.println(n);
	}
}
