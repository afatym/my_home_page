import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ƒобро пожаловать в ханойские башни. ¬ведите количество колец ( не меньше 3х):");
        Game game = new Game(scanner.nextInt());
    }
}
