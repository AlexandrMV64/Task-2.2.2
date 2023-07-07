package web.model;

public class Car {
    String model;
    String color;
    int age;

    public Car(String model, String color, int age) {
        this.color = color;
        this.age = age;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
