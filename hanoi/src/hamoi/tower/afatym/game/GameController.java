package hamoi.tower.afatym.game;

import java.util.Scanner;

public class GameController {
    private Scanner scanner = new Scanner(System.in);
    private Game game;
    private int numRing;
    private String keyWrite = null;
    boolean isExit = true;

    public GameController(){
        startMenu();
    }

    private void startMenu() {
        while (isExit) {
            System.out.print("1)New Game\n\n" +
                    "2)Rule\n\n" +
                    "3)Exit\n\n" +
                    "Введите номер пункта меню:");
            keyWrite = scanner.nextLine();
            switch (keyWrite) {
                case "1":
                    newGame();
                    break;
                case "2":
                    sayRule();
                    break;
                case "3":
                    isExit = false;
                    break;
                default:
                    System.out.println("Введена не корректная команда.");
            }
        }
    }

    private void newGame() {
        System.out.print("New Game\n" +
                "Введите количество колец:");
        while (true) {
            keyWrite = scanner.nextLine();
            if (!isDigit(keyWrite)) {
                System.out.print("Введено некорректное значение.\n" +
                        "Введите количество колец:");
            }else {
                numRing = Integer.parseInt(keyWrite);
                startGame();
                break;
            }
        }

    }

    private void startGame(){
        game = new Game(numRing);
        int movesCount = 0;
        while (!game.getEndGameStatus()){
            game.printGame();
            System.out.print("Введите ход например 13 для того чтобы передвинуть кольцо с 1 на 3 башню\n" +
                    "или команды restart, quit для выхода в гланое меню или перезапуска уровня:");
            keyWrite = scanner.nextLine();
            switch (keyWrite) {
                case "12","13","21","23","31","32": {
                    game.moveRing(Integer.parseInt(keyWrite) / 10, Integer.parseInt(keyWrite) % 10);
                    movesCount++;
                    break;
                }
                case "restart": {
                    game = new Game(numRing);
                    movesCount =0;
                    break;
                }
                case "quit": {
                    game = new Game(0);
                    movesCount =0;
                    break;
                }
                default:
                    System.out.println("Введена не корректная команда.");
            }
        }
        if(game.getEndGameStatus()&& movesCount!=0)
            System.out.println("Вы победили!\n" +
                    "Количество колец: " + numRing +
                    "\nКоличество ходов: " + movesCount + " из " + ((int)Math.pow(2,numRing)-1) + " возможных");
    }

    private boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private void sayRule(){
        System.out.println("Даны три стержня, на один из которых нанизаны кольца, которые отличаются размером и лежат меньшее на большем.\n" +
                "Задача состоит в том, чтобы перенести пирамиду из колец за наименьшее число ходов на третий стержень.\n" +
                "За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.");

    }
}
