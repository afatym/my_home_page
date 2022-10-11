package hamoi.tower.afatym.game;

import java.util.Scanner;

 class GameStartMenuStart extends AbstractGameMenuItem{

    Scanner scanner = new Scanner(System.in);

    protected GameStartMenuStart(String id, String name) {
        super(id, name);
    }

    @Override
    protected void doItem() {
        System.out.print("New Game\n" +
                "Введите количество колец:");
        while (true) {

            String keyWrite = scanner.nextLine();
            if (!isDigit(keyWrite)) {
                System.out.print("Введено некорректное значение.\n" +
                        "Введите количество колец:");
            }else {
                System.out.println("Start game");
                break;
            }
        }
    }
    private boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
