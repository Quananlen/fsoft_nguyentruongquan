package unit5_accessmodifier_staticmethod_staticproperty.thuc_hanh.StaticProperty;

public class Car {
    private String name;
    private String engine;
    public static int numbersOfCar=0;
    public Car (String name,String engine){
        this.name=name;
        this.engine=engine;
        numbersOfCar++;
    }
    public String getName() { return name; }
    public String getEngine() { return engine; }
    public static int getNumbersOfCar() { return numbersOfCar; }
    public void setName(String name) { this.name = name; }
    public void setEngine(String engine) { this.engine = engine; }
    public static void setNumbersOfCar(int numbersOfCar) { Car.numbersOfCar = numbersOfCar; }
}
