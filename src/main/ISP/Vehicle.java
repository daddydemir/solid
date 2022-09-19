package main.ISP;

/*
4- Interface Segregation Principle (Arayüz ayrımı ilkesi)
Sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz oluşturmayı tercih etmemizi söyleyen prensiptir.
Örnekte IVehicle isimli interface' de ride ve fly metotları vardır ancak bütün araçlar uçamaz yada sürülemezler bu yüzden ISP' ye aykırıdır.
Bunu düzeltmek için fly ve ride için ayrı interface oluşturmamız gerekiyor.
 */

public class Vehicle {
}

interface IVehicle {

    public void ride();

    public void fly();
}

class Car extends Vehicle implements IVehicle{

    @Override
    public void ride() {
        System.out.println("driving a Car.");
    }

    @Override
    public void fly() {
        // arabalar uçamaz !!!
    }
}

// Correct Code

interface Flayable {

    public void fly();
}

interface Ridable{

    public void ride();
}
// farklı interfaceler olması sayesinde hem uçabilen hemde sürülebilen bir araç olsaydı onu da implemente edebilirdik.
class Plane extends Vehicle implements Flayable{

    @Override
    public void fly() {
        System.out.println("flying a Plane.");
    }
}