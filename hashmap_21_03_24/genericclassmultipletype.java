package hashmap_21_03_24;

public class genericclassmultipletype<S,T> {
    private S a;
    private T b;
     
    public genericclassmultipletype(S a, T b) {
        this.a = a;
        this.b = b;
    }
    public void show(){
        System.out.println(a+ " "+ b+" ");
    }

    public static void main(String[] args) {
        genericclassmultipletype<Integer, String> obj1 = new genericclassmultipletype<Integer,String>(10, "hello");
        obj1.show();
        genericclassmultipletype<Integer, Boolean> obj2 = new genericclassmultipletype<>(10, true);
        obj2.show();
        
    }
}
