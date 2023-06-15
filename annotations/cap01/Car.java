package annotations.cap01;

public class Car {
    private String name;
    private double value;

    public Car(String name, double value) {
        this.name = name;
        this.value = value;
    }


    public Car() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
