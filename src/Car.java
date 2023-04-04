public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}