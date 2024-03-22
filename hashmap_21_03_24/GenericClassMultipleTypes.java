
public class GenericClassMultipleTypes<S,T> {
	S a;
	T b;
	public GenericClassMultipleTypes(S a, T b) {
		this.a=a;
		this.b=b;
	}
	public void show() {
		System.out.println("a="+ a +" b="+b);
	}

	public static void main(String[] args) {
		GenericClassMultipleTypes<Integer,String> obj1 = new GenericClassMultipleTypes<>(10,"Hello");
		obj1.show();
		GenericClassMultipleTypes<String,Boolean> obj2 = new GenericClassMultipleTypes<>("Covid +ve",false);
		obj2.show();

	}

}
