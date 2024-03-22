// Generic method to print an Array of different types
public class GenericMethod {
	//generic method PrintArray
	public static<T> void printArray(T[] Arr) {
		//Display array elements
		for(T var:Arr)
			System.out.print(var+" ");
	}
	public static void main(String[] args) {
		//Create arrays of Integer, Double, & Character
		Integer[] intArr = {1,2,3,4,5};
		Double[] doubleArr = {1.1,2.2,3.3,4.4};
		Character[] charArr = {'H','E','L','L','O'};
		
		System.out.println("Integer Array Elements: ");
		printArray(intArr); // pass an Integer Array
		
		System.out.println("\nDouble Array Elements: ");
		printArray(doubleArr); // pass an Double Array
		
		System.out.println("\nCharacter Array Elements: ");
		printArray(charArr); // pass an Character Array
		
	}

}
