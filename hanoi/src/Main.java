import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����� ���������� � ��������� �����. ������� ���������� ����� ( �� ������ 3�):");
        Game game = new Game(scanner.nextInt());
    }
}
