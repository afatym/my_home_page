import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //todo factorial

/*        int value = new Scanner(System.in).nextInt();
        int result = value;
        for (int i = value-1; i > 1; i--) {
            result*= i;
            System.out.println(result);
        }
        System.out.println("Result: "+result);*/

        //todo circle

/*        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i++) {
            for (int j = value; j > 0; j--) {
                if (j*i == value) {
                    System.out.println(i+"*"+j);
                    break;
                }
            }
        }*/

        //todo SwimmingPool

/*        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int volumeEveryMinute = 0;
        int interation = 0;
        while (volumeEveryMinute< volume){
            volumeEveryMinute+=fillingSpeed - devastationSpeed;
            interation++;
        }
        System.out.println(volumeEveryMinute +"  "+ interation );*/

        //todo rand

/*        int value = new Random().nextInt(100);
        while (true) {
            System.out.print("Введите число:");
            int attempt = new Scanner(System.in).nextInt();
            if (attempt > value)
                System.out.println("Число больше необходимого");
            else if (attempt < value)
                System.out.println("Число меньше необходимого");
            else {
                System.out.println("число найдено");
                break;
            }
        }*/

    }
}