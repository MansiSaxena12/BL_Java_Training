package OOPS.Inheritance;

public class Car extends Inheritance {
    private String modelName="Mustang";
    public static void main(String[] args) {
        Car c=new Car();
        c.honk();
        System.out.println(c.brand+" " + c.modelName);
    }
}
