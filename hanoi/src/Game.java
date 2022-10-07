import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    private Map<Integer,Tower> towers = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    private int colHodov = 0;

    private boolean statusGame = true;

    public Game(int colBlinov) {
        towers.put(1,new Tower(colBlinov, true));
        towers.put(2,new Tower(colBlinov, false));
        towers.put(3,new Tower(colBlinov, false));
        startGame(colBlinov);
    }

    public void startGame( int colBlinov){
        while(statusGame){ //todo �������� ������� ������ � �������� ������ �� ������
            printPole();
            if (towers.get(1).towerIsEmpty()&& towers.get(2).towerIsEmpty()){
                statusGame = false;
                System.out.println("Game is over");
                if(this.colHodov!=colBlinov*2+1)
                    System.out.println("���������� ����� ������ ��� ���������� ����������� ���������� �����.\n� ���������� �� ��������...");
                else
                    System.out.println("���������� �����="+this.colHodov+".\n�� �������!");
                break;
            }
            System.out.println("����������� ���� ������ � ����� ����� �� ����� ����������");
            System.out.println("��������: 1 3");
            moveBlin(scanner.nextInt(),scanner.nextInt());
            this.colHodov++;
        }
    }

    private void printPole(){
        System.out.print("1||");
        towers.get(1).printTower();
        System.out.print("2||");
        towers.get(2).printTower();
        System.out.print("3||");
        towers.get(3).printTower();
    }

    private void moveBlin(int inTower, int outTower){
        if (!towers.get(inTower).towerIsEmpty()) {
            if (!towers.get(outTower).towerIsEmpty()) {
                if (towers.get(outTower).returnMinBlinId().getNumber() < towers.get(inTower).returnMinBlinId().getNumber()) {
                    System.out.println("� �� ���� �������� ������� ������� �� �������");
                } else {
                    towers.get(outTower).addBlinckir(towers.get(inTower).returnMinBlinId());
                    towers.get(inTower).removeBlinckir();
                }
            }
            else {
                towers.get(outTower).addBlinckir(towers.get(inTower).returnMinBlinId());
                towers.get(inTower).removeBlinckir();
            }
        }
        else{
            System.out.println("� ����� ��� ���������");
        }
    }
}
