package hashmap_21_03_24;
// Define a generic method sqr that accepts any numeric type T
public class genericclass<T>
 {
    private T t;
    public void setData(T t){
        this.t=t;
    }
    void display(){
        System.out.println(t);
    }
    public static void main(String[] args) {
        genericclass<Integer> a1 = new genericclass<Integer>();
        a1.setData(10);
        a1.display();
        genericclass<String> a2 = new genericclass<>();
        a2.setData("rama");
        a2.display();
        
    }
    
}
