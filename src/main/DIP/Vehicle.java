package main.DIP;

/*
5- Dependency Inversion Principle (Bağımlılığı tersine çevirme ilkesi)
Sınıflar arası bağımlılıklar olabildiğince az olmalıdır özellikle üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır.
Alt sınıfta yapılan değişiklikler üst sınıfları etkilememelidir. Bu ilişkiler abstraction veya interface kullanarak sağlanmalıdır.
Örnekte araba ve motor sınıfları vardır. Her arabada motor olduğundan dolayı bizim arabamızdada motor bulunmaktadır.
Yani arabamız motor sınıfından bağımlıdır ancak motor soyut sınıf olduğu için böyle bir bağımlılık kabul edilemez. Bu yüzden DIP' e uymaz.
Kodumuz şu an için çalışıyor olsa da motor benzinli veya dizel olduğunda koda müdahale etmemiz gerecek bu da bize kodun hatalı olduğınu
ispat ediyor.
benzin ve dizel motoru olarak iki tane class oluşturup bunları motor interface'sinden implemente edersek bütün sorunu çözmüş oluruz. Eğer
başka bir motor eklemek istersek örneğin elektrikli motor bunun için tek yapmamız gerekn yeni bir class oluşturup onu engine den implemente etmek
böylelikle ana kodu değiştirmemiş oluruz.
 */

public class Vehicle {
}

class Car {
    public Engine engine;

    public Car(Engine e){
        engine = e;
    }

    public void start(){
        engine.start();
    }
}

abstract class Engine{

    public void start(){}
}

// Correct Code

interface NewEngine{

    public void start();
}

class PetrolEngine implements NewEngine{

    @Override
    public void start() {
        //
    }
}

class DieselEngine implements NewEngine{
    @Override
    public void start() {
        //
    }
}

class NewCar {
    NewEngine engine;

    public NewCar(NewEngine e){
        engine = e;
    }

    public void start (){
        engine.start();
    }
}