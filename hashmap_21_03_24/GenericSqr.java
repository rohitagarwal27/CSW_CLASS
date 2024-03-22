
public class GenericSqr {
    // Define a generic method sqr that accepts any numeric type T
    public static <T extends Number> double sqr(T a) {
        // Multiply 'a' by itself and return the result
        return a.doubleValue() * a.doubleValue();
    }

    // Example usage:
    public static void main(String[] args) {
        int result1 = (int)sqr(5); // Example with integer
        double result2 = sqr(2.5); // Example with double
        float result3 = (float)sqr(3.5f);// Example with float
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}


