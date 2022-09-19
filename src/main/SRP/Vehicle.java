package main.SRP;

import java.util.Date;

/*
1- Single Responsibility Principle (Tek sorumluluk ilkesi)
Bir class yada metod yalnızca bir sorumlukluk almalıdır.
Örnek olarak Vehicle isimli bir class' ımız olsun
addToDatabase ve changeToName mototları yüzünden bu prensibe aykırıdır, class' ın yalnızca bir sorumluluğu olması gerekir
bunu düzeltmek için metotlar farklı bir class içinde olmalıdır..
 */

public class Vehicle {
    String name;
    Date yearOfProduction;
    // etc ...
    // constructor, getter and setters

    public void addToDatabase(Vehicle data){}

    public void changeToName(String name){}
}

class VehicleAdd{

    public void addToDatabase(Vehicle data){}
}

class VehicleChangeName{

    public void changeToName(Vehicle object, String name){}
}