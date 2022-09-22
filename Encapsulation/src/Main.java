import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo: Elevator
        /*Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("¬ведите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
         }*/
        //todo: imutable
        MailPackage pack = new MailPackage(10, 20, 10, 30, "Ul petra pavlova 8/16", false, 2233242,false);
        MailPackage pack2 = pack.copy();
        pack2 = pack2.chengeAdress("New Stret at my home");
        pack2 = pack2.chengeWeight(25);
        pack2 = pack2.chengeDimensions(12,13,14);
        System.out.println(pack.toString());
        System.out.println(pack2.toString());

    }
}
