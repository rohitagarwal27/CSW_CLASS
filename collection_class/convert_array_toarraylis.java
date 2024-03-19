import java.util.*;

public class convert_array_toarraylis {
    public static void main(String[] args) {
        String arr[] = { "os", "cn", "ai" };
        System.out.println("converting array to arraylist");
        List<String> li = new ArrayList<>();
        li = Arrays.asList(arr);
        System.out.println("array list \n" + li);
    }
}
