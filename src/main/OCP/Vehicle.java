package main.OCP;

import java.util.Date;

/*
2- Open Closed Principle (Açık kapalı ilkesi)
Bu prensibe göre class' lar gelişime açık değişime kapalı olmalıdır.
Vehicle ve RepairToVehicle class' larımız var, RepairToVehicle sınıfındaki repair metodu araçları tiplerine göre ayırarak ona göre bir tamir
işlemi gerçekleştirmektedir.
Eğer farklı bir tipte araç eklemek istesek repair metoduna bir if koşulu daha yazmamız gerekecek. Ama bunun olması OCP prensibine aykırıdır çünkü;
metodu değiştirmiş oluyoruz. Bunun yerine Vehicle sınıfı içine bir repair metodu tanımlayıp Car, Ship isimli sınıflar oluşturup onları Vehicle'dan extends edip
repair metodunu ilgili sınıfta override edebiliriz. Böylelikle yeni tipte bir araç geldiğinde onun için Vehicle sınıfından extend ederek yeni aracı oluştururuz
böylelikle kodu değiştirmemiş oluruz.
 */

public class Vehicle {
    String name;
    Date yearOfProuction;
    String type;
    // type => Car, Ship, Motorcycle, etc

    // constructor , getter and setters

}

class RepairToVehicle {

    public String repair(Vehicle v) {

        if (v.type.equals("CAR")) {
            //
            return "Car is repaired.";

        } else if (v.type.equals("SHIP")) {
            //
            return "Ship is repaired.";
        } else {
            //
            return "Motorcycle is repaired.";
        }
    }
}

// Correct Code

class Vehicle1 {
    // fields, constructor, getter and setters

    public String repair(Vehicle1 v) {
        return "Vehicle is repaired.";
    }
}

class Car extends Vehicle1 {
    // fields, constructor, getter and setters

    @Override
    public String repair(Vehicle1 v) {
        return "Car is repaired.";
    }
}

// yeni araç eklendi ve ana kod değiştirilmedi.
class Tractor extends Vehicle1{
    // fields, constructor, getter and setters

    @Override
    public String repair(Vehicle1 v){
        return "Tractor is repaired";
    }
}