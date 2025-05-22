public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}


interface BasicCar {
    public void drive();

    public void xenonOn();

    public void xenonOff();
}
abstract class Audi implements BasicCar{
    final public int length=100;
    public void drive() {
        System.out.println("Audi riders"); // реализация
    }
    public void xenonOn() {
        System.out.println(" Audi xenon on");
    }
    public void xenonOf() {
    }
}
class CentralProfessional{ // класс центрального процессора
    private BasicCar Car; // принимается обьект интерфейса
    public CentralProfessional(BasicCar car) {
        this.Car = car;
    }
    public void work(){ // отвечает за управление
        Car.drive();
        Car.xenonOn();
        Car.xenonOff();
    }
}