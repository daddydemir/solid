package main.LSP;

/*
3- Liskov Substitution Principle (Liskov ikame  ilkesi)
Bu ilkeye göre bir class' ta bulunan öznitelikler kalıtım yoluyla aktarılan class' ta kullanılmayacaksa bu prensiple ter düşer.
Örnek olarak Vehicle isimli bir super class var ve ondan miras alan bir ship class' ı var ancak gemilerin tekeri olmadığı için
numberOfWheels özelliğini hiç bir zaman kullanmayacaktır. Bu sorunu çözmek için Vehicle içindeki numberOfWheels özniteliği kaldırılmalıdır.
 */

public class Vehicle {
    String name;
    int numberOfWheels;
}

class Ship extends Vehicle{}