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

interface BasicCarRus {
    public void drive();

    public void basicLightOn();

    public void basicLightOff();
}
class AudiRus implements BasicCarRus {
    final public int light=50;
    public void drive() {
        ;
        System.out.println("Audi riders");
    }
    public void basicLightOn() {
        System.out.println(" Audi light On");
    }
    public void basicLightOff() {
        System.out.println(" Audi Light Off");
    }
}