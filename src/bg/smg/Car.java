package bg.smg;

public class Car implements Comparable<Car>{
    private int year;
    private String make;
    private String model;

    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public Car() {
        this.year = 0;
        this.make = "";
        this.model = "";
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car c2) {
        if(this.year> c2.year)
        {
            return 1;
        }
        else if(this.year< c2.year)
        {
            return -1;
        }
        return 0;
    }
}
