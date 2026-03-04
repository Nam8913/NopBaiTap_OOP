package buoi7;

import java.util.Date;

public class Program {
    public static void Main(String[] args)
    {
        Animal pig = new Pig();
        Animal cat = new Cat();
        Animal bird = new Bird();
        Animal dog = new Dog();

        pig.MakeSound();
        cat.MakeSound();
        bird.MakeSound();
        dog.MakeSound();

        XeDap xedap = new XeDap();
        xedap.run();
        XeDap xedien = new XeDapDien();
        xedien.run();

        //Test person
        Employee thuky = new Employee();
        thuky.setName("Nguyen Van A");
        thuky.setDate(new Date(100,0,15));
        thuky.setSalary(200000000);
        Manager quanly = new Manager();
        quanly.setName("Nguyen Thi B");
        quanly.setDate(new Date(100,0,15));
        quanly.setSalary(500000000);
        quanly.setAssistant(thuky);

        thuky.getDetails();
        quanly.getDetails();

        Bank bank1 = new SBI();
        Bank bank2 = new ICIC();
        Bank bank3 = new AXIS();

        bank1.ToString();
        bank2.ToString();
        bank3.ToString();

        Car car1 = new Ford();
        Car car2 = new Honda();
        Car car3 = new LandRover();

        car1.move();
        car2.move();
        car3.move();
    }
}
