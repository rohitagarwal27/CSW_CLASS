
class Car implements Comparable<Car> {
    private String model;
    private String color;
    private double speed;

    public Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    
    @Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", speed=" + speed + "]";
	}

    // Override compareTo() method to compare cars based on speed
    @Override
    public int compareTo(Car that) {
        if (this.speed < that.speed) {
            return -1;
        } else if (this.speed > that.speed) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class DriverCar {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Blue", 120.0);
        Car c2 = new Car("Maruti", "Red", 140.0);

        int Result = c1.compareTo(c2);
        if (Result < 0) {
            System.out.println("Car 2 has a greater speed");
            System.out.println(c2);
        } else if (Result > 0) {
            System.out.println("Car 1 has a greater speed.");
            System.out.println(c1);
        } else {
            System.out.println("Both have same speed.");
            System.out.println(c1);
            System.out.println(c2);
        }
    }
}
