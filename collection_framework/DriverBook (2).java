
class Book {
	private int bId;
	private String bName;
	private double price;
	
	public Book(int bId, String bName, double price) {
		this.bId=bId;
		this.bName=bName;
		this.price=price;
	}

	public int getbId() {
		return bId;
	}

	public String getbName() {
		return bName;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", price=" + price + "]";
	}

	//public int hashCode() {
	//	return this.bId;
	//}
	public int hashCode() {
		return (int)(this.price);
	}

	//public boolean equals(Book that) {
	//	if((this.bId == that.bId) && (this.bName.equals(that.bName)) && (this.price == that.price))
	//		return true;
	//	else
	//		return false;
	//}
	public boolean equals(Book that) {
			if(this.price == that.price)
				return true;
			else
				return false;
	}
}
public class DriverBook {

	public static void main(String[] args) {
		Book b1 = new Book(1, "CSW", 700);
        Book b2 = new Book(2, "Java Development", 800);
        
        System.out.println("Book 1 and Book 2 are equal=" + b1.equals(b2));
        System.out.println("Book 1 hash code=" + b1.hashCode());
        System.out.println("Book 2 hash code=" + b2.hashCode());
        System.out.println("Book1 details: "+ b1);
        System.out.println("Book2 details: "+ b2);
	}
}
