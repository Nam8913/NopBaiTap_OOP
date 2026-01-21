public class Program {
    public static void Main(String[] args) {
        //Bai 1
        Circle cir = new Circle(2.0, "blue");
        cir.display();
        //Bai 2
        Rectangle rect = new Rectangle(3, 4);
        rect.display();
        //Bai 3
        Employee emp = new Employee(1, "Giang", "Nguyen", 50000);
        emp.display();
        //Bai 4
        Account acc1 = new Account("1ABC", "A", 1000);
        Account acc2 = new Account("2DEF", "B", 500);

        acc1.display();
        acc2.display();

        acc1.transferTo(acc2, 200);

        System.out.println("----");
        acc1.display();
        acc2.display();
        //Bai 5
        Date date = new Date(29, 2, 2020);
        System.out.println("Date: " + date.toString());
        System.out.println("La nam nhuan: " + date.isLeapYear());
    }
}
