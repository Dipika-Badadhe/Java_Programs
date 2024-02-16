// Parent class
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int numOfDoors;

    public Car(String brand, int year, int numOfDoors) {
        super(brand, year);
        this.numOfDoors = numOfDoors;
    }

    public void display() {
        super.display();
        System.out.println("Number of doors: " + numOfDoors);
    }
}

// Main class to test inheritance
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", 2020);
        vehicle.display();

        System.out.println();

        Car car = new Car("Honda", 2022, 4);
        car.display();
    }
}
